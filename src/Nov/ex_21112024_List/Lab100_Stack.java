package Nov.ex_21112024_List;

import java.util.Stack;

public class Lab100_Stack {
    public static void main(String[] args) {
//        Stack s = new Stack();
//        s.add("Madhu");
//        s.add("Manju");
//
//        System.out.println(s);

        Stack s2 = new Stack();
        s2.push("Man");
        s2.push("Madhu");
        s2.push("Manju");
        s2.push("Am");
        System.out.println(s2);
        System.out.println(s2.size());
        System.out.println(s2.peek());//see the top element
        System.out.println(s2.pop());//remove the top element
        System.out.println(s2.size());
        s2.add(0,"Lucky");
        System.out.println(s2);
        System.out.println(s2.get(0));
    }
}
