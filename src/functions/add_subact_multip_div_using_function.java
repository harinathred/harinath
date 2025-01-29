package functions;

import java.util.Scanner;

public class add_subact_multip_div_using_function {
    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=scn.nextInt();
        System.out.println("Enter the value of b");
        int b=scn.nextInt();
        int result_sum = sum_of_two(a,b);
        int result_sub = sub_of_two(a,b);
        int result_mul = mul_of_mul(a,b);
        int result_div = div_of_two(a,b);
        int result_mod = mod_of_two(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);


    }
    public static int sum_of_two(int a,int b){
        return a+b;
    }
    public static int sub_of_two(int a,int b){
        return a-b;
    }
    public static int mul_of_mul(int a, int b){
        return a*b;
    }
    public static int div_of_two(int a,int b){
        return a/b;
    }
    public static int mod_of_two(int a,int b){
        return a%b;
    }
}
