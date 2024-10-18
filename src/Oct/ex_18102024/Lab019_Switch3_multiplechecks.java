package Oct.ex_18102024;

public class Lab019_Switch3_multiplechecks {
    public static void main(String[] args) {
        int item = 002;
        switch (item){
            case 001,003,005:
                System.out.println("All are odd");
                break;

            default:
                System.out.println("All are even");
                break;
        }
    }
}
