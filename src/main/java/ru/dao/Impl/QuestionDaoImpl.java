package ru.dao.Impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.dao.QuestionDao;
import ru.model.Question;

import java.util.List;

@Repository
public class QuestionDaoImpl implements QuestionDao {

    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Question> getQuestionsByTestId(long idTest) {
        Session session = this.sessionFactory.getCurrentSession();

        String sql = "from ru.model.Question";
        sql += " where id_test = " + idTest;

        Query query = session.createQuery(sql);
        List<Question> questionList = query.list();

        return questionList;
    }
}
