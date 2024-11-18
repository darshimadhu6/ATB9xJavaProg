package Nov.ex_15112024_wrapperClass_Exceptions;

public class Lab079_nullpointer_Exception {
    public static void main(String[] args) {
        System.out.println("Start");
        //String s = "madhu";
        String s =null;
        try{
        s.trim();
        }
        catch (Exception e){
            System.out.println("can't do trim for NULL");
        }

        //trim is not possible on null
        System.out.println("End");
    }
}
