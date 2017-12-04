package ru.dao;

import ru.model.Test;

import java.util.List;

public interface TestDao {
    public void addTest(Test test);

    public void updateTest(Test test);

    public void deleteTest(long id);

    public Test getTestById(long id);

    public List<Test> getTestList();
}
