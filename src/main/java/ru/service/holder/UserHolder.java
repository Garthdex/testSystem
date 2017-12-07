package ru.service.holder;

import org.springframework.stereotype.Service;

@Service
public class UserHolder {
    private String login;
    private String role;
    private long idTest;

    public UserHolder() {
    }

    public UserHolder(String login, String role, long idTest) {
        this.login = login;
        this.role = role;
        this.idTest = idTest;
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
