package Oct.ex_29102024;

import java.lang.reflect.Array;

public class Lab040_MinMaxArray {
    public static void main(String[] args) {
        int [] num = {20,30,-2,34,1,20,0,8};
        System.out.printf("The max number is %d",max_num(num));
        System.out.printf("\nThe min number is %d",min_num(num));
        //other way is to sort and select 0 for min and length -1 for max
//        System.out.printf("\nThe max number using inbuilt is %d");
//        System.out.printf("\nThe min number is %d");

    }
    public static int max_num(int [] num){
        int max = 0;
        for (int i =0; i<num.length; i++){
            if (num[i] > max){
                max = num[i];
            }
        }
        return max;
    }
    public static int min_num(int [] num){
        int min = 0;
        for ( int i =0; i < num.length;i++){
            if (num[i] < min){
                min = num[i];
            }
        }
        return min;
    }
}
