package Nov.ex_22112024_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab107_List_of_Hashmap4 {
    public static void main(String[] args) {
        Map<String,String> Student = new HashMap();
        Student.put("name","madhu");
        Student.put("roll","1");
        Student.put("sec","A");
        Map<String,String> Student2 = new HashMap();
        Student2.put("name","Darshi");
        Student2.put("roll","2");
        Student2.put("sec","B");

        List l1 = new ArrayList();
        l1.add(Student);
        l1.add(Student2);
        System.out.println(l1);
    }
}
