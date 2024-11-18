package Nov.ex_18112024_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab083_MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num->");
        try{
            int num = sc.nextInt();
            System.out.println("Result is "+num);//inputmismatch
            int res  = 1000/num;//arthemetic exceotion / by zero
            System.out.println(res);

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println(e);
        }
        finally {
            sc.close();
        }


    }
}
