package Task_Feb_1;

import java.util.Scanner;

public class convert_Day_month_year {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Day");
        int totals_day=scn.nextInt();
        int years=totals_day/360;
        totals_day=totals_day%360;
        int month=totals_day/30;
        totals_day=totals_day%30;

        int days=totals_day;
        System.out.println(years + " years, " + month+ " months, and " + days + " days.");
    }
}
