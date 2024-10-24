package Oct.Task;

public class Oct22_Task1 {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;
        for (int i=0; num!=0; i++){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.print(rev);
    }
}
