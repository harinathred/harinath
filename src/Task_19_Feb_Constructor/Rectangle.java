package Task_19_Feb_Constructor;

public class Rectangle {
    double length;
    double width;
    Rectangle(){
        length=1.0;
        width=1.0;
    }
    Rectangle(double size){
    length=size;
    width=size;
    }
    Rectangle(double length,double width){
    this.length=length;
    this.width=width;
    }
    public void overdisplayarea(){
        double area=length*width;
        System.out.println("Rectangle area "+area);
    }
}
class override{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(15);
        Rectangle r3=new Rectangle(12,14);
        r3.overdisplayarea();
        r2.overdisplayarea();
        r1.overdisplayarea();
    }
}