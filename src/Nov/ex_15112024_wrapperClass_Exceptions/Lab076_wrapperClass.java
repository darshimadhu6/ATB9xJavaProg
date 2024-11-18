package Nov.ex_15112024_wrapperClass_Exceptions;

public class Lab076_wrapperClass {
    public static void main(String[] args) {
        int a =10;//primitive data type
        Integer a1 = 10;//wrapper class
        System.out.println(a1.doubleValue());//now this has methods

        //boxing conevrting small to big
        int b = 10;
        Integer c = b;

        //Unboxing conevrting big to small
        Integer x = 10;
        int y = x;
    }
}
