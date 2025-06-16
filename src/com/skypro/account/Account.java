package com.skypro.account;

public abstract class Account {
    protected String name;
    protected int balance;

    public int priority = 5;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    //метод изменения баланса
    public void changeBalance(int amount) {
        this.balance = balance + amount;
    }

    public static void diskription() {
        System.out.println("Базовый аккаунт");
    }

    @Override
    public String toString() {
        return "Аккаунт " + name + " имеет " + balance;
    }

    public abstract void getAllFunds();

    //внутри тела вызываются два абстрактных метода
    public void validateAccount(){
        validateOrigin();
        validateTransaction();
    }
    //проверка транзакций нашего аккаунта
    protected abstract  void validateTransaction();
//проверить владельца аккаунта
    protected  abstract void validateOrigin();
}
