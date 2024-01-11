package oop1.ex;

public class Account {
    int balance;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (this.balance < amount) {
            System.out.println("작액부족");
        } else {
            this.balance -= amount;
        }
    }
}
