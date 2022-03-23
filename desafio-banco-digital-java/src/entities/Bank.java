package entities;

import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setContas(List<Account> accounts) {
        this.accounts = accounts;
    }
}
