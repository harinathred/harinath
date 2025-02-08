package Task_Feb_7;

import java.util.Scanner;

public class While_factorial {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scn.nextInt();
        int fact=1;
        int i=1;
        while(i<=n){
            fact*=i;
            i++;
        }
        System.out.println(fact);
    }
}
