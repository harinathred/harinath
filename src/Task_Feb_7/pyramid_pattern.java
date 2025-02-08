package Task_Feb_7;

import java.util.Scanner;

public class pyramid_pattern {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the value");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
