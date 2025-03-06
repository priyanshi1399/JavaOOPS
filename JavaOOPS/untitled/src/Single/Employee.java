package Single;

public class Employee {
    int id;
    String name;

    public Employee(){

    }

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
        Address address; //has a ->relation
    }

    public void display(){
        System.out.println("Display of Employee Called");
    }
}

