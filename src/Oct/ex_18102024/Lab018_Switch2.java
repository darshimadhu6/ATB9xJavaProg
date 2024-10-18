package Oct.ex_18102024;

import java.util.Scanner;

public class Lab018_Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser choice");
        String browser = sc.next().toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Chrome browser selected");
                System.out.println("..............");
                break;
            case "firefox":
                System.out.println("Firefox browser selected");
                System.out.println("..............");
                break;
            case "edge":
                System.out.println("Edge browser selected");
                System.out.println("..............");
                break;
            default:
                System.out.println("No idea of the browser");
                break;
        }
    }
}
