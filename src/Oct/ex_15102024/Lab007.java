package Oct.ex_15102024;

public class Lab007 {
    public static void main(String[] args) {
        //Ternary operator
        int a = 9;
        System.out.println(a>10?"A is greater":"A is lesser");

        int age =27;
        String allow = age > 18?"Allow to vote age is "+age :"Don't allow age is "+age;
        System.out.println(allow);

        //largerst of numbers
        int x = 40,b= 70, c = 60;
        String larg =  ((x > b) && (x > c))? "x is larger" : (b > c)? "b is larger": "c is larger";
        System.out.println(larg);


    }
}
