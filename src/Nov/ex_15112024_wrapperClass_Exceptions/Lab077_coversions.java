package Nov.ex_15112024_wrapperClass_Exceptions;

public class Lab077_coversions {
    public static void main(String[] args) {
        String num = "10";
        Integer a = Integer.valueOf(num);
        int a2 = a;

        System.out.println(a2);

        int a3 = Integer.parseInt(num);
        System.out.println(a3);
    }
}
