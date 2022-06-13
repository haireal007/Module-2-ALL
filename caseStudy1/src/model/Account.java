package model;

import java.io.Serializable;

public class Account implements Serializable {
    private String userName;
    private String pass;
    private String role;
    private int number;
    private double money;

    public Account() {
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

    public double getMoney(double money) {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Account(String userName, String pass, String role, int number, double money) {
        this.userName = userName;
        this.pass = pass;
        this.role = role;
        this.number = number;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", pass='" + pass + '\'' +
                ", role='" + role + '\'' +
                ", number=" + number +
                ", money=" + money +
                '}';
    }
}
