package Nov.ex_15112024_wrapperClass_Exceptions;

public class Lab080_handleException {
    public static void main(String[] args) {
        int a = 0;
        try {
            int c = 10/a;
        } catch (Exception e) {
            System.out.println("Error!! "+e.getMessage());
        }
    }
}
