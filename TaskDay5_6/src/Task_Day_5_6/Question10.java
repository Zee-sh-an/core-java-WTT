package Task_Day_5_6;

class Employee3{
    String name;
    int salary;
    Employee3(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}
class EmployeeData{
    Employee3[] employee3 = new Employee3[4];

    public void addEmployee(String name,int salary,int index){
        employee3[index]=new Employee3(name,salary);
    }

    public void searchByName(String searchName){
        int count=0;
        for (Employee3 a:employee3) {
            if (a.name.toLowerCase().equals(searchName.toLowerCase())){
                System.out.println("Employee is present");
                count=count+1;
            }
        }
        if (count==0){
            System.out.println("Employee is not present");
        }
    }

    public void calculateSalary(){
        int count=0;
        for (int i=0;i<4;i++){
            count = count+employee3[i].salary;
        }
        System.out.println("Salary of all employees is " + count);
    }
}
public class Question10 {

    public static void main(String[] args) {
        EmployeeData employeeData=new EmployeeData();

        employeeData.addEmployee("Raghav",10000,0);
        employeeData.addEmployee("Karan",15000,1);
        employeeData.addEmployee("Shiva",9000,2);
        employeeData.addEmployee("Anand",20000,3);

        employeeData.calculateSalary();
        employeeData.searchByName("raghav");
    }

}
