package Nov.ex_20112024_Collection;

import java.util.Vector;

public class Lab093_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("man");
        v.add("Man");
        v.add(12);
        v.add(true);
        System.out.println(v);
        v.remove("Man");
        System.out.println(v.contains("Man"));
        System.out.println(v);
    }
}
