package com.skypro.account;

public class BonusAccount {

    private  String name;
    private int balance;
    private int bonuses;

    public BonusAccount(String name, int balance, int bonuses) {
        this.name = name;
        this.balance = balance;
        this.bonuses = bonuses;
    }

    public void changeBalance(int amount) {
        this.balance = balance + amount;
    }

    @Override
    public String toString() {
        return "Аккаунт " + name + " имеет " + balance + " и " + bonuses + " бонусов";
    }
}
