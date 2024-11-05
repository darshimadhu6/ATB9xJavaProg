package Task;

public class Nov5_Task1_DogClass {
    String color;
    int size;
    String breed;
    int age;

    void eat(){
        System.out.println("Dog is eating");
    }
    boolean sleep(){
        return true;
    }
    String run(int d){
        return "Dog is able to run " +d+ " miles";
    }
    void sit(String n){
        System.out.println(n+ " is sitting without barking");
    }

}
