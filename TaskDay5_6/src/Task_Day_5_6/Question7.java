package Task_Day_5_6;

class Employee2 extends Employee {
    Employee2(String name,int employee_Id, int salary){
        this.name=name;
        this.employee_ID=employee_Id;
        this.salary=salary;
    }
    Employee2(String name,int employee_Id){
        this.name=name;
        this.employee_ID=employee_Id;

    }

}
public class Question7 {
    public static void main(String[] args) {
        Employee2 employee2=new Employee2("Raju",989,10000);
        System.out.println("Employee Name- "+employee2.name+" : " +"Employee Id- " +employee2.employee_ID+" : "+"Employee Salary- " +employee2.salary);
        Employee2 employee21=new Employee2("Kapil",709);
        System.out.println("Employee Name- "+employee21.name+" : " +"Employee Id- " +employee21.employee_ID);
    }
}
