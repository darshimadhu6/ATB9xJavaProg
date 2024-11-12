package Nov.ex_11112024_encapAcessModifier;

import Nov.ex_11112024_encapAcessModifier.RealExample.BaseClass;
import Nov.ex_11112024_encapAcessModifier.RealExample.TC1;

public class Lab062 {
    //public : availbale to all
    // private : onlyto that cals not evne for subclass
    // protected : only to the members in same package and subclass in different package
    public static void main(String[] args) {
        //BaseClass tc1 = new TC1();//father ref child obj i.e Dynamic dispatch
        TC1 tc1 = new TC1();
        tc1.setBrowser("chorme",true);
        System.out.println(tc1.getBrowser());
        tc1.startTC();
    }

}
