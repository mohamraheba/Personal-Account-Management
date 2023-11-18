import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accNumb, String accHolder) {
        accountNumber = accNumb;
        accountHolder = accHolder;
        balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            transactions.add(new Amount(amount, "Deposit"));
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount > balance) {
            throw new InsufficientBalanceException("Invalid withdrawal amount or insufficient funds.");
        }
        else {
            if (amount > 0 && amount <= balance) {
                transactions.add(new Amount(amount, "Withdrawal"));
                balance -= amount;
                System.out.println("Withdrawn $" + amount);
            }
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History of Account #" + accountNumber + " (" + accountHolder + "):");
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": $" + transaction.getAmount());
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}