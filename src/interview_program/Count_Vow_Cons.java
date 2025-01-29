package interview_program;

import java.awt.*;
import java.util.Scanner;
import java.lang.String;

public class Count_Vow_Cons {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System .out.println("Enter the String");
        String str=scn.next();
        //String str="harinath";
        int vowels=0,consonents=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if('a'==ch || 'e'==ch || 'i'==ch ||'o'==ch || 'u'==ch){
                vowels++;
            }
            else{
                consonents++;
            }

        }
        System.out.println("Vowels count ="+vowels+" "+"Consonents count="+consonents);
    }
}
