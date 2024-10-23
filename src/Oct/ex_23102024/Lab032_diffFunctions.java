package Oct.ex_23102024;

public class Lab032_diffFunctions {
    public static void main(String[] args) {
        greet();
        System.out.println(greet1());
        greet2("madhu");
        System.out.println(prod(3,4));
    }
    //No args no return type
    static void greet(){
        System.out.println("Hello");
    }

    //No args with return type
    static String greet1(){
        return "Hi, Hello";
    }
    //With args no return type
    static void greet2(String name){
        System.out.println("Hi, Hello "+name);
    }
    //with args and with return type
    static int prod(int a, int b){
        return a*b;
    }

}
