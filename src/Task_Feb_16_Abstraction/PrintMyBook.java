package Task_Feb_16_Abstraction;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class PrintMyBook extends Book{

    public PrintMyBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    void getdetail() {
        System.out.println("name = " + name+"author ="+author+"price ="+price);
    }
}
