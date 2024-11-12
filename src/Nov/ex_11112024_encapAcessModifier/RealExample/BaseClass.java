package Nov.ex_11112024_encapAcessModifier.RealExample;

public class BaseClass {

    private String browser;

    BaseClass(){
        System.out.println("DC-Baseclass");
    }
    BaseClass(String b){
        System.out.println("CC-Baseclass");
    }
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, Boolean isAuth) {
        if (isAuth){
            this.browser = browser;
        }
        else{
            System.out.println("Not allowed!");
        }

    }
    public void openBrowser(){
        System.out.println("Opening Browser");
    }
    //method overloading
    public void openBrowser(String browserName){
        System.out.println("Opening Browser->"+browserName);
    }

    public void closeBrowser(){
        System.out.println("Closing Browser");
    }
}
