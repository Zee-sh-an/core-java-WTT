package Task_Day_5_6;

class Employee{
    String name;
    int employee_ID;
    int salary;
    public void annualSalary(int salary){
        System.out.println("Annual salary is " + salary*12);
    }
}

public class Question4 {

    public static void main(String[] args) {

        Employee employee=new Employee();
        employee.name ="Udit";
        employee.employee_ID=56;
        employee.salary=20000;
        System.out.println("Name - "+employee.name+" : "+" ID - "+employee.employee_ID+" : "+" Salary - "+ employee.salary);

        employee.annualSalary(employee.salary);
    }
}
