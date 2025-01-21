class Encapsulation{
    private int id;
    private String name;
    private String college_name;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void setclg(String college_name){
        this.college_name = college_name;
    }
    public String getclg(){
        return college_name;
    }
}

public class Student {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setId(24);
        e.setname("Ajinkya Patil");
        e.setclg("MET's Institute of Engineering");

        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getname());
        System.out.println("College: " + e.getclg());
    }
}
