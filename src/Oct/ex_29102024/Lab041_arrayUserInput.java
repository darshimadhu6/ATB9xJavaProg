package Oct.ex_29102024;

import java.util.Scanner;

public class Lab041_arrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int [] nums = new int[size];

        for (int i =0;i<size;i++){
            System.out.println("Enter the number->");
            nums[i] = sc.nextInt();
        }


    }
}

