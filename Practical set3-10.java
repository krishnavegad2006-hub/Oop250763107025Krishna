class BankAccount {
    String accountHolderName;
    double balance;

    // Static variable (common for all accounts)
    static double interestRate = 5.0; // default 5%

    // Constructor
    BankAccount(String name, double bal) {
        accountHolderName = name;
        balance = bal;
    }

    // Method to calculate interest
    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    // Method to display details
    void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    // Static method to update interest rate
    static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to: " + interestRate + "%\n");
    }

    public static void main(String[] args) {
        // Create accounts
        BankAccount acc1 = new BankAccount("Krishna", 10000);
        BankAccount acc2 = new BankAccount("Ravi", 20000);

        // Display initial details
        System.out.println("Before updating interest rate:");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        // Update interest rate (static method)
        BankAccount.updateInterestRate(7.5);

        // Display updated details
        System.out.println("After updating interest rate:");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
    }
}