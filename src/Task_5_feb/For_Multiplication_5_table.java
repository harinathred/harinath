package Task_5_feb;

import java.util.Scanner;

public class For_Multiplication_5_table {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=scn.nextInt();
        int mul=0,v=5;
        for(int i=1;i<=n;i++){
            mul=v*i;
            System.out.println("5 * "+i+" = "+mul );
        }
    }
}
