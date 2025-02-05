package Task_5_feb;

import java.util.Scanner;

public class For_Sum_Natural_num {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=scn.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum += i;
        }
        System.out.println("sum of first 10 natural numbers =" + sum);
    }
}
