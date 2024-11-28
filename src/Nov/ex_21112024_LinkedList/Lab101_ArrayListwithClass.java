package Nov.ex_21112024_LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Lab101_ArrayListwithClass {
    public static void main(String[] args) {
        Student s1 = new Student("Madhu",26);
        Student s2 = new Student("Maddy",25);
        Student s3 = new Student("Manju", 24);

        List<Student> mystu = new ArrayList<>();//use of generics<>
        mystu.add(s1);
        mystu.add(s2);
        mystu.add(s3);
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}
