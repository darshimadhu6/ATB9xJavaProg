package Nov.ex_20112024_Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab096_Arraylist_userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        ArrayList<Integer> age = new ArrayList();

        String continueInput = "Y";
        while (continueInput.equalsIgnoreCase("Y")){
            System.out.print("Enter your Name->");
            names.add(sc.next());
            System.out.print("Enter your age->");
            age.add(sc.nextInt());

            System.out.print("Do you want to continue?");
            continueInput = sc.next();

        }
        System.out.println("Names->"+names);
        System.out.println("Age->"+age);

        sc.close();

    }
}
