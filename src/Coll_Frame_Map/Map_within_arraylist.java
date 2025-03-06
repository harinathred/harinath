package Coll_Frame_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map_within_arraylist {
    public static void main(String[] args) {
        HashMap<String,Integer> student1=new HashMap();
        student1.put("Harinath",123);
        student1.put("patil",432);
        student1.put("nath",456);
        System.out.println(student1);

        HashMap<String,Integer> student2=new HashMap();
        student2.put("shiva",198);
        student2.put("gambir",678);
        student2.put("nirav",678);
        System.out.println(student2);

        List student=new ArrayList();
        student.add(student1);
        student.add(student2);
        System.out.println(student);
    }
}
