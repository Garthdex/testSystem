package ru.dao;

import ru.model.Answer;

import java.util.List;

public interface AnswerDao {
    public List<Answer> getAnswersByQuestionId(long idQuestion);
    public Answer getAnswerById(long id);
}
