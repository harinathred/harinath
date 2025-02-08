package Task_Feb_7;

import java.util.Scanner;

public class For_Multiplication_table {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the multiplication table number");
        int n=scn.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
