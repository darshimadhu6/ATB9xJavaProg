package Nov.ex_18112024_Exceptions;

public class Lab082_Excpetions_goodhandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a/b;
            String s = null;
            s.trim();
        }catch (ArithmeticException | NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("I will always be exceuted");
        }

        System.out.println("End");

    }
}
