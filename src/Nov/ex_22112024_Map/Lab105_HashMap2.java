package Nov.ex_22112024_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab105_HashMap2 {
    public static void main(String[] args) {
//        Map<String,Integer> m1 = new HashMap<String,Integer>();//old syntax
//        Map<String,Integer> m2 = new HashMap<>();//old
        Map<String,Integer>m3 = new HashMap();//latest syntax write only left side

        m3.put("id",1);
        m3.put("id",2);
        m3.put(null,10);
        m3.put("id2", 3);
        m3.put("id3", 4);
        m3.put(null,null);

        System.out.println(m3);
        System.out.println(m3.size());
        System.out.println(m3.isEmpty());
        System.out.println(m3.keySet());
        System.out.println(m3.values());
        System.out.println(m3.containsKey("id"));
        System.out.println(m3.containsValue(10));
        System.out.println(m3.get("id"));
    }
}
