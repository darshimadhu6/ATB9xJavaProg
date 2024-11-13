package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab066_RealAbstarctionExample {
    public static void main(String[] args) {
        Son c = new Son();
        c.loan50k();
        c.loan25k();
    }
}

class Son extends Father{
    @Override
    void loan50k() {
        System.out.println("Son paid 50k");
    }
}

abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Father paid of 25k");
    }
}