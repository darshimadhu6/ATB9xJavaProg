package Nov.ex_14112024_Static_wrapper_exceptions;

public class Lab072_Example {
    public static void main(String[] args) {
        ATB s1 = new ATB("Rahul", 12345);
        //s1.displayinfo();
        ATB s2 = new ATB("Rohit", 123456);
        //s2.displayinfo();
        //ATB.displayinfo2();
        s1.displayinfo();
        s2.displayinfo();
        ATB.displayinfo2();
        System.out.println(ATB.courseName);
    }
}

class ATB{

    {
        System.out.println("IIB");
        System.out.println("load the file");
    }
    static{
        System.out.println("SIB");
        System.out.println("launch page");
    }
    private String name;
    private long phone;
    static String courseName = "ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    ATB(String name, long num){
        this.name = name;
        this.phone = num;
    }

    void displayinfo(){
        System.out.println(courseName);
        System.out.println(name);
    }
    static void displayinfo2(){
        System.out.println(courseName);
        //System.out.println(phone);//not able to access bcz obj creation is required
    }

}