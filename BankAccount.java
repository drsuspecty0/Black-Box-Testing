package com.footballbetting.model;

public class BankAccount {
    private String accountNumber;
    
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getAccountNumber() { return accountNumber; }
    
    public boolean isValid() {
        // Validate bank account format (12-18 digits)
        if (accountNumber == null) return false;
        return accountNumber.matches("\\d{12,18}");
    }
}
