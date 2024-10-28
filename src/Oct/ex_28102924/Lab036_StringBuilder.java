package Oct.ex_28102924;

public class Lab036_StringBuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Darshi");
        name.append("Madhu");
        System.out.println(name);
        System.out.println(name.reverse());
        System.out.println(name.replace(1,2,"madh"));

        StringBuffer nameb = new StringBuffer("Darshi");
        name.append("Madhu");
        System.out.println(nameb);

    }
}
