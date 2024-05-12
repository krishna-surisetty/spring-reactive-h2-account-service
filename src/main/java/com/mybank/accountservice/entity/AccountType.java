package com.mybank.accountservice.entity;

public enum AccountType {
    SAVINGS_ACCOUNT("Savings Account"),
    CURRENT_ACCOUNT("Current Account"),
    LOAN_ACCOUNT("Loan Account"),
    CREDIT_CARD_ACCOUNT("Credit Card Account");

    private String accountType;

    AccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }
}
