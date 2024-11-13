package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab069_interface_exm2 {
}

class P implements I1 {
    @Override
    public void f1() {
        System.out.println("F1");
    }

    @Override
    public void f2() {
        System.out.println("F2");
    }

    @Override
    public void f3() {
        System.out.println("F3");
    }
}


interface  I1{
    void f1();
    void f2();
    void f3();
}
