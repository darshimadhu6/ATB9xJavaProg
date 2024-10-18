package Oct.Task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oct18_Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the first number ->");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number ->");
            int num2 = sc.nextInt();
            System.out.println("Enter the operation ->");
            String opr = sc.next();
            //Calculations based on the operation entered
            switch (opr){
                case "+":
                    System.out.println("Selected operation is Addition->Result : "+(num1+num2));
                    //System.out.println(num1+num2);
                    break;
                case "-":
                    System.out.println("Selected operation is Subtraction");
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println("Selected operation is Multiplication");
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("Selected operation is Division");
                        System.out.println(num1 / num2);
                    }
                    else{
                        System.out.println("Not divisible by zero!");
                    }
                    break;
                case "%":
                    System.out.println("Selected operation is Modulus to find remainder");
                    System.out.println(num1 % num2);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    System.out.println("Please select +, -, *, /, % as operation");
            }
            System.out.println("Execution complete");
        }
        catch (InputMismatchException e){
            System.out.println("Please enter valid datatype");
            }

    }
}
