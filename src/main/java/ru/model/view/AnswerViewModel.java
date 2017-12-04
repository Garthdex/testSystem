package ru.model.view;

import ru.model.Answer;

import java.util.List;

public class AnswerViewModel {
    private long id;
    private String name;

    public AnswerViewModel() {
    }

    public AnswerViewModel(long id, String name) {
        this.id = id;
        this.name = name;
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
}
