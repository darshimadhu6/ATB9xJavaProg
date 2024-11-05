package Task;

import java.util.Scanner;

public class oct30_Task1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the pattern to be printed");
        int size = sc.nextInt();
        for(int i = 0;i < size;i++){
            for(int j = size;j > i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
