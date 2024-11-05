package Task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oct17_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the side of triangle A->");
            int A = sc.nextInt();
            System.out.println("Enter the side of triangle B->");
            int B = sc.nextInt();
            System.out.println("Enter the side of triangle C->");
            int C = sc.nextInt();
            //adding the logic of 180 also
            //checks the type of triangle only if the condition is met
            if (A <= 0 || B <= 0 || C <= 0) {
                System.out.println("Invalid input: Sides must be positive");
            }
            else {
                if (A + B + C == 180) {
                    if ((A == B) && (A == C)) {
                        System.out.println("Its an equilateral triangle");
                    } else if ((A == B) || (B == C) || (C == A)) {
                        System.out.println("Its an isosceles triangle");
                    } else {
                        System.out.println("Its an scalene traiangle");
                    }
                } else {
                    System.out.println("All the sides combined is greater/lesser than 180, Please check!");
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Enter the integer!");
        }

    }
}
