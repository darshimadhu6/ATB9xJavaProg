package Oct.ex_16102024;

import java.sql.SQLOutput;

public class Lab011_cmdlneArguments {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        String name = args[1];
        System.out.println(age > 24? name+" is Allowed": name+ "isn't allowed!");

    }

}
