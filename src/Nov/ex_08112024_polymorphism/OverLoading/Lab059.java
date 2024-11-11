package Nov.ex_08112024_polymorphism.OverLoading;

public class Lab059 {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        float resultf = math.add(10.9f,30.8f);
        int result = math.add(10, 20);
        int res = math.add(10,15,25);
        System.out.println(resultf);
        System.out.println(result);
        System.out.println(res);

    }

}

class MathOperation{
    int add(int a, int b){
        return a+b;
    }

    float add(float a, float b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}
