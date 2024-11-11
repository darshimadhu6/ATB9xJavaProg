package Nov.ex_07and08112024_Inheritance.Hierarchical;

import java.util.logging.SocketHandler;

public class Lab058 {
    public static void main(String[] args) {
        Daughter1 d1 = new Daughter1();
        d1.home();
        d1.homeD();

        son1 s1 = new son1();
        s1.home();
        s1.homeP();

        Son2 s2 = new Son2();
        s2.home();
        s2.homeC();
    }
}
