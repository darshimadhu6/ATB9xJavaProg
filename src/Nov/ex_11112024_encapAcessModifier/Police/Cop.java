package Nov.ex_11112024_encapAcessModifier.Police;

public class Cop {
    private int gun;
    public String iCard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes! you can");
    }
}
