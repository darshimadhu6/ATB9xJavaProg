package Oct.ex_22102024;

import java.util.Scanner;

public class Lab028_whileloop_userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age -> ");
        int age = sc.nextInt();
        while (age > 0){
            System.out.println(age);
            age--;
        }

    }
}
