package Task_5_feb;

import java.util.Scanner;

public class For_1 {
    public static void main(String[] args){
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter the value");
       int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Print the I to 10 ="+i);
        }
    }
}
