package Oct.ex_28102024;

public class Lab035_StringFunctions {
    public static void main(String[] args) {
        String fn = "Madhu";
        //length
        System.out.println(fn.length());
        //CharAt
        System.out.println(fn.charAt(2));
        //substring
        System.out.println(fn.substring(3));
        //concat
        String ln = "darshi";
        System.out.println(fn.concat(ln));
        System.out.println(fn+ln);
        //Split
        String fruits = "apple,banana,cherry";
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);
        //charAt
//        String fn = "Madhu";
        System.out.println(fn.charAt(2));
        //System.out.println(fn.charAt(12));//index bound exception
        //trim
        String name = "   Madhu   ";
        System.out.println(name.trim());
        //contains
        System.out.println(name.contains("dhu"));
        //lastIndexOf
        String fulname = "Madhudarshi";
        System.out.println(fulname.lastIndexOf('d'));
        //replace
        System.out.println(fulname.replace('a','z'));
        //startswith endswith
        System.out.println(fulname.startsWith("Ma"));
        System.out.println(fulname.endsWith("o"));
    }
}
