package Task29;

import java.util.Scanner;

public class Check_Post_Negative {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the positive or negative");
        int n=scn.nextInt();
        if(n>0){
            System.out.println("This number is positive");
        }else if(n<0){
            System.out.println("This number is negative");
        }
        else{
            System.out.println("This is different number" );
        }
    }
}
