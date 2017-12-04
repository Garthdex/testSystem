package ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dao.QuestionDao;
import ru.model.Question;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionDao questionDao;
    public void setUserDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    @Transactional
    public List<Question> getQuestionsByTestId(long idTest) {
        return this.questionDao.getQuestionsByTestId(idTest);
    }
}
