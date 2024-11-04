package Oct.ex_30102024;

public class Lab050_starpattern {
    public static void main(String[] args) {
        //Right triangle
        /*
        *
        **
        ***
        ****
        *****
         */
//        for(int i = 0; i < 5;i++){
//            for ( int j =0;j <= i;j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println("");
//        }

        for(int a=0;a<5;a++){
            for(int b=0; b <= a;b++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //left triangle
        /*
         *
         **
         ***
         ****
         *****
         */
        for(int b=0;b<5;b++){
            for(int c=5; c > b;c--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
