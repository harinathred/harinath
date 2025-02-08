package Task_Feb_7;

import java.util.Scanner;

public class Print_reverse_order {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=scn.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
