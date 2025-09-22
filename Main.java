package com.footballbetting.main;

import com.footballbetting.system.FootballBettingSystem;

public class Main {
    public static void main(String[] args) {
        FootballBettingSystem system = new FootballBettingSystem();
        
        // Example usage
        boolean registrationSuccess = system.registerUser("john_doe", "Password123!");
        if (registrationSuccess) {
            System.out.println("Registration successful!");
            
            // Login after registration
            boolean loginSuccess = system.login("john_doe", "Password123!");
            if (loginSuccess) {
                System.out.println("Login successful!");
                
                // Add bank account and verify
                boolean bankAccountAdded = system.addBankAccount(system.getCurrentUser(), "123456789012");
                if (bankAccountAdded) {
                    System.out.println("Bank account added successfully!");
                    
                    boolean verificationSuccess = system.verifyBankAccount(system.getCurrentUser());
                    if (verificationSuccess) {
                        System.out.println("Bank account verified!");
                        
                        // Add some balance
                        system.getCurrentUser().setBalance(500.00);
                        
                        // Display available matches
                        System.out.println("Available matches:");
                        for (var match : system.getAvailableMatches()) {
                            System.out.println(" - " + match);
                        }
                    } else {
                        System.out.println("Bank account verification failed!");
                    }
                } else {
                    System.out.println("Failed to add bank account!");
                }
            } else {
                System.out.println("Login failed!");
            }
        } else {
            System.out.println("Registration failed!");
        }
        
        System.out.println("\nFootball Betting System is running!");
    }
}
