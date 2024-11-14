package Nov.ex_14112024_Static_wrapper_exceptions;

public class Lab075_ENUM3 {
    public static void main(String[] args) {
        System.out.println(color.RED.gethexcode());
    }
}

enum color{
    RED("FF0000"), GREEN("00FF00"), BLUE("0000FF");

    private String hexcode;
    color(String hexcode){
        this.hexcode = hexcode;
    }

    public String gethexcode(){
        return hexcode;
    }
}
