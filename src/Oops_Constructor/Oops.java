package Oops_Constructor;

public class Oops {
    public static void main(String[] args) {
    Baby b1=new Baby();
    new Baby();
    new Baby();
    System.out.println(b1);
    }
}
class Baby{
    Baby(){
        System.out.println("I am called, Object is created!");
    }

    // Instance initialization block
    {
        System.out.println("Step 1 - Called Database before working!!");

    }

}


