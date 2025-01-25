import java.util.Locale;

public class vowelsconsonents {
    public static void main(String[] args){
        String str="PATILHARINATHREDDY";
        int vowels=0, consonents=0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                vowels++;
            }
            else if (ch>='a' && ch<='z') {
                consonents++;
            }
        }
            System.out.println("vowels is"+ vowels );
        System.out.println("consonents is"+consonents );

    }
}
