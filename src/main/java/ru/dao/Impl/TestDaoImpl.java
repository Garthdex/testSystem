package ru.dao.Impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.dao.TestDao;
import ru.model.Test;

import java.util.List;

@Repository
public class TestDaoImpl implements TestDao {

    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addTest(Test test) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(test);
    }

    public void updateTest(Test test) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(test);
    }

    public void deleteTest(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Test test = (Test)session.load(Test.class, new Long(id));

        if (test != null) {
            session.delete(test);
        }
    }

    public Test getTestById(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Test test = (Test)session.load(Test.class, new Long(id));

        return test;
    }

    @SuppressWarnings(value = "unchecked")
    public List<Test> getTestList() {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from ru.model.Test");
        List<Test> testList = query.list();

        return testList;
    }
}
