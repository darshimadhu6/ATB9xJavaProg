package Nov.ex_07112024_Inheritance.SingleInheritance.RealExample;

public class TestCase extends BaseTest{
    TestCase(){
        System.out.println("DC - Child");
    }

    void tc1(){
        StartBrowser();
        ExitBrowser();

    }
}
