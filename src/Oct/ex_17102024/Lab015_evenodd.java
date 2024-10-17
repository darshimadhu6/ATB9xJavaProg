package Oct.ex_17102024;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab015_evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a number->");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.printf("The number %d is Even", num);
            } else {
                System.out.printf("The number %d is Odd", num);
            }
        }

        catch (InputMismatchException e) {
            System.out.println(e + " Please enter a Integer number!");
        }
    }
}
