package Strings;

public class String_ex_1 {
    public static void main(String[] args){
        String n1="harinath";//it is storage instring constant pool
        String n2="harinath"; //it is storage instring constant pool
        String n3=new String("harinath"); //it is storage the heap area
        System.out.println(n1==n2); //true
        System.out.println(n1==n3); //false
        System.out.println(n1.equals(n3)); //true
    }
}
