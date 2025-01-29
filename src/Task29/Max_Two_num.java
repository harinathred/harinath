package Task29;

import java.util.Scanner;

public class Max_Two_num {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the first num");
        int num1=scn.nextInt();
        System.out.println("Enter the second num");
        int num2=scn.nextInt();
        if(num1>num2){
            System.out.println(num1+"maximum");
        }
        else if(num2>num1){
            System.out.println(num2+"maximum");
        }
        else{
            System.out.println("both are same");
        }
    }
}
