package Oct.Task;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Oct11_24_Task {
    public static void main(String[] args) {
        int a = 20, b = 10;
        int c = 40, d = 30;
        boolean m = true, n = false;
        System.out.println("--Arithmetic operations--");
        System.out.println("Value a = 20, b = 10;");
        System.out.println("Addition is "+ (a+b));
        System.out.println("Subtraction is "+ (a-b));
        System.out.println("Multiplication is "+ (a*b));
        System.out.println("Division is "+ (a/b));
        System.out.println("Modulo is "+ (a/3));
        System.out.println("-------------------------");
        System.out.println("--Relational operations--");
        System.out.println("Value c = 40, b = 30;");
        System.out.println("Greater than "+ (c>d));
        System.out.println("Lesser than "+ (c<d));
        System.out.println("Greater or equal to "+ (c>=d));
        System.out.println("Lesser or equal to "+ (c<=d));
        System.out.println("equal to "+ (c==d));
        System.out.println("Not equal to "+ (c!=d));
        System.out.println("-------------------------");
        System.out.println("--Boolean operations--");
        System.out.println(("Value m = true, n = false;"));
        System.out.println("AND operator " + (m&&n));
        System.out.println("OR operator " + (m||n));
        System.out.println("NOT operator " + (!m));
        System.out.println("-------------------------");
        System.out.println("Assignment operator");
        int i = 4, j= 2;
        System.out.println("Values i = 4, j= 2");
        System.out.println("add and assign i += j "+(i+=j));
        System.out.println("subtract and assign i -= j "+(i-=j));
        System.out.println("multiply and assign i *= j "+(i*=j));
        System.out.println("divide and assign i /= j "+(i/=j));
        System.out.println("-------------------------");
        int k=3;
        System.out.println("Unary operator");
        System.out.println("Value k=3");
        System.out.println("Post increment "+(k++));
        System.out.println("Post decrement "+(k--));
        System.out.println("Pre increment "+(++k));
        System.out.println("Pre decrement "+(--k));
        System.out.println("-------------------------");
        System.out.println("Ternary operator");
        System.out.println("Value a = 20, b = 10;");
        System.out.println(a>b?a:b);
        int x =5, y=10;
        System.out.println("Value x = 5, y= 10;");
        System.out.println(x>y?x:y);
        System.out.println("-------------------------");
        System.out.println("Bitwise operator");
        System.out.println("Value x = 5, y= 10;");
        System.out.println("Bitwise AND " +(x&y));
        System.out.println("Bitwise OR " +(x|y));
        System.out.println("XOR  " +(x^y));
        System.out.println("Bitwise NOT " +(~y));

    }
}
