package Coll_Frame_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_1 {
    public static void main(String[] args) {
        Map m=new HashMap();
        m.put("hari",1);
        m. put("nath",2);
        m.put("reddy",3);
        m.put("patil",4);
        m.put("patil",4);
        System.out.println(m);

        Map m1=new LinkedHashMap();
        m1.put("hari",1);
        m1. put("nath",2);
        m1.put("reddy",3);
        m1.put("patil",4);
        System.out.println(m1);

        Map m2=new TreeMap();
        m2.put("hari",1);
        m2. put("nath",2);
        m2.put("reddy",3);
        m2.put("patil",4);
        System.out.println(m2);

    }
}
