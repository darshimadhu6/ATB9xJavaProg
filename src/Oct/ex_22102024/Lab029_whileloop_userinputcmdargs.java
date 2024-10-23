package Oct.ex_22102024;

public class Lab029_whileloop_userinputcmdargs {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age -> ");
        int age = Integer.parseInt(args[0]);
        while (age > 0) {
            System.out.println(age);
            age--;
        }

    }
}
