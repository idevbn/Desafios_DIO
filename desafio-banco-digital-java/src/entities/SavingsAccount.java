package entities;

public class SavingsAccount extends Account {
    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.printInfos();
        System.out.println("____________________________________________________________________________");
    }
}
