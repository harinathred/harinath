package Task30;

import java.util.Scanner;

public class Calicate_Grade {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("ENter the marks");
        int marks=scn.nextInt();
        if(marks<0 && marks>100){
            System.out.println("Wrong number");
        }
        else{
            if(marks>=90 && marks<100){
                System.out.println("Grade is A+");
            }
            else if(marks>=80 && marks<=89){
                System.out.println("Grade is A");
            }
            else if(marks>=70 && marks<=79){
                System.out.println("Grade is B");
            }
            else if(marks>=60 && marks<=69){
                System.out.println("Grade is C");
            }
            else if(marks>=50 && marks<=59){
                System.out.println("Grade is D");
            }
            else if(marks>=40 && marks<=49){
                System.out.println("Grade is E");
            }
            else if(marks>=0 && marks<=39){
                System.out.println("Fails");
            }
        }
    }
}
