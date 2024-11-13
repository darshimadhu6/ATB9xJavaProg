package Nov.ex_12112024_SuperKeyword_Abstraction;

public class Lab065_abstraction {
    public static void main(String[] args) {
        approve l1 = new approve();
        l1.loan50k();
        l1.loan25k();
    }
}

class approve extends Loan{
    @Override
    void loan50k() {
        System.out.println("logic of 50k");
    }
}
abstract class Loan{
    abstract void loan50k();

    void loan25k(){
        System.out.println("logic of 25k");
    }
}
