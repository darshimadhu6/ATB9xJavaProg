package Oct.ex_15102024;

public class Lab010_Increment_prepost_practice {
    public static void main(String[] args) {
//        int a = 10;
//        System.out.println(a++ + a); //first a++ is 10 + 11(a is incremented)

//        int a = 10;
////        System.out.println(++a + a); //first a incremnted as 11 and again a is now 11 so 22
//        int a = 10;
//        System.out.println(a++ + ++a);

//        int a = 10;
//        int res = a--;
//        System.out.println(res);
//        System.out.println(a);

        int a = 10;
        System.out.println(a++ + ++a + a++);//a++ 10 11, ++a 12 12, a++ 12 13
        System.out.println(a);

    }
}
