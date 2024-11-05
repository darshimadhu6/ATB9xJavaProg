package Task;

public class Oct15_Task2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);//++a 11 11, a++ 11 12, a++ 12 13
        System.out.println(a);
    }
}
