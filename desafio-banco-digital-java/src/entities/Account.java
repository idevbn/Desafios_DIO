package entities;

public abstract class Account implements IAccount {
    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENCE = 1;

    private Client client;
    protected int agency;
    protected int number;
    protected double balance;

    public Account(Client client) {
        agency = Account.DEFAULT_AGENCY;
        number = SEQUENCE++;
        this.client = client;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void transference(double amount, IAccount destinationAccount) {
        this.withdraw(amount);
        destinationAccount.deposit(amount);
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }


    protected void printInfos() {
        System.out.println(String.format("Titular: %s", this.client.getHolder()));
        System.out.println(String.format("Agência: %d", this.agency));
        System.out.println(String.format("Número: %d", this.number));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }
}
