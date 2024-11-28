package Nov.ex_21112024_LinkedList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab102_SET {
    public static void main(String[] args) {
        Set hs = new HashSet();

        Set lhs = new LinkedHashSet();

        Set ts = new TreeSet();

        hs.add("madh");
        hs.add("madh");
        //System.out.println(hs);
        hs.add("man");
        hs.add("pan");
        System.out.println(hs);

        System.out.println("--LinkedHashSet");
        lhs.add("madh");
        lhs.add(null);
        lhs.add("pan");
        lhs.add("man");

        System.out.println(lhs);

        System.out.println("--TreeSet");
        ts.add("Apple");
        ts.add("Cucumeber");
        ts.add("Banana");
        ts.add(null);//null not allowed as it cannot be sorted
        System.out.println(ts);
    }
}
