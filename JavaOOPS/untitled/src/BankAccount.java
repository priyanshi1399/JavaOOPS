public class BankAccount {
    final int id=10;
    //int id;
    String name;
    int bal;
    static int counter;
        public BankAccount(){
            counter++;
        }
    //parameterized constructor
    public BankAccount(int id,String name,int bal){
        //this.id=id;
        //id can not be assigned if this is final
        this.name=name;
        this.bal=bal;
    }
    public void withdrawl(){
        System.out.println("withdraw successful");
    }
    //Two constructor with the same name is known as constructor overloading
    //and this si part of polymorphism

    public void close(){
        System.out.println("Account closed");
    }
}
