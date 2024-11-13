package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab070_interface_multiple_Inheritance {
}

class child implements father,mother{
    @Override
    public void f2() {
        System.out.println("child - F2");
    }

    @Override
    public void f1() {
        System.out.println("child - F1");
    }

    @Override
        public void home() {
        System.out.println("child - Home");
    }
}

interface father{

    void f1();
    void home();
}
interface mother{
    void f2();
    void home();
}
