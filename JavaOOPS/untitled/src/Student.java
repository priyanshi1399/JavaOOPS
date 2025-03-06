public class Student {
    private int id;
    private String name;
    //abc@gmail.com
    private String smallName;
    private int age;

    public int getId(){
        return id;
    }

    public void setId(){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.smallName=name.toLowerCase();
    }

    public void setAge(int age){
        if(age<13){
            //throw some error
        }
    }
}
