package Task_Jan_31;

import java.util.Scanner;

public class Calculate_Bonus {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the year");
        Double year=scn.nextDouble();
        System.out.println("Enter the Salary");
        Double salary=scn.nextDouble();
        double bonus=0;
        if(year<1){
            bonus=salary*0;
            System.out.println("no bonus "+bonus );
        }
        else if (year>=1 && year<=3){
            bonus=salary*0.05;
            System.out.println("Bonus is 5% of the salary "+bonus);
        }
        else if (year>=4 && year<=6){
            bonus=salary*0.10;
            System.out.println("Bonus is 10% of the salary "+bonus);
        }
        else if (year>=6){
            bonus=salary*0.15;
            System.out.println("Bonus is 15% of the salary"+bonus);
        }
        else {
            System.out.println("NO salary");
        }
    }
}
