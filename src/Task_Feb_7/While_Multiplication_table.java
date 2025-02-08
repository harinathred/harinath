package Task_Feb_7;

import java.util.Scanner;

public class While_Multiplication_table {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the multiplication table number");
        int n=scn.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n+" X "+i+" = "+n*i);
            i++;
        }
    }
}
