package Task_Feb_20;

public class Polymorphism {
    public static void main(String[] args) {

        A a=new A();
        a.main(50);
        a.main(40,30);
        a.main("gapol");
        A b=new B();
        b.main(10);
        b.main(12,21);
        b.main("harinath");
    }
}
class A{
    //overloading
    void main(int a){
        System.out.println("print the a value"+a);
    }
    void main(int a,int b){
        System.out.println(a+b);
    }
    void main(String name){
        System.out.println("name :-"+name);
    }
}
class B extends A{
    //override
    void main(int a){
        System.out.println("print the a value"+a);
    }
    //override
    void main(int a,int b){
        System.out.println(a*b);
    }
}