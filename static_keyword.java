class A{
    int empNo;
    String empName;
    static String company = "TCS";

    public void setemp(int empNo, String empName){
        this.empNo = empNo;
        this.empName = empName;
    }
    public void getemp(){
        System.out.println("Employee No: "+empNo);
        System.out.println("Employee Name: "+empName);
    }
}

public class static_keyword{
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        a1.setemp(101, "Ajinkya");
        a2.setemp(102, "Moyan");
        a3.setemp(103, "Aniket");
        a1.getemp();
        System.out.println("Company: "+A.company);
        a2.getemp();
        System.out.println("Company: "+A.company);
        a3.getemp();
        System.out.println("Company: "+A.company);
    }
}
