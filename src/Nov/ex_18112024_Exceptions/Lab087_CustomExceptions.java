package Nov.ex_18112024_Exceptions;

public class Lab087_CustomExceptions {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR", 100);
        Bank hdfc = new Bank("INR", 200);
        System.out.println(sbi.add(hdfc));

        Bank jpMorg = new Bank("USD", 100);
        System.out.println(sbi.add(jpMorg));
    }

}
class Bank{
    private String cur;
    private Integer bal;

    public Bank(String currency, int balance){
        this.cur = currency;
        this.bal = balance;
    }
    //getter setter
    public String getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public Integer getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public Integer add(Bank bankName) throws Exception {
        if(!bankName.cur.equalsIgnoreCase("INR")){
            throw new Exception("Currency Mismatch! Cant proceed");
        }
        return bankName.bal + this.bal;
    }

}
