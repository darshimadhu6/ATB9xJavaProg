package Nov.ex_06112024;

public class Lab052_Constructors_default {
    public static void main(String[] args) {
        Car tesla = new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);

        Car nano = new Car();
        nano.name = "Nano";
        System.out.println(nano.name);
        System.out.println(nano.year);
    }
}

