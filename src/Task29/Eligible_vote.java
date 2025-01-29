package Task29;

import java.util.Scanner;

public class Eligible_vote {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value");
        int age=scn.nextInt();
        if(age>=18){
            System.out.println(" Eligible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }
    }
}
