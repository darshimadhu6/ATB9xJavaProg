package Oct.ex_30102024;

public class Lab045_2Darray_iteration {
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6,},{7,8,9}};
        //System.out.println(a[0].length);
        for(int i = 0; i < a.length;i++){
            for ( int j =0;j < a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
