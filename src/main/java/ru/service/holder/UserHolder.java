package ru.service.holder;

import org.springframework.stereotype.Service;

@Service
public class UserHolder {
    private long id;
    private String role;

    public UserHolder() {
    }

    public UserHolder(long id, String role) {
        this.id = id;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
