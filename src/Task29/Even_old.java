package Task29;

import java.util.Scanner;
public class Even_old {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=scn.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
