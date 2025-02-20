package Task_Feb_20;

public class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
  public void bark(){
      System.out.println("Dog is barking");
  }
}
class cat extends Animal{
    void catchrat(){
        System.out.println("cat is catch the rat");
    }
}