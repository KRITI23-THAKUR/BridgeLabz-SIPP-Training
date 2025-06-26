class BankAccount {
    static String bankName = "ABC Bank";
    private static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Name: " + accountHolderName);
            System.out.println("Account No: " + accountNumber);
        }
    }
}
