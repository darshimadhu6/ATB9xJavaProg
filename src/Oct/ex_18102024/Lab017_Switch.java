package Oct.ex_18102024;

import java.util.Scanner;

public class Lab017_Switch {
    public static void main(String[] args) {
        //Switch condition
        //user to enter from 1 - 7
        // Wiil tell the day of week
//        1-> Mon,2->Tues
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date from (1-7)");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not sure what day it is!");
        }
        System.out.println("End of the loop");
        sc.close();
    }
}
