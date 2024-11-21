package Nov.ex_20112024_Collection;

import java.util.ArrayList;
import java.util.List;

public class Lab095_NestedArrayList {
    public static void main(String[] args) {
        List fruits = new ArrayList();
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("pineapple");
        System.out.println(fruits);
        List fruits2 = new ArrayList();
        fruits2.add("mango2");
        fruits2.add("Jackfruits");
        System.out.println(fruits2);
        List allfruits = new ArrayList();
        allfruits.add(fruits);
        allfruits.add(fruits2);
        System.out.println(allfruits);
    }
}
