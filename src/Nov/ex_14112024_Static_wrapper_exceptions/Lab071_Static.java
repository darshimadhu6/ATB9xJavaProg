package Nov.ex_14112024_Static_wrapper_exceptions;

public class Lab071_Static {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        //System.out.println(s1.age); error
//        System.out.println(Student.school);//without obj also it prints
//        Student s2 = new Student();

          Student s3 = new Student(20);
          System.out.println(s3.age);
          Student s4 = new Student(30);
          Student.school = "XYZ";
          System.out.println(Student.school);
          System.out.println(s3.school);
    }
}

class Student{
    int age = 10;
    static String school = "LBESHS";

    Student(int a){
        this.age = a;
    }

    {
        System.out.println("IIB");
        System.out.println("I will execute when obj is created");
    }
    static{
        System.out.println("SIB");
    }
}
