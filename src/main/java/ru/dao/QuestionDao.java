package ru.dao;

import ru.model.Question;

import java.util.List;

public interface QuestionDao {
    public List<Question> getQuestionsByTestId(long idTest);
}
