package functions;

public class user_defined_1 {
    public static void main(String[] args){

    main();
    String s=greet_with_hello();
    System.out.println(s);
        greet_with_full_details("Harinath",25,"Capgemini");
       int c= sum_two_no(20,40);
       System.out.println(c);
    }
    //  1. Without Parameters but Without Return Type
    public static void main(){
        System.out.println("Hi, another Look like of main ");
    }
    //  2. Without Parameters but With Return Type
    public static String greet_with_hello(){
        return "Hi, How are you";
    }
    //  3. With Parameters but Without Return Type
    public static void greet_with_full_details(String name,int age, String company){
        System.out.println("name is "+name +"\nage is"+age+"\ncompany name is"+company);
    }
    //  4. With Parameters but With Return Type
    public static int sum_two_no(int a,int b){
        return a+b;
    }
}
