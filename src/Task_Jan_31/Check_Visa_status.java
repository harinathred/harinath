package Task_Jan_31;

import java.util.Scanner;

public class Check_Visa_status {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Age");
        int age=scn.nextInt();
        boolean visa_status=false;
        if(age>=18){
            visa_status=true;
            System.out.println("the person can travel "+visa_status);
        }
        else{
            System.out.println("the person cannot travel "+visa_status);
        }
    }
}
