package Nov.ex_21112024_List;

import java.util.LinkedList;

public class Lab098_LinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add("man");
        l1.add("Man");
        l1.add("Can");
        System.out.println(l1);

        l1.addFirst("First");
        l1.addLast("Last");
        System.out.println(l1);

        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);
    }
}
