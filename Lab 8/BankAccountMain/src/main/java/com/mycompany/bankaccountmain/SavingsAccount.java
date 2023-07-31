
package com.mycompany.bankaccountmain;
class SavingsAccount extends BankAccount {
    private static final double SAVINGS_INTEREST_RATE = 0.12;

    @Override
    public double calculateInterest() {
        return getBalance() * SAVINGS_INTEREST_RATE;
    }
}
