package Task_19_Feb_Constructor;

public class prgm_parameter_constructor_2 {
    String Studentname;
    int rollno;
    int fee;

    public prgm_parameter_constructor_2(int rollno, String studentname, int fee) {
        this.rollno = rollno;
        Studentname = studentname;
        this.fee = fee;
    }
    public void displaystudentdetails(){
        System.out.println("Studentname :-"+Studentname);
        System.out.println("rollno :-"+rollno);
        System.out.println("fee :-"+fee);
    }
}
