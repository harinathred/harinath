package Task_Feb_7;

import java.util.Scanner;

public class Check_prime_num_for {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=scn.nextInt();
        if(n<=1){
            System.out.println(n+" = is not prime number");
        }
        else {
            Boolean is_prime = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    is_prime = false;
                    break;
                }
            }
            if(is_prime){
                System.out.println(n+" = is prime number");
            }
            else{
                System.out.println(n+" = is not prime number");
            }
        }
    }
}
