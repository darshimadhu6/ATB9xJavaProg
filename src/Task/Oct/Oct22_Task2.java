package Task.Oct;

import java.util.Scanner;

public class Oct22_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string -> ");
        String str = sc.nextLine();
        int vow = 0, cons = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
                    || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
            {
                vow++;
            }
            else{
                cons++;
            }

        }
        System.out.println("Vowels->"+vow+" Consonants->"+cons);
    }
}
