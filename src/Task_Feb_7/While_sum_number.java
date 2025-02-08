package Task_Feb_7;

import java.util.Scanner;

public class While_sum_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = scn.nextInt();
        int sum = 0;
        int i=1;
        while(i<=n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of the number ="+sum);
    }
}
