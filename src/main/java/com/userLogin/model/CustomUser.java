package com.userLogin.model;

public class CustomUser {

    private Long id;

    private String username;

    private String password;

    private int active;

    private String roles = "";

    private String permissions = "";

    public CustomUser(Long id, String username, String password, String roles, String permissions){
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.permissions = permissions;
        this.active = 1;
    }

    protected CustomUser(){}

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getActive() {
        return active;
    }

    public String getRoles() {
        return roles;
    }

    public String getPermissions() {
        return permissions;
    }
}