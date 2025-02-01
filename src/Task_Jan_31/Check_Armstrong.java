package Task_Jan_31;

import java.util.Scanner;

public class Check_Armstrong {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=scn.nextInt();
        int arm=0;
        int original=n;
        while(n!=0){
            int temp=n%10;
            arm=arm+temp*temp*temp;
            n=n/10;
        }
        if(original==arm){
            System.out.println(original+"is an armstrong");
        }
        else{
            System.out.println(original+"is not an armstrong");
        }
    }
}
