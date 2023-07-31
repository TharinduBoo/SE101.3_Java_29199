
package com.mycompany.bankaccountmain;
public class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountNumber("SA123456");
        savingsAccount.setBalance(20000000);

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountNumber("CH987654");
        checkingAccount.setBalance(1000000);

        double savingsInterest = savingsAccount.calculateInterest();
        double checkingInterest = checkingAccount.calculateInterest();

        System.out.println("Interest on Savings Account: " + savingsInterest);
        System.out.println("Interest on Checking Account: " + checkingInterest);
    }
}
