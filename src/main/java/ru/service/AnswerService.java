package ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dao.AnswerDao;
import ru.model.Answer;

import java.util.List;

@Service
public class AnswerService {

    @Autowired
    private AnswerDao answerDao;
    public void setUserDao(AnswerDao answerDao) {
        this.answerDao = answerDao;
    }

    @Transactional
    public List<Answer> getAnswersByQuestionId(long idQuestion) {
        return this.answerDao.getAnswersByQuestionId(idQuestion);
    }
}
