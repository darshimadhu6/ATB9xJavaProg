package Task.Nov;

public class Nov5_Task1_Runner_Class {
    public static void main(String[] args) {
        //obj1
        Nov5_Task1_DogClass D1 = new Nov5_Task1_DogClass();
        D1.age = 3;
        D1.breed = "Labrador";
        D1.color = "Cream";
        D1.size = 18;
        D1.eat();
        boolean  sleep = D1.sleep();
        if (sleep){
            System.out.println("Dog is sleeping");
        }
        System.out.println(D1.run(3));
        D1.sit("Charlie");
        System.out.println("-------------------------");
        //obj 2
        Nov5_Task1_DogClass D2 = new Nov5_Task1_DogClass();
        D2.age = 6;
        D2.breed = "Golden Retriever";
        D2.color = "Gold";
        D2.size = 22;
        D2.eat();
        boolean  sleep2 = D1.sleep();
        if (sleep2){
            System.out.println("Dog is sleeping");
        }
        System.out.println(D1.run(3));
        D2.sit("jack");
        System.out.println("-------------------------");

        //Obj3
        Nov5_Task1_DogClass D3 = new Nov5_Task1_DogClass();
        D3.age = 8;
        D3.breed = "Husky";
        D3.color = "White";
        D3.size = 20;
        D3.eat();
        boolean  sleep3 = D1.sleep();
        if (sleep3){
            System.out.println("Dog is not sleeping");
        }
        System.out.println(D1.run(3));
        D3.sit("Charlie");

        //obj4
        Nov5_Task1_DogClass D4 = new Nov5_Task1_DogClass();
        //obj5
        Nov5_Task1_DogClass D5 = new Nov5_Task1_DogClass();
    }
}
