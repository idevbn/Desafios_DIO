package entities;

public class CheckingAccount extends Account {
    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.printInfos();
        System.out.println("____________________________________________________________________________");
    }
}
