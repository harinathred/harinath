package Task_Jan_31;

import java.util.Scanner;

public class Electricity_Bill_Calculate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of units consumed
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        // Initialize the total bill
        double bill = 0.0;

        // Calculate the bill based on the units consumed
        if (units <= 100) {
            bill = units * 0.50;
        } else if (units <= 200) {
            bill = 100 * 0.50 + (units - 100) * 0.75;
        } else if (units <= 300) {
            bill = 100 * 0.50 + 100 * 0.75 + (units - 200) * 1.20;
        } else {
            bill = 100 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 300) * 1.50;
        }

        // Output the total bill
        System.out.println("The total electricity bill is: Rs " + bill);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
