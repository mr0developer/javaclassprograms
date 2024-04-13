import java.util.Scanner;

public class AgeAndNationalityChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter their year of birth
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        // Prompt the user to enter the current year
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        // Clear the buffer. It enables input of next line
        scanner.nextLine();

        // Prompt the user to enter their nationality
        System.out.print("Enter your nationality: ");
        String nationality = scanner.nextLine();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate the age
        int age = currentYear - yearOfBirth;

        // Display the result
        System.out.println("Hello, " + name + "! Your age is: " + age + " years.");

        // Check nationality and age for voting eligibility
        if (nationality.equalsIgnoreCase("Kenyan")) {
            if (age >= 18) {
                System.out.println("You are eligible to vote in Kenya.");
            } else {
                System.out.println("You are not eligible to vote in Kenya as you are below 18 years old.");
            }
        } else {
            System.out.println("You are not Kenyan. Please proceed to immigration.");
        }
    }
}

