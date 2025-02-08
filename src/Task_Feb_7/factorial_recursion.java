package Task_Feb_7;

import java.util.Scanner;

public class factorial_recursion {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println(" Enter the value");
       int num= scn.nextInt();
        long results=factorial(num);
        System.out.println("The factorial of " + num + " is: " + results);
    }
    public static long factorial(int n){
        if(n==0 ||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
