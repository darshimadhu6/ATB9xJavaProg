package Task.Oct;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oct23_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 1st Number -> ");
            int num1 = sc.nextInt();
            System.out.println("Enter 2nd Number -> ");
            int num2 = sc.nextInt();

            System.out.println("Addition of numbers is ->" + sum(num1, num2));
            System.out.println("Difference of numbers is ->" + sub(num1, num2));
            System.out.println("Multiplication of numbers is ->" + multiply(num1, num2));
            divide(num1, num2);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Please enter only int datatype "+e);
        }

    }
    static int sum(int num1, int num2)
    {
        return num1 + num2;
    }

    static int sub(int num1, int num2)
    {
        return num2 - num1;
    }

    static int multiply(int num1 , int num2)
    {
        return num1 * num2;
    }
    static void divide(int num1, int num2)
    {
        int res = 0;
        try{
            res = num2 / num1;
            System.out.println("Division of numbers is ->"+res);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero "+e);
        }
        }
}
