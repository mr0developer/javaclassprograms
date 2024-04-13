import java.util.Scanner;
public class Employee {
    static Scanner input = new Scanner(System.in);
    private  String name, gender;
    private  int YOB;
    public Employee(){
        System.out.println(" Enter your name: ");
        name = input.nextLine();
        System.out.println(" Enter your Gender: ");
        gender = input.next();
        System.out.println(" Enter your year of birth: ");
        YOB = input.nextInt();
        System.out.println(" Details successfully entered. ");
    }
    public Employee(String N, String G, int Y){
        name = N;
        gender = G;
        YOB = Y;
    }
    private  void SetName(){
       System.out.println(" Enter your new name: ");
        name = input.nextLine();
        System.out.println(" You successfully changed your name. ");
    }
    private  void setGender(){
        System.out.println(" Enter your new gender: ");
        gender = input.next();
        System.out.println(" You successfully changed your gender.");
    }
    private  void SetYOB(){
        System.out.println(" Enter your new YOB: ");
        YOB = input.nextInt();
        System.out.println(" You successfully changed your YOB. ");
    }
    public void ViewDetails(){
        System.out.println("your name is: " + name);
        System.out.println("Your gender is: " + gender);
        System.out.println("Your year of birth is: " + YOB);
    }

    public static void SetAllowance(int...al){
        int allowance = 0;
        for (int a: al){
            allowance += a;
        }
        System.out.println("You have " + al.length + " Allowances.");
        System.out.println("Your total allowance is "+" "+ allowance);
    }
    public static void main(String[] args){
        Employee e1,e2;
        e1= new Employee();
        e2= new Employee("Aster", "Male", 2001);
        e1.ViewDetails();
        e2.ViewDetails();
        SetAllowance(400,600);
        SetAllowance(123,456,78,754);

    }
}
