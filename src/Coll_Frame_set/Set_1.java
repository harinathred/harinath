package Coll_Frame_set;

import com.sun.jdi.ThreadReference;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_1 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        LinkedHashSet lhs=new LinkedHashSet();
        TreeSet ths=new TreeSet();

        hs.add("harinath");
        hs.add("harinath");
        hs.add("patil");
        hs.add("gopal");
        hs.add("reddy");
        System.out.println(hs);
        ths.add("harinath");
        ths.add("harinath");
        ths.add("patil");
        ths.add("gopal");
        ths.add("reddy");
        System.out.println(ths);

        lhs.add("harinath");
        lhs.add("harinath");
        lhs.add("patil");
        lhs.add("gopal");
        lhs.add("reddy");
        System.out.println(lhs);
    }
}
