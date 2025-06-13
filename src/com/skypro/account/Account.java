package com.skypro.account;

public class Account {
    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    //метод изменения баланса
    public void changeBalance(int amount) {
        this.balance = balance + amount;
    }

    @Override
    public String toString() {
        return "Аккаунт " + name + " имеет " + balance;
    }
}
