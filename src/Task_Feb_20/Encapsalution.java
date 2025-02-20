package Task_Feb_20;

public class Encapsalution {
    public static void main(String[] args) {
    AxisBank a=new AxisBank("harinath",1000);

    boolean isCashier  = true;
    System.out.println(a.getBal());
    System.out.println(a.getName());
    }
}
class AxisBank{
    String name;
    int bal;
    String bamk="Axis BanK";

    public AxisBank(String name, int bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal,boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the Bal");
        }
    }
}