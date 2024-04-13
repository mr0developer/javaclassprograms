import java.util.Scanner;

public class MethodDemo {
    public static void input() {
        String user = "student";
        String pass = "BSEY2S2";
        int x;
        Scanner scanner = new Scanner(System.in);
        for (x=1; x<=3; x++){
            System.out.println("Enter your name: ");
            String userInput = scanner.nextLine();
            System.out.println("Enter your password: ");
            String userPass = scanner.nextLine();
            checking(userInput, userPass);
        }
    }
public static void checking(String S1, String S2){
        if (S1.equalsIgnoreCase("student") && S2.equals("BSEY2S2")){
            System.out.print("Authentic user");
            System.exit(0);
        }
        else{
            System.out.println("Type mismatch. try again");
        }
}
public static void main(String[] args){

}
}
