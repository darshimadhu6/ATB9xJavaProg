package HackerRankQues;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your score->");
            int score = sc.nextInt();

            if (score >= 90 && score <=100) {
                System.out.println("For " + score + " Your grade is A");
            } else if (score >= 80 && score < 90) {
                System.out.println("For " + score + " Your grade is B");
            } else if (score >= 70 && score < 80) {
                System.out.println("For " + score + " Your grade is C");
            } else if (score >= 60 && score < 70) {
                System.out.println("For " + score + " Your grade is D");
            }
            else if (score < 0 || score >100){
                System.out.println("Invalid Score!!");
            }
            else {
                System.out.println("For " + score + " Your grade is F");
            }
        } catch (InputMismatchException e){
            System.out.println("Enter only integer!");
        }
    }
}
