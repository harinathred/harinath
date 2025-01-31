package Task30;

import java.util.Scanner;

public class ATM_withdrawn {
    public static void main(String[] args) {
        // Step 1: Initialize the account balance
        double balance = 10000.00; // ₹10,000

        // Create a scanner object to take user input

        Scanner scanner = new Scanner(System.in);

        // Step 2: Take user input for withdrawal amount
        System.out.print("Enter the amount to withdraw: ₹");
        double withdrawalAmount = scanner.nextDouble();

        // Step 3: Check withdrawal conditions

        // Condition 1: Amount should be greater than zero
        if (withdrawalAmount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
        }
        // Condition 2: Amount should be a multiple of 100
        else if (withdrawalAmount % 100 != 0) {
            System.out.println("Error: Withdrawal amount should be a multiple of ₹100.");
        }
        // Condition 3: Amount should not exceed the available balance
        else if (withdrawalAmount > balance) {
            System.out.println("Error: Insufficient balance.");
        }
        else {
            // Step 4: Deduct the amount from the balance
            balance -= withdrawalAmount;

            // Step 5: Display the updated balance
            System.out.println("Withdrawal successful! Your new balance is: ₹" + balance);
        }

        // Close the scanner
        scanner.close();
    }
}
