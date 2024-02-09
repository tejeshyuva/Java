package exceptionHandling;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
        if (amount < 0) {
            throw new InvalidWithdrawalException("Withdrawal amount cannot be negative");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

