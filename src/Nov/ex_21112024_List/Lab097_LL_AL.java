package Nov.ex_21112024_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab097_LL_AL{
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add("man");
        l1.add("Man");
        l1.add("Can");
        System.out.println(l1);

        ArrayList l2 = new ArrayList();
        l2.add("man");
        l2.add("MNM");
        l2.add("Can");
        System.out.println(l2);
    }
}
