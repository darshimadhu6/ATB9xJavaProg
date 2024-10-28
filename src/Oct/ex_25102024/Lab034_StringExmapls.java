package Oct.ex_25102024;

public class Lab034_StringExmapls {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3); // false because the s1 is in SCP and s3 is in OA
        System.out.println(s3==s4);
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
