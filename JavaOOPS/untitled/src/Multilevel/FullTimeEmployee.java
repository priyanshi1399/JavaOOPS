package Multilevel;

public class FullTimeEmployee extends Employee {
    int sal;
    public FullTimeEmployee(){

    }

    public FullTimeEmployee(int id, String name,String gender, int sal){
        super(id,name,gender);
        this.sal=sal;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Display of Full Time Employee Called");
        System.out.println("--------------------------");
        System.out.println();

    } /* because override that method*/

}
