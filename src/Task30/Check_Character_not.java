package Task30;

import java.util.Scanner;

public class Check_Character_not {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=scn.next().charAt(0);
        if(Character.isLetter(ch)){
            System.out.println(ch + " is an alphabet.");
    }
        else{
            System.out.println(ch + " is not an alphabet.");
        }
}
}
