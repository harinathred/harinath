package Task_19_Feb_Constructor;

import javax.sound.midi.Soundbank;

public class Default_paramater_constructor {
    public static void main(String[] args) {
        Prgm_Default_Constructor_1 def=new Prgm_Default_Constructor_1();
        System.out.println("name :-"+def.name);
        System.out.println("Age :-"+def.age);
        System.out.println("Salary :-"+def.salary);

        prgm_parameter_constructor_2 par=new prgm_parameter_constructor_2(30,"gopal",20000);
        prgm_parameter_constructor_2 par2=new prgm_parameter_constructor_2(31,"raghu",21000);
        par.displaystudentdetails();
        par2.displaystudentdetails();
    }
}
