package ru.model.view;

import java.util.List;

public class QuestionViewModel {
    private long id;
    private String name;
    private List<AnswerViewModel> answerViewModelList;

    public QuestionViewModel() {
    }

    public QuestionViewModel(long id, String name, List<AnswerViewModel> answerViewModelList) {
        this.id = id;
        this.name = name;
        this.answerViewModelList = answerViewModelList;
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

    public List<AnswerViewModel> getAnswerViewModelList() {
        return answerViewModelList;
    }

    public void setAnswerViewModelList(List<AnswerViewModel> answerViewModelList) {
        this.answerViewModelList = answerViewModelList;
    }
}
