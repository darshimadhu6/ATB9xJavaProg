package Nov.ex_21112024_LinkedList;

import java.util.PriorityQueue;

public class Lab103_Queue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer("A");//uses offer instaed of add
        pq.offer("B");
        pq.offer("C");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());//remove top element
        System.out.println(pq);
    }
}
