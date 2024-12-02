package Nov.ex_22112024_Map;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Map;

public class Lab106_HashMap3 {
    public static void main(String[] args) {
        Map<String,Integer> m1 = new HashMap();
        m1.put("id",1);
        m1.put("id2",2);
        m1.put("id3", 3);
        m1.put("id4", 4);
        m1.put("id5", null);
        m1.put(null,100);

        for(Map.Entry<String,Integer> item:m1.entrySet()){
            System.out.println(item.getKey() + " " +item.getValue());
        }

    }
}
