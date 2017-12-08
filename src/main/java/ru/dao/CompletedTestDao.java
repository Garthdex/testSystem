package ru.dao;

import ru.model.CompletedTest;

public interface CompletedTestDao {
    public void setCompletedTest(CompletedTest completedTest);
    public CompletedTest getCompletedTestByIds(long idCompletedTest, long idCompletedUser);
}
