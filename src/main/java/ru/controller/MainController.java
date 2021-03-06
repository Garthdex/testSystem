package ru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.model.Answer;
import ru.model.CompletedTest;
import ru.model.Question;
import ru.model.Test;
import ru.model.view.AnswerViewModel;
import ru.model.view.QuestionViewModel;
import ru.model.view.TestViewModel;
import ru.service.AnswerService;
import ru.service.CompletedTestService;
import ru.service.QuestionService;
import ru.service.TestService;
import ru.service.holder.UserHolder;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    private static final String ROLE = "role";
    private static final String LOGIN = "login";
    private static final String ID = "id";
    private static final String TEST_LIST = "testList";
    private static final String TEST_VIEW = "testView";

    @Autowired
    UserHolder userHolder;

    @Autowired
    private TestService testService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    @Autowired
    private CompletedTestService completedTestService;

    @RequestMapping("main")
    public String initData(Model model) {

        model.addAttribute(LOGIN, userHolder.getLogin());
        model.addAttribute(ROLE, userHolder.getRole());
        model.addAttribute(ID, userHolder.getId());
        model.addAttribute(TEST_LIST, testService.getTestList());
        return "page/main";
    }

    @RequestMapping("logout")
    public String logOut() {
        userHolder.setRole(null);
        userHolder.setLogin(null);
        userHolder.setId(0);
        return "redirect:/";
    }

    @RequestMapping("main/test")
    public String goTest(@RequestParam long idTest, Model model) {
        userHolder.setIdTest(idTest);
        List<QuestionViewModel> questionViewModel = new ArrayList<QuestionViewModel>();
        TestViewModel testViewModel = new TestViewModel();

        Test test = testService.getTestById(idTest);
        List<Question> questionList = questionService.getQuestionsByTestId(test.getId());
        for (Question question : questionList) {
            List<AnswerViewModel> answerViewModel = new ArrayList<AnswerViewModel>();
            List<Answer> answerList = answerService.getAnswersByQuestionId(question.getId());
            for (Answer answer : answerList) {
                answerViewModel.add(new AnswerViewModel(answer.getId(), answer.getName()));
            }
            questionViewModel.add(new QuestionViewModel(question.getId(), question.getName(), answerViewModel));
        }

        testViewModel.setId(test.getId());
        testViewModel.setName(test.getName());
        testViewModel.setQuestionViewModelList(questionViewModel);

        model.addAttribute(TEST_VIEW, testViewModel);
        return "page/test";
    }

    @RequestMapping("main/test/done")
    @ResponseBody
    public List<Integer> getAnswers(@RequestBody List<Integer> answers) {
        double correctAnswers = 0;
        double percentResult = 0;
        double sizeTest = (double) questionService.getQuestionsByTestId(userHolder.getIdTest()).size();

        for (int i = 0; i < answers.size(); i++) {
            if (answerService.getAnswerById(answers.get(i)).isCorrect()) {
                correctAnswers += 1;
            }
        }

        if (correctAnswers != 0) {
            percentResult = (correctAnswers / sizeTest) * 100;
        }

        completedTestService.setCompletedTest(new CompletedTest(userHolder.getIdTest(), userHolder.getId(), percentResult));

        userHolder.setIdTest(0);
        return answers;
    }

    @RequestMapping("main/getCompleteTest")
    @ResponseBody
    public CompletedTest getCompleteTest(@RequestBody CompletedTest result) {
        return completedTestService.getCompletedTestByIds(result.getIdCompletedTest(), result.getIdCompletedUser());
    }
}
