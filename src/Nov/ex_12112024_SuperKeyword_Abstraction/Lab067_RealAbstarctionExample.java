package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab067_RealAbstarctionExample {
    public static void main(String[] args) {
        wagonR r = new wagonR();
        r.drive();

        tesla t = new tesla();
        t.drive();
    }
}

class tesla extends Engine{
    void drive(){
        startEngine();
        stopEngine();
    }
    @Override
    void startEngine() {
        System.out.println("Tesla Engine Started");
    }
    @Override
    void stopEngine() {
        System.out.println("Tesla Engine Stopped");
    }
}

class wagonR extends Engine{

    void drive(){
        startEngine();
        stopEngine();
    }
    @Override
    void startEngine() {
        System.out.println("WagonR Engine Started");
    }

    @Override
    void stopEngine() {
        System.out.println("WagonR Engine Stopped");
    }
}

abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
}
