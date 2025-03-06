package Task_March_5;

public class TestAccessModifiers {
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        // Accessing the public variable directly
        System.out.println("Public Value (Direct Access): " + obj.publicValue);

        // The private variable can't be accessed directly from outside the class
        // System.out.println("Private Value (Direct Access): " + obj.privateValue); // Error

        // Accessing the protected variable directly
        System.out.println("Protected Value (Direct Access): " + obj.protectedValue);

        // Accessing the default variable directly
        System.out.println("Default Value (Direct Access): " + obj.defaultValue);

        // Calling the method to display all values
        obj.displayValues();
    }
}
