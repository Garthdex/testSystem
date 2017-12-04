package ru.dao.Impl;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.model.User;
import ru.dao.UserDao;


import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
    }

    public void updateUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(user);
    }

    public void deleteUser(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User)session.load(User.class, new Long(id));

        if (user != null) {
            session.delete(user);
        }
    }

    public User getUserById(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User)session.load(User.class, new Long(id));

        return user;
    }

    public User getUserByLogin(String login) {
        Session session = this.sessionFactory.getCurrentSession();
        User user;
        Criteria userCriteria = session.createCriteria(User.class);
        userCriteria.add(Restrictions.eq("login", login));
        user = (User) userCriteria.uniqueResult();

        return user;
    }

    @SuppressWarnings(value = "unchecked")
    public List<User> getUserList() {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from ru.model.User");
        List<User> userList = query.list();

        return userList;
    }
}
