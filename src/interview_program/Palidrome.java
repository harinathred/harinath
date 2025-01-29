package interview_program;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System .out.println("Enter the String");
        String str=scn.next();
        //String str="madam";
        String reversed=new StringBuilder(str).reverse().toString();
        System.out.println(reversed
        );
    }
}
