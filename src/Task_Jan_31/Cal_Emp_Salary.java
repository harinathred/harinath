package Task_Jan_31;

import java.util.Scanner;

public class Cal_Emp_Salary {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the salary");
        Double basic_salary=scn.nextDouble();
       double hra_perage=0.20;
       double da_perage=0.20;
        double hra=basic_salary*hra_perage;
        double da=basic_salary*da_perage;
        double tax=0;
        double grossSalary=basic_salary*hra*da;
        if(grossSalary<=100000){
             tax=0;
        } else if (grossSalary>=1000000 || grossSalary<=2000000) {
            tax=grossSalary*0.20;
        }
        else if (grossSalary>=2000000 || grossSalary<=4000000) {
            tax=grossSalary*0.25;
        }
        double netSalary = grossSalary - tax;

        // Display the results
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Tax Deducted: ₹" + tax);
        System.out.println("Net Salary: ₹" + netSalary);
    }
}
