package com.skypro;

import com.skypro.account.Account;
import com.skypro.account.bonus.BonusAccount;

public class JavaProfMain {

    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");

        Account ivan = new Account("Ivan",100);
        System.out.println(ivan);

        BonusAccount petr = new BonusAccount("Petr",50,150);
        System.out.println(petr);
    }

}
