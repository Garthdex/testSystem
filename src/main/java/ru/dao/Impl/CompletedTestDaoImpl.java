package ru.dao.Impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.dao.CompletedTestDao;
import ru.model.CompletedTest;

@Repository
public class CompletedTestDaoImpl implements CompletedTestDao {

    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setCompletedTest(CompletedTest completedTest) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(completedTest);
    }

    public CompletedTest getCompletedTestByIds(long idCompletedTest, long idCompletedUser) {
        Session session = this.sessionFactory.getCurrentSession();

        String sql = "from ru.model.CompletedTest";
        sql += " where id_test = " + idCompletedTest + " and id_user = " + idCompletedUser;

        Query query = session.createQuery(sql);
        CompletedTest completedTest = (CompletedTest) query.list().get(0);

        return completedTest;
    }
}
