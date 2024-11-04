package Oct.ex_30102024;

public class Lab042_arrayExceptions {
    public static void main(String[] args) {
        //int [] a = new int[-1];
        //System.out.println(a);//NegativeArraySizeException
        int [] b = new int[10];
        System.out.println(b[12]);//ArrayIndexOutOfBoundsException
    }
}
