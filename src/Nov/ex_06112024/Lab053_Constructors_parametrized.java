package Nov.ex_06112024;

import java.util.Scanner;

public class Lab053_Constructors_parametrized {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        car2 c1 = new car2("Tesla",2019);
        System.out.println(c1.model);
        System.out.println(c1.year);
        c1.display();

        car2 c2 = new car2("Benz",1970);
        System.out.println(c2.model);
        System.out.println(c2.year);
        c2.display();

        System.out.println("Pls enter the car model");
        String model_name = sc.nextLine();
        System.out.println("Pls enter the car year");
        int year = sc.nextInt();
        car2 c3 = new car2(model_name,year);
        System.out.println(c3.model);
        System.out.println(c3.year);
        c3.display();
    }
}

class car2 {
    String model;
    int year;

    //Parameterized constructor
    car2(String model_name, int year_created){
        System.out.println("PC is executed");
        this.model = model_name;
        this.year = year_created;
    }
    void display(){
        System.out.println("Car details->"+this.model+" and "+this.year);
    }
}
