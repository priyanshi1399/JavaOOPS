//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        //BankAccount()->default constructor
        //when you create class, java create a default costructor automatically
        BankAccount ac1=new BankAccount();
        ac1.withdrawl();
        }

        BankAccount ac2=new BankAccount(1,"Shekhar",11);
    }
