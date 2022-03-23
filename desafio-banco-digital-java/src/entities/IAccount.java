package entities;

public interface IAccount {
    void withdraw(double amount);

    void deposit(double amount);

    void transference(double amount, IAccount destinationAccount);

    void printStatement();
}
