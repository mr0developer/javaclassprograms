import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Select a pattern type:");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Inverted Triangle");
            System.out.println("4. Terminate");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    rectanglePattern(scanner);
                    break;
                case 2:
                    trianglePattern(scanner);
                    break;
                case 3:
                    invertedTrianglePattern(scanner);
                    break;
                case 4:
                    System.out.println("Terminating the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void rectanglePattern(Scanner scanner) {
        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        System.out.print("Enter the symbol to use: ");
        char symbol = scanner.next().charAt(0);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static void trianglePattern(Scanner scanner) {
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();
        System.out.print("Enter the symbol to use: ");
        char symbol = scanner.next().charAt(0);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static void invertedTrianglePattern(Scanner scanner) {
        System.out.print("Enter the height of the inverted triangle: ");
        int height = scanner.nextInt();
        System.out.print("Enter the symbol to use: ");
        char symbol = scanner.next().charAt(0);

        for (int i = height; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
