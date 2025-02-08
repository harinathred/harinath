package Task_Feb_7;

import java.util.Scanner;

public class While_Print_reverse_order {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scn.nextInt();
        while(n>=1){
            System.out.println(n);
            n--;
        }
    }
}
