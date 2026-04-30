class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount(int years) {
        return balance * Math.pow(1.06, years); // 6% compound interest
    }
}

public class TestBank {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.openAccount(101, "Krishna", 10000);
        sa.deposit(2000);
        sa.checkBalance();
        System.out.println("Saving Interest: " + sa.calculateInterest());

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(102, "Ravi", 15000);
        System.out.println("FD Maturity Amount (3 years): " + fd.maturityAmount(3));
    }
}