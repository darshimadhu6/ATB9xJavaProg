package Oct.ex_21102024;

public class Lab_026_continue {
    public static void main(String[] args) {
        //skip the below code and move to top loop
        for (int i =0; i<10;i++){
            if (i==5){
                System.out.println("FIVE");
                continue;//goes to top of the loop and ignores the below code

            }
            System.out.println(i);
        }
    }
}
