import java.util.Scanner;

public class Method2 {
    private static final String VALID_NAME = "Dexter";
    private static final String VALID_PASS = "Test";
    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int attempts = 0; attempts < MAX_ATTEMPTS; attempts++) {
            String inputName = getUsername(scanner);
            String inputPass = getPassword(scanner);

            if (inputName.equalsIgnoreCase(VALID_NAME) && inputPass.equals(VALID_PASS)) {
                System.out.println("Welcome " + inputName);
                break;
            } else {
                int remainingAttempts = MAX_ATTEMPTS - attempts - 1;
                if (remainingAttempts > 0) {
                    System.out.println("Incorrect username or password. " +
                            "You have " + remainingAttempts + " attempts left.");
                } else {
                    System.out.println("You have used all your attempts. Access denied.");
                }
            }
        }

        scanner.close();
    }

    // Method to input username
    public static String getUsername(Scanner scanner) {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    // Method to input password
    public static String getPassword(Scanner scanner) {
        System.out.print("Enter your password: ");
        return scanner.nextLine();
    }
}
