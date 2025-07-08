package BankManagementSystem;

class BankAccount {
    private String accountNo;
    private String name;
    private double balance;
    private double fdAmount;

    public BankAccount(String accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.fdAmount = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void createFD(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            fdAmount += amount;
            System.out.println("Created Fixed Deposit of " + amount + ". FD Balance: " + fdAmount);
        } else {
            System.out.println("Invalid FD amount or insufficient balance.");
        }
    }

    public double getAvailableBalance() {
        return balance;
    }

    public String getAccountNo() {
        return accountNo;
    }
}

