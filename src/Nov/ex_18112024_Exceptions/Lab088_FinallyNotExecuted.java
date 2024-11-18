package Nov.ex_18112024_Exceptions;

public class Lab088_FinallyNotExecuted {
    public static void main(String[] args) {
        try{
            int a = 10/10;
            System.exit(0);
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Not printed");
        }
    }
}
