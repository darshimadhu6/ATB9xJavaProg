package Nov.ex_05112024;

import java.security.PublicKey;

public class Lab051_OOPS_ObjectClass {
    public static void main(String[] args){
        StudentATB s1 = new StudentATB();
        s1.name = "Madhu";
        s1.attendClass();
        s1.introduction(s1.name);
        System.out.println(s1);
    }
}
