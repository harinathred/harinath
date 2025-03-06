package Coll_Frame_set;

import java.util.HashSet;

public class Set_HS_3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        System.out.println("Set elements: " + set);
    }
}
