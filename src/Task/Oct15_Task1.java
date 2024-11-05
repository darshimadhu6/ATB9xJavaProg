package Task;

public class Oct15_Task1 {
    public static void main(String[] args) {

        //largerst of numbers
        int a = 40,b= 70, c = 60;
        System.out.println("The numbers are a = 40,b= 70, c = 60");
        String larg =  ((a > b) && (a > c))? "a is larger "+a : (b > c)? "b is larger "+b: "c is larger "+c;
        System.out.println(larg);

    }
}
