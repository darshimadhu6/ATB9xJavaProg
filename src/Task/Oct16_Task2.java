package Task;

import java.util.Scanner;

public class Oct16_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The largest number in two!");
        System.out.println("Enter first number (a)->");
        int a = scanner.nextInt();
        System.out.println("Enter second number (b)->");
        int b = scanner.nextInt();
        System.out.println("The numbers are a= "+a+ " and b= "+b);
        System.out.println(a>b?"a is larger":"b is larger");
        scanner.close();

    }
}
