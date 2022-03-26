package com.company;

public class CreditCard {
    public int id;
    public int money;

    public CreditCard(int id, int money) {
        this.id = id;
        this.money = money;
    }

    void getInfo() {
        String idStr = String.valueOf(id);
        String moneyStr = String.valueOf(money);
        System.out.println("На счету карточки номер " + idStr + " есть " +  moneyStr  + " денег");
    }

    void addMoney() {
        money += 50;
        System.out.println("Успех");
    }

    void takeMoney() {
        String idStr = String.valueOf(id);
        String moneyStr = String.valueOf(money);

        if (money == 0) {
            System.out.println("На карточке нет денег. Операция невозможна");
            return;
        }

        if (money < 50) {
            System.out.println("На карточке " + idStr + " не хватает денег. Операция невозможна");
            return;
        }

        money -= 50;
        if (money > 0) {
            System.out.println("Успех");
        }
        }
}
