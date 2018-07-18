package com.hellofresh.data;

public class User {
    private String email;
    private String password;

    public User() {
    }

    private User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User getUser() {
        return new User("user@hellofersh.com", "qwerty");
    }
}