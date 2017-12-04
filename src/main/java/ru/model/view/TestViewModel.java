package ru.model.view;

import java.util.List;

public class TestViewModel {
    private long id;
    private String name;
    private List<QuestionViewModel> questionViewModelList;

    public TestViewModel() {
    }

    public TestViewModel(long id, String name, List<QuestionViewModel> questionViewModelList) {
        this.id = id;
        this.name = name;
        this.questionViewModelList = questionViewModelList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<QuestionViewModel> getQuestionViewModelList() {
        return questionViewModelList;
    }

    public void setQuestionViewModelList(List<QuestionViewModel> questionViewModelList) {
        this.questionViewModelList = questionViewModelList;
    }
}
