package ru.dao.Impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.dao.AnswerDao;
import ru.model.Answer;

import java.util.List;

@Repository
public class AnswerDaoImpl implements AnswerDao {

    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Answer> getAnswersByQuestionId(long idQuestion) {
        Session session = this.sessionFactory.getCurrentSession();

        String sql = "from ru.model.Answer";
        sql += " where id_question = " + idQuestion;

        Query query = session.createQuery(sql);
        List<Answer> answerList = query.list();

        return answerList;
    }

    public Answer getAnswerById(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Answer answer = (Answer)session.get(Answer.class, new Long(id));

        return answer;
    }
}
