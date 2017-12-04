package ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.model.User;
import ru.dao.UserDao;

import java.util.List;

/**
 * Created by Anton on 29.10.2017.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Transactional
    public User updateUser(User user) {
        this.userDao.updateUser(user);

        return user;
    }

    @Transactional
    public User deleteUser(long id) {
        User user = getUserById(id);
        this.userDao.deleteUser(id);

        return user;
    }

    @Transactional
    public User getUserById(long id) {
        return this.userDao.getUserById(id);
    }

    @Transactional
    public User getUserByLogin(String login) {
        return this.userDao.getUserByLogin(login);
    }

    @Transactional
    public List<User> getUserList() {
        return this.userDao.getUserList();
    }
}
