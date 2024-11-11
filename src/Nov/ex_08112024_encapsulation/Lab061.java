package Nov.ex_08112024_encapsulation;

public class Lab061 {
    public static void main(String[] args) {
        VMOLogin v1 = new VMOLogin("admin","password");
        //System.out.println(v1.password);//password is visible

        //private varibale class
        GoodVMOLogin v2 = new GoodVMOLogin("admin", "password");
        //System.out.println(v2.password);//Unable to access the password
        String pw = v2.getPassword(true);
        System.out.println(pw);
        v2.setPassword("Newpass",true);
        String newpw = v2.getPassword(true);
        System.out.println(newpw);
    }
}
class VMOLogin{
    public String username;
    public String password;

    public VMOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class GoodVMOLogin{
    private String username;
    private String password;

    public String getPassword(Boolean isAdmin) {
        if (isAdmin){
            return password;
        }
        return "Not allowed";

    }

    public void setPassword(String newpassword,Boolean isAdmin) {
        if (isAdmin){
            this.password = newpassword;
        }
        else{
            System.out.println("Not allowed");
        }

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public GoodVMOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

//    public String getpass(Boolean isAuth){
//        if (isAuth){
//            return this.password;
//        }else{
//            return "Not allowed";
//        }
//    }
}
