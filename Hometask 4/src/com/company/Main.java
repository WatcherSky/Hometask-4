package com.company;

public class Main {

    public static void main(String[] args) {
    CreditCard card = new CreditCard(1, 1000);
    CreditCard card2 = new CreditCard(2, 100);
    CreditCard card3 = new CreditCard(3, 10);

    card.addMoney();
    card2.addMoney();
    card3.takeMoney();

    card.getInfo();
    card2.getInfo();
    card3.getInfo();
    }
}
