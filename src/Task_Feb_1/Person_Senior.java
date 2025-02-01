package Task_Feb_1;

import java.util.Scanner;

public class Person_Senior {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Age");
        int age=scn.nextInt();
        if (age >= 65) {
            System.out.println("You are a Senior Citizen.");
        } else if (age >= 20) {
            System.out.println("You are an Adult.");
        } else if (age >= 13) {
            System.out.println("You are a Teenager.");
        } else if (age >= 0) {
            System.out.println("You are a Child.");
        } else {
            System.out.println("Invalid age input. Please enter a positive number.");
        }

    }
}
