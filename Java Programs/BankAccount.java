class BankAccount {
    public double balance;

    public double fetchBalance() {
        return balance;
    }

    public void credit(double amount) {
        System.out.println("Start method created");
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Cannot be credited amount as: " + amount);
        }
    }

    public void debit(double amount) {
        System.out.println("Start method debited");
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.err.println("Insufficient Balance");
        }
    }

    // Make SavingsAccount a static nested class
    public static class SavingsAccount extends BankAccount {
        public void transfer() {
            System.out.println("Start transfer in Savings account");
        }
    }

    public static void main(String[] args) {
        System.out.println("Start main method");

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.credit(1000);
        double fetchBalance = savingsAccount.fetchBalance();
        System.out.println("Closing balance is: " + fetchBalance);

        savingsAccount.debit(100);
        savingsAccount.debit(2000);
        double fetchBalance1 = savingsAccount.fetchBalance();
        System.out.println("Closing balance is: " + fetchBalance1);
    }
}
