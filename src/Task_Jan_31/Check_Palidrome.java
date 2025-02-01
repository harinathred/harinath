package Task_Jan_31;

import java.util.Scanner;

public class Check_Palidrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter the value");
        int n = scn.nextInt();
        int rev = 0;
        int original=n;

        while (n != 0) {
            int tmp = n % 10;
            rev = rev * 10 + tmp;
            n = n / 10;

        }
            if (original == rev) {
                System.out.println(original+" is an palidrome");
            }
            else {
                System.out.println(original+" is not an palidrome");
            }

    }
}
