
package com.mycompany.bankaccountmain;
class CheckingAccount extends BankAccount {
    private static final double CHECKING_INTEREST_RATE = 0.02;

    @Override
    public double calculateInterest() {
        return getBalance() * CHECKING_INTEREST_RATE;
    }
}
