package Nov.ex_07and08112024_Inheritance.SingleInheritance.Example2;

public class Python extends Programming {
    void print() {

        System.out.println(version);
        System.out.println(author);
    }
    Python(){
        System.out.println("DC- Child");
    }

    public static void main(String[] args) {
        Python p1 = new Python();
        System.out.println(p1.author);
        //p1.print();
    }
}
