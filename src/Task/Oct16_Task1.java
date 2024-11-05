package Task;

import java.util.Scanner;

public class Oct16_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name->");
        String name = scanner.next();
        System.out.println("Enter your age->");
        int age = scanner.nextInt();
        System.out.println("Enter your salary->");
        float sal = scanner.nextFloat();

        System.out.println("Employee name is "+name+" who is " +age+ " years old, with a salary of INR "+sal);
        scanner.close();
    }
}
