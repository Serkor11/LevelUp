package Lesson3.Homework3.Task2;

/**
 * Created by Zu on 23.11.2017.
 */
public class Account {

    String user;
    double balance;

    Account() {
    }

    Account(String man, double bal) {
        user = man;
        balance = bal;
    }

    void print() {
        System.out.println("Пользователь " + user + ", баланс " + balance);
    }
}
