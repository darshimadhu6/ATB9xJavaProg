package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab063_Super {
    public static void main(String[] args) {
        car c = new car();
        //System.out.println(c.max_speed);
    }
}

class car extends Vehicle{
    private int max_speed = 280;

    @Override
    void display(){
        System.out.println("child");
    }
    car(){
        super(10);
        System.out.println("DC - Car");
        System.out.println(this.max_speed);
        System.out.println(super.max_speed);
        this.display();
        super.display();

    }

}


class Vehicle{
    public int max_speed = 180;

    void display(){
        System.out.println("parent");
    }
    Vehicle(){
        System.out.println("DC - Vehicle");
    }
    Vehicle(int a){
        System.out.println("PC - Vehicle");
    }

    void message(){
        System.out.println("Hello Vehicle");
    }

    void message(int a ){
        System.out.println("Hello Vehicle - super");
    }
}
