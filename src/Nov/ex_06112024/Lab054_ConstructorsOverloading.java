package Nov.ex_06112024;

public class Lab054_ConstructorsOverloading {
    public static void main(String[] args) {

        car3 c1 = new car3();
        System.out.println("Default");
        c1.display();

        car3 c2 = new car3("tesla",2019);
        System.out.println("2 parameters");
        c2.display();

        car3 c3 = new car3("tata");
        System.out.println("1 param");
        c3.display();
    }
}

class car3 {
    String modelname;
    int yearcreated;

    car3(){
        modelname = "Default";
        yearcreated =  0;
    }
    //constructor over loading
    //with 2 param
    car3(String model, int year) {
        this.modelname = model;
        this.yearcreated = year;
    }
    car3(String model){
        this.modelname = model;
    }
    void display(){
        System.out.println("Car details->"+this.modelname+" and "+this.yearcreated);
    }
}
