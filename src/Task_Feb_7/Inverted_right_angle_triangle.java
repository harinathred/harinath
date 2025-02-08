package Task_Feb_7;

import java.util.Scanner;

public class Inverted_right_angle_triangle {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the value");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
