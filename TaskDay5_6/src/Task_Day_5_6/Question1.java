package src.Task_Day_5_6;

class  Student{
    String name;
    int roll_number;
    String grade;
}
public class Question1 {

    public static void main(String[] args) {

        Student student=new Student();
        student.name="Zeeshan";
        student.roll_number=98;
        student.grade="A";
        System.out.println(student.name+" : "+student.roll_number+" : "+student.grade);

        Student student1=new Student();
        student1.name="Karan";
        student1.roll_number=78;
        student1.grade="B";
        System.out.println(student1.name+" : "+student1.roll_number+" : "+student1.grade);
    }
}