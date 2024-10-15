package Oct.ex_15102024;

public class LAB008 {
    public static void main(String[] args) {
//        grade using ternary
        int marks = 28;
        String res = (marks>=85)? "A" : (marks>=70)? "B" : (marks>=60)? "C" : (marks >= 35)?"D" : "F";
        System.out.println(res);
    }
}
