package Oct.ex_29102024;

import java.util.Arrays;

public class Lab039_arrayIterate {
    public static void main(String[] args) {
        int [] marks = {90,95,86,89,45,56};
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println("------------");
        for (int i =0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);
        int item_index =  Arrays.binarySearch(marks,56);
        System.out.println(item_index);

    }
}
