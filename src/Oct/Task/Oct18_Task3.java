package Oct.Task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oct18_Task3 {
    public static void main(String[] args) {
//        Write a program that converts between different units (e.g., kilometers to miles,
//        Celsius to Fahrenheit) based on user selection using a switch statement.
//                Input. -
//                choice - 1 - km → m, km → 1km
//        choice - 2 - f → c, f → c
        Scanner sc = new Scanner(System.in);
        System.out.println("Select as per below available options:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Fahrenheit to Celsius\n---------------------");
        System.out.println("Select your option->");
        try{
            int opr = sc.nextInt();
            double km, mls, cl, fr, res;
            switch (opr){
                case 1:
                    System.out.println("Enter the Kilometers to convert to miles->");
                    km = sc.nextDouble();
                    System.out.println(km+" kilometers is " +(km * 0.621)+" in miles");
                    break;
                case 2:
                    System.out.println("Enter the miles to convert to Kilometers->");
                    mls = sc.nextDouble();
                    System.out.println(mls+" miles is " +(mls / 0.621)+" in Kilometers");
                    break;
                case 3:
                    System.out.println("Enter the Celcius to convert to Fahrenheit->");
                    cl = sc.nextDouble();
                    res = ((cl * 9/5) + 32);
                    System.out.println(cl+" Celcius is " +res+" in Fahrenheit");
                    break;
                case 4:
                    System.out.println("Enter the Fahrenheit to convert to Celcius->");
                    fr = sc.nextDouble();
                    res = (fr - 32) * 5/9;
                    System.out.println(fr+" Fahrenheit is " +res+" in Celcius");
                    break;
                default:
                    System.out.println("Invalid entry!");
            }
        }
        catch (InputMismatchException e){

            System.out.println("Invalid datatype!!\nPlease enter between 1 - 4 :");
        }
    }
}
