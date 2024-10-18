package Oct.ex_18102024;

public class Lab020_SwitchOneliner {
    public static void main(String[] args) {
        int num = 2;
        switch (num){

            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            default -> System.out.println("None");

        }
    }
}
