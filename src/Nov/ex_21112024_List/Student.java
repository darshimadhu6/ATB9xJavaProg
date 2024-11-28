package Nov.ex_21112024_List;

public class Student {
    private String name;
    private int roll;

    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int age) {
        this.roll = roll;
    }

    public void printDetails(){
        System.out.println("StudentName : "+this.name);
        System.out.println("StudentAge : "+this.roll);
    }
}
