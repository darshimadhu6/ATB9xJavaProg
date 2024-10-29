package Oct.Task;

public class Oct29_task1_method1 {
    public static void main(String[] args) {
        int[] arr = {20,40,12,36,20,1,80,75};
        if (duplicate(arr))
        {
            System.out.println("Duplicate found");
        }
        else{
            System.out.println("Duplicate not found");
        }

    }

    public static boolean duplicate(int [] arr){
        int dup = arr[0];
        for ( int i = 1; i<arr.length;i++){
            if (arr[i] == dup){
                return true;
            }
        }
        return false;
    }
}
