package Nov.ex_22112024_Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab108_HashTable {
    public static void main(String[] args) {
        Hashtable<String,Integer> ht = new Hashtable();
        ht.put("name",1);
        ht.put("name2", 2);
//        ht.put(null,1);//error null not allowed
//        ht.put("name3", null);//error null not allowed

        System.out.println(ht);

        Enumeration<String> e = ht.keys();
            while(e.hasMoreElements()){
                System.out.println(e.nextElement());
            }
        }
    }
}
