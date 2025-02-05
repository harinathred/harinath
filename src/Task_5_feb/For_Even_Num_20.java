package Task_5_feb;

import java.util.Scanner;

public class For_Even_Num_20 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0) {
                System.out.println("Print even the I to 20 =" + i);
            }
        }
    }
}
