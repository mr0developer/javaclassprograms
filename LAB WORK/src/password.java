import java.util.Scanner;
public class password {
    public static void main(String[] args) {
        String name = "Dexter";
        String pass = "Test";
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String inputName = scanner.nextLine();
        System.out.print("Enter your password: ");
        String inputPass = scanner.nextLine();

        if (inputName.equalsIgnoreCase(name)){
            if (inputPass.equals(pass)){
                System.out.println("welcome " + inputName);
            }
            else{
                System.out.println("Incorrect Password. Try again.");
            }
        }

         else {
                System.out.println("Incorrect Username.");
        }
    }

}
