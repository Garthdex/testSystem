package ru.service.holder;

import org.springframework.stereotype.Service;

@Service
public class UserHolder {
    private long id;
    private String login;
    private String role;
    private long idTest;

    public UserHolder() {
    }

    public UserHolder(long id, String login, String role, long idTest) {
        this.id = id;
        this.login = login;
        this.role = role;
        this.idTest = idTest;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getIdTest() {
        return idTest;
    }

    public void setIdTest(long idTest) {
        this.idTest = idTest;
    }
}
