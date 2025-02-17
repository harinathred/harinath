package interview_program;

import java.util.Scanner;

public class String_Each_reverse {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println(" Enter the sentence");
        String sentance=scn.nextLine();
        String[] words=sentance.split(" ");
        for(int i=0;i<words.length;i++){
            String word = words[i];
            String revword="";
            for(int j=word.length()-1;j>=0;j--){
                revword+=word.charAt(j);
            }
            words[i]=revword;
        }
        String revsent=String.join(" ",words);
        System.out.println(revsent);
    }
}
