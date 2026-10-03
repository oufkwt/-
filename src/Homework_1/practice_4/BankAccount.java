package Homework_1.practice_4;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance) {
        this.balance = balance;
        this.owner = owner;
    }
    public String getOwner() {
        return owner;
    }
    public int getBalance() {
        return balance;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void deposit(int amount) {
        balance = balance + amount;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
    public void printBalance() {
        System.out.println("Balance: " + balance + ".\nOwner: " + owner);
    }
}
