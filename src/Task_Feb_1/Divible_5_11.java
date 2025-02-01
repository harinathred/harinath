package Task_Feb_1;

import java.util.Scanner;

public class Divible_5_11 {
    public static  void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=scn.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println("The number is divisible by both 5 and 11.");
        } else {
            System.out.println("The number is not divisible by both 5 and 11.");
        }
    }
}
