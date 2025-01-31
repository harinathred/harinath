package Task30;

import java.util.Scanner;

public class Check_Triange {
    public static void main(String[] args) {
        // Create a scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in);

        // Take input for the three sides of the triangle
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        // Check if the triangle is valid using the triangle inequality theorem
        if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
        scanner.close();
    }
}
