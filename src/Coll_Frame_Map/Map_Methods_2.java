package Coll_Frame_Map;

import java.util.HashMap;
import java.util.Map;

public class Map_Methods_2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",1);
        map.put("id",2);//key duplicate are not allowed and duplicate values are allowed
        map.put("id2",2);
        map.put("id3",34);
        map.put("id6",34);
        map.put("id4",null);
        map.put("id5",null);
        map.put(null,102);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.remove(34));
        System.out.println(map.containsValue(102));
        System.out.println(map);
    }
}
