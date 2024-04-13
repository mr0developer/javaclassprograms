import java.util.Scanner;

public class Employee {
    protected String Name, Gender;
    protected int RfNumber;
    protected static Scanner input = new Scanner(System.in);
     public Employee(String Name, String Gender, int RfNumber){
         System.out.println("Enter your Name: ");
         this.Name = input.nextLine();
         System.out.println("Enter your Gender: ");
         this.Gender = input.nextLine();
         System.out.println("Enter your Reference Number: ");
         this.RfNumber = input.nextInt();
     }
     public void editDetails(){
         System.out.println("Enter your new Name: ");
         Name = input.nextLine();
         System.out.println("Enter your new Gender: ");
         Gender = input.nextLine();
         System.out.println("Enter your new Reference Number: ");
         RfNumber = input.nextInt();
         System.out.println("You have successfully changed your details! ");
     }
     public void viewDetails(){
         System.out.println("Your name is: " + " " + Name);
         System.out.println("your Reference Number is : " + " " + RfNumber);
         System.out.println("Your gender is: " + " "+ Gender);
     }
    public static void main(String[] args){

    }
}
