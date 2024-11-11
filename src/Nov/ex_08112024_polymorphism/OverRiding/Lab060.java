package Nov.ex_08112024_polymorphism.OverRiding;

public class Lab060 {
    public static void main(String[] args) {
    Hound h1 = new Hound();
    Dog d1 = new Dog();
    d1.bark();
    h1.bark();
    }
}

class Dog{
    void bark(){
        System.out.println("I am dog, I will bark!");
    }
    int age = 10;
}
 class Hound extends Dog{
    //@Override
    void bark(){
        System.out.println("I am Hound, I will sniff!");
    }
 }