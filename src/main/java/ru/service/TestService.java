package ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dao.TestDao;
import ru.model.Test;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;
    public void setUserDao(TestDao testDao) {
        this.testDao = testDao;
    }

    @Transactional
    public void addTest(Test test) {
        this.testDao.addTest(test);
    }

    @Transactional
    public void updateTest(Test test) {
        this.testDao.updateTest(test);
    }

    @Transactional
    public void deleteTest(long id) {
        this.testDao.deleteTest(id);
    }

    @Transactional
    public Test getTestById(long id) {
        return this.testDao.getTestById(id);
    }

    @Transactional
    public List<Test> getTestList() {
        return this.testDao.getTestList();
    }
}
