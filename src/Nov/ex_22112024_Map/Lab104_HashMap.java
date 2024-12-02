package Nov.ex_22112024_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab104_HashMap {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        //Map <String,Integer> m2 = new HashMap<>();//to hardcode the datatype
        m1.put("name","Madhu");
        m1.put("age",26);
        m1.put("phone", 1234567890);
        System.out.println(m1);
    }
}
