package Task_Jan_31;

import java.util.Scanner;

public class Check_Person_Eligible {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Age");
        int age=scn.nextInt();
        System.out.println("Enter the salary");
        double salary=scn.nextDouble();
        System.out.println("Enter the credit score");
        int credit=scn.nextInt();
        if((age>=18&&age<=80)&&(salary>30000)&&(credit>=650&&credit<=850)){
        System.out.println("Person is Eligible for a Loan");
        }
        else{
            System.out.println("Person is not Eligible for a Loan");
        }
    }
}
