package Task30;

import java.util.Scanner;

public class Smallest_Three_Number {
    public static void main(String[] args){
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter the three Number");
     int num1=scn.nextInt();
     int num2=scn.nextInt();
     int num3=scn.nextInt();
     int smallest=((num1<=num2)&&(num1<=num3))?num1:((num2<=num1)&&(num2<=num3))?num2:num3;
     System.out.println(smallest);
    }
}
