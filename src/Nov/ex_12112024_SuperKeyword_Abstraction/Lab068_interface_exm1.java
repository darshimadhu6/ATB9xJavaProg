package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab068_interface_exm1 {
}

abstract class ABC{

    ABC() {
        System.out.println("DC - abstract");
    }
    abstract void m1();

    void m2(){
        System.out.println("Complete Method!");
    }
}

interface I{
    void m1();
    void m2();

//    void m3(){
//        System.out.println("Complete Method!");
//    }
    default void m4(){
        System.out.println("Default Method!");
    }

    default void m5(){
        System.out.println("Default Method 2!");
    }

    static void m6(){
        System.out.println("Static Method!");
    }
}