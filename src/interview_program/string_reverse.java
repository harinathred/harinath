package interview_program;

public class string_reverse {
    public static void main(String[] args) {
            String str="automation";
            char ch='0';
            char b='a';
            int count =0;
            for(int i=str.length()-1;i>=0;i--){
                ch=str.charAt(i);
                System.out.print(ch);
                if(ch==b){
                    count++;
                }
            }
            System.out.println(count);
    }
}
