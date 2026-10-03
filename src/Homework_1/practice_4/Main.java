package Homework_1.practice_4;

public class Main {
    public static void main(String[] args) {
        BankAccount info = new BankAccount("Ivan", 3000);

        info.printBalance();
        info.deposit(3000);
        info.printBalance();
        info.withdraw(5000);
        info.printBalance();
    }
}
