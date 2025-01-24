import java.lang.reflect.Array;
import java.util.ArrayList;
// import java.util.List;
class Employee {
    int id;
    String emp_name;
    double salary;
    Department department;

    Employee(Department department){
        this.department = department;
    }

    public void setEmployee(int id, String emp_name, double salary, Department department) {
        this.id = id;
        this.emp_name = emp_name;
        this.salary = salary;
        this.department = department;
    }

    public void getEmployee(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Department: " + department.dept_name);
    }
}

class Department{
    int dept_id;
    int emp_id;
    String dept_name;

    Department(int dept_id,int emp_id,String dept_name){
        this.dept_id = dept_id;
        this.emp_id = emp_id;
        this.dept_name = dept_name;
    }
    public void setDepartment(int dept_id,int emp_id,String dept_name) {
        this.dept_id = dept_id;
        this.emp_id = emp_id;
        this.dept_name = dept_name;
    }

    public void getDepartment(){
        System.out.println("Department ID: " + dept_id);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Department: " + dept_name);
    }
}



class JAamkaam{
    public static void main(String[] args){
        Department d = new Department(0,1,"cs");
        Employee e = new Employee(d);
        ArrayList<Employee> emp = new ArrayList<>();
        // emp.put(e);

        System.out.println("Employee Details");
        e.setEmployee(1,"Parth",1000,d);
        e.getEmployee();
        System.out.println("Department Details");
        // d.setDepartment(1,1,"Parth");
        d.getDepartment();

        
    }
}
