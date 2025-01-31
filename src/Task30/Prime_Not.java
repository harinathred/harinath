package Task30;

import java.util.Scanner;

public class Prime_Not {
    public static   void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=scn.nextInt();
        Boolean isprime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isprime=false;
                break;
            }

        }
        System.out.println(isprime);
    }
}
