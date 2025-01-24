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
        System.out.println("\n");
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
        System.out.println("\n");
    }
}



class JAamkaam{
    public static void main(String[] args){
        ArrayList<Employee> emp = new ArrayList<>();
        ArrayList<Department> dept = new ArrayList<>();

        Department d = new Department(0,1,"QA");
        Department d1 = new Department(0,1,"finance");
        Department d2 = new Department(0,1,"marketing");
        Department d3 = new Department(0,1,"HR");
        Department d4 = new Department(0,1,"Software");
        Department d5 = new Department(0,1,"QC");

        // Department d = new Department(0,1,"cs");
        Employee e = new Employee(d);
        Employee e1 = new Employee(d);
        Employee e2 = new Employee(d);
        Employee e3 = new Employee(d);
        Employee e4 = new Employee(d);
        Employee e5 = new Employee(d);

        
        // emp.put(e);

        System.out.println("Employee Details");
        e.setEmployee(1,"Parth",1000,d);
        e1.setEmployee(1,"Anshul",2000,d);
        e2.setEmployee(1,"Ajinkya",3000,d);
        e3.setEmployee(1,"Mohit",4000,d);
        e4.setEmployee(1,"Ayush",5000,d);
        System.out.println("Department Details");

        emp.add(e);
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);

        dept.add(d);
        dept.add(d1);
        dept.add(d2);
        dept.add(d3);
        dept.add(d4);
        dept.add(d5);

        emp.forEach((n) -> {
            n.getEmployee();
        });
        dept.forEach((n) -> {
            n.getDepartment();
        });

        
    }
}
