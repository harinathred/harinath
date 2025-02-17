package Task_Feb_16_Abstraction;

public class Abstraction_task {
    public static void main(String[] args) {
        Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", 120);
        myBook.getdetail();
    }
}
