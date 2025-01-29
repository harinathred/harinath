package interview_program;

import java.util.Scanner;

public class Reverse_value {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=scn.nextInt();
        int rev=0;
    while(n!=0){
            int temp=n%10;
            rev=rev*10+temp;
            n=n/10;

        }
        System.out.println(rev);
    }
}
