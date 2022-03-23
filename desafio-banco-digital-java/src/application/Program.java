package application;

import entities.Account;
import entities.CheckingAccount;
import entities.Client;
import entities.SavingsAccount;

import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Operação de transferência de dinheiro de uma conta para outra ===");
        System.out.println();
        System.out.println("____________________________________________________________________________");
        System.out.println();

        Client client = new Client();
        client.setHolder("john");

        Client client2 = new Client();
        client2.setHolder("mary");

        Account checkingAccount = new CheckingAccount(client);
        Account savingAccount = new SavingsAccount(client);

        Account savingAccount2 = new SavingsAccount(client2);

        checkingAccount.deposit(150);
        checkingAccount.transference(100, savingAccount);

        checkingAccount.transference(50, savingAccount2);

        checkingAccount.printStatement();
        savingAccount.printStatement();
        savingAccount2.printStatement();
    }
}
