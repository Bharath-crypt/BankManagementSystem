package BankManagementSystem;

import java.util.*;

public class BankCLI {
    public static void main(String[] args) {
        BankManager bank = new BankManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to SimpleBank CLI");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Create Fixed Deposit");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter account number: ");
                String accountNo = scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter initial balance: ");
                double balance = scanner.nextDouble();
                bank.createAccount(accountNo, name, balance);
            } else if (choice == 2) {
                System.out.print("Enter account number: ");
                String accountNo = scanner.nextLine();
                BankAccount account = bank.getAccount(accountNo);
                if (account != null) {
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();
                    account.deposit(amount);
                } else {
                    System.out.println("Account not found.");
                }
            } else if (choice == 3) {
                System.out.print("Enter account number: ");
                String accountNo = scanner.nextLine();
                BankAccount account = bank.getAccount(accountNo);
                if (account != null) {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                } else {
                    System.out.println("Account not found.");
                }
            } else if (choice == 4) {
                System.out.print("Enter account number: ");
                String accountNo = scanner.nextLine();
                BankAccount account = bank.getAccount(accountNo);
                if (account != null) {
                    System.out.println("Available balance: " + account.getAvailableBalance());
                } else {
                    System.out.println("Account not found.");
                }
            } else if (choice == 5) {
                System.out.print("Enter account number: ");
                String accountNo = scanner.nextLine();
                BankAccount account = bank.getAccount(accountNo);
                if (account != null) {
                    System.out.print("Enter FD amount: ");
                    double amount = scanner.nextDouble();
                    account.createFD(amount);
                } else {
                    System.out.println("Account not found.");
                }
            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}