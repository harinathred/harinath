package Task30;

import java.util.Scanner;

public class largest_Three_num {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int num1= scn.nextInt();
        int num2=scn.nextInt();
        int num3=scn.nextInt();

        int n=Math.max(num1,Math.max(num2,num3));
        System.out.println(n);

    }
}
