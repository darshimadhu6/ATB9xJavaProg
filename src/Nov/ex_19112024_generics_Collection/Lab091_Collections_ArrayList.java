package Nov.ex_19112024_generics_Collection;
import java.util.Collection;
import java.util.ArrayList;
public class Lab091_Collections_ArrayList {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/6/docs/api/java/util/List.html
        ArrayList stulis = new ArrayList();
        stulis.add("Madhu");
        stulis.add("Madhu");
        stulis.add(1,"Man");//adding element at specified index
        stulis.add("Darshi");
        stulis.add("26");
        stulis.add(true);
        stulis.add(null);

        System.out.println(stulis);
        System.out.println(stulis.size());
        System.out.println(stulis.isEmpty());
        System.out.println(stulis.contains("2"));
        System.out.println(stulis.contains(20));//integer check
        System.out.println(stulis.indexOf(true));
        System.out.println(stulis.lastIndexOf("Madhu"));
        System.out.println(stulis.indexOf("Madhu"));

    }

}
