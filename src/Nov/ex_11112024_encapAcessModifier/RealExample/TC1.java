package Nov.ex_11112024_encapAcessModifier.RealExample;

public class TC1 extends BaseClass{
    public TC1(){
        System.out.println("DC - Tc1");
    }
    public void startTC(){
        openBrowser();
        closeBrowser();
    }
    @Override
    public void setBrowser(String browser, Boolean isAuth) {
        System.out.println("own logic");
        super.setBrowser(browser, isAuth);
    }

}
