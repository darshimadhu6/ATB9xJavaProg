package Nov.ex_20112024_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab094_arrayList {
    public static void main(String[] args) {
        List n = new ArrayList();
        n.add("Man");
        n.add("Can");
        n.add("Tan");
        n.add("Pan");
        n.add("Ban");
        System.out.println(n);
        System.out.println(n.isEmpty());
        System.out.println(n.contains(3));

        System.out.println("To print each element--for loop");
        for (int i =0; i < n.size();i++){
            System.out.println(n.get(i));
        }
        System.out.println("To print each element--foreach loop");
        for(Object o : n){
            System.out.println(o);
        }
        System.out.println("To print each element---Iterator");
        Iterator iterator = n.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }



}
