package ru.service.holder;

import org.springframework.stereotype.Service;

@Service
public class UserHolder {
    private String login;
    private String role;

    public UserHolder() {
    }

    public UserHolder(String login, String role) {
        this.login = login;
        this.role = role;
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
}
