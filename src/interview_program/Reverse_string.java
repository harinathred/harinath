package interview_program;

import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scn.next();
        //String str="madam";
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println(reversed);
    }
}
