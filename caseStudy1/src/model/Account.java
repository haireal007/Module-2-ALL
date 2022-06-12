package model;

import java.io.Serializable;

public class Account implements Serializable {
    private String userName;
    private String pass;
    private String role;
    private int number;

    public Account() {
    }

    public Account(String userName, String pass, String role, int number) {
        this.userName = userName;
        this.pass = pass;
        this.role = role;
        this.number = number;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", pass='" + pass + '\'' +
                ", role='" + role + '\'' +
                ", number=" + number +
                '}';
    }
}
