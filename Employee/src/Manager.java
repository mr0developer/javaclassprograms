import java.util.Scanner;
public class Manager extends Employee {
    private String dept;
    private int size;
    Scanner reader = new Scanner(System.in);
    public Manager(String Name, String Gender, int RfNumber, String dept, int size){
        super(Name, Gender, RfNumber);
        this.dept = dept;
        this.size = size;
    }
    public void setDetails(){
        editDetails();
        System.out.println("What is the new department for " +Name+" "+ "?");
        dept = reader.nextLine();
        System.out.println("How many employees are supervised by " +Name+" "+ "?");
        size = reader.nextInt();
    }
    public void viewDetails(){
        super.viewDetails();
    }
}
