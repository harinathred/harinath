package Task29;

import java.util.Scanner;

public class Char_vow_cons {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the charater");
        char c=scn.next().charAt(0);
        if('a'==c || 'e'==c || 'i'==c ||'o'==c || 'u'==c || 'A'==c || 'E'==c || 'I'==c || 'U'==c || 'O'==c){
            System.out.println("This char is vowel");
        }else if(c>='a' && c<='z') {
            System.out.println("This char is consonent");
        }
        else{
            System.out.println("This is not vowel and consnent");
        }
    }
}
