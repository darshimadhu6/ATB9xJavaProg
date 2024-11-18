package Nov.ex_18112024_Exceptions;

public class Lab081_Expections {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a/b;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        catch(Throwable e){
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
