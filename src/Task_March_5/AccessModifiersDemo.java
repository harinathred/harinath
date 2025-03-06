package Task_March_5;

public class AccessModifiersDemo {
    public int publicValue = 100;

    // Private: Accessible only within the class
    private int privateValue = 200;

    // Protected: Accessible within the same package and by subclasses
    protected int protectedValue = 300;

    // Default (Package-private): Accessible only within the same package
    int defaultValue = 400;

    // Method to display all values
    public void displayValues() {
        System.out.println("Public Value: " + publicValue);
        System.out.println("Private Value: " + privateValue);
        System.out.println("Protected Value: " + protectedValue);
        System.out.println("Default Value: " + defaultValue);
    }
}

