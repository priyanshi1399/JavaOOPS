package Single;

public class SingleInheritenceMain {

    public static void main(String[] args) {
        Employee emp = new Employee(1, "ABC");
        emp.display();

        FullTimeEmployee fte = new FullTimeEmployee();
        fte.display();
        /*

Display of Employee Called
Display of Employee Called
 */


        // FullTimeEmployee fte=new Employee();
        // as this is the child ,this can not hold large value
        Employee emp2 = new FullTimeEmployee(); //this can hold
        emp2.display();
    }



}
