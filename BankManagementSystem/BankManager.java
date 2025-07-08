package BankManagementSystem;

import java.util.*;

class BankManager {
    private HashMap<String, BankAccount> accounts;

    public BankManager() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountNo, String name, double initialBalance) {
        if (!accounts.containsKey(accountNo)) {
            accounts.put(accountNo, new BankAccount(accountNo, name, initialBalance));
            System.out.println("Account created successfully for " + name + ".");
        } else {
            System.out.println("Account number already exists.");
        }
    }

    public BankAccount getAccount(String accountNo) {

        return accounts.get(accountNo);
    }
}

