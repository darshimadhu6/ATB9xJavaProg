package Nov.ex_07and08112024_Inheritance.Multilevel;

public class Lab057_Multilevel {
    public static void main(String[] args) {
        child s1 = new child();
        s1.gf();
        s1.father();
        s1.home();//has home in all the class but it results the latest one exm -
        // ow childs prints if child doesnt have it prints fathers
        s1.child();

        father f1 = new father();
        f1.gf();
        f1.father();
        f1.home();
    }
}
