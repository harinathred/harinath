package Task_Feb_20;

public class Abstraction {
    public static void main(String[] args) {
    naval na=new naval("harinath","nitin",400);
            na.mybook();
    }
}
abstract class book{
    String name;
    String author;
    int prise;

    public book(String name, String author, int prise) {
        this.name = name;
        this.author = author;
        this.prise = prise;
    }

    abstract void mybook();
}
class naval extends book {
    public naval(String name, String author, int prise) {
        super(name, author, prise);
    }

    @Override
    void mybook() {
        System.out.println("name :"+name+"author:"+author+"prise :"+prise);
    }
}
