package Task.Nov;

public class Nov15_Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int [] revaarr = new int[5];
        int j = arr.length;
//        revaarr = new int[arr.length];
//        System.out.println(revaarr);
        for (int i =0; i <= arr.length - 1; i++){
            revaarr[j-1] = arr[i];
            j = j - 1;
        }
        for(int i:revaarr){
            System.out.println(i);
        }
    }
}