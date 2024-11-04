package Oct.ex_30102024;

public class Lab043_Array_forEach {
    public static void main(String[] args) {
        int[] a = {1,8,9,0,98};
        for (int i : a){
            System.out.printf(i+"\t");
        }
        System.out.println("\n<------------------>");
        String [] names = {"a","ba","cf","ui","ki"};
        for (String nam : names){
            System.out.print(nam+"\t");
        }
    }
}
