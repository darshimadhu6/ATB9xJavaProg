package Task.Oct;

public class Oct29_Task1_method2 {
    public static void main(String[] args) {
        int[] arr = {20,40,12,36,20,1,80,75};
        if (dupli(arr)){
            System.out.println("Duplicate found");
        }
        else{
            System.out.println("Duplicate not found");
        }


    }
    public static boolean dupli(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for ( int j = i+1; j < arr.length;j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return  false;
    }

}
