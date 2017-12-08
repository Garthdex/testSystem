package ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dao.CompletedTestDao;
import ru.model.CompletedTest;

@Service
public class CompletedTestService {

    @Autowired
    private CompletedTestDao completedTestDao;
    public void setUserDao(CompletedTestDao completedTestDao) {
        this.completedTestDao = completedTestDao;
    }

    @Transactional
    public void setCompletedTest(CompletedTest completedTest) {
        this.completedTestDao.setCompletedTest(completedTest);
    }

    @Transactional
    public CompletedTest getCompletedTestByIds(long idCompletedTest, long idCompletedUser) {
        return this.completedTestDao.getCompletedTestByIds(idCompletedTest, idCompletedUser);
    }
}
