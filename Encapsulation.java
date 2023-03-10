                       Encapsulation
Encapsulation is a mechanism to protect private hidden from other users. It wraps the data and methods as a single bundle. private is the keyword used to declare the variables or methods as private. You can make public set and get methods to access private variables.

public class Employee{
    public static void main(String args[]){
         EmployeeDetails o = new EmployeeDetails();
         o.setname("foo");
         o.setempId(12345);
         o.setsalary(20000);
         System.out.println("Employee Name: " + o.getname());
         System.out.println("Employee ID: " + o.getempId());
         System.out.println("Employee Salary: " + o.getsalary());
         /*System.out.println("Employee Name: " + EmployeeDetails.name);
         System.out.println("Employee ID: " + EmployeeDetails.empId);
         System.out.println("Employee Salary: " + EmployeeDetails.salary);*/
    } 
}

class EmployeeDetails{
    private String name;
    private int empId;
    private int salary;

    //Getter and Setter methods
    public int getempId(){
        return empId;
    }

    public String getname(){
        return name;
    }

    public int getsalary(){
        return salary;
    }

    public void setempId(int newId){
        empId = newId;
    }

    public void setname(String newName){
        name = newName;
    }

    public void setsalary(int newSalary){
        salary = newSalary;
    }
}


Output:

Employee Name: foo
Employee ID: 12345
Employee Salary: 20000
