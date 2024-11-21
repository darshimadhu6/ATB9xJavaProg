package Nov.ex_19112024_generics_Collection;

public class Lab090_Generics {
    public static void main(String[] args) {
        sum(20,30);
        sum("madhu","darshi");
        sum(true,false);
    }

    public static <E> E sum(E a, E b){
        System.out.println(a);
        System.out.println(b);
        return null;

    }
}
