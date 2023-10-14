import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean runGame = true;
        while (runGame) {
            Rooms room = new Rooms();
            room.startMenu();

            System.out.println("Would you like to exit the game?");
            System.out.println("1. Exit the game");
            System.out.println("2. Restart the game");
            int choice = getUserChoice(input);
            if (choice == 1) {
                runGame = false;
            }
        }
    }
    public static int getUserChoice(Scanner scanner) {
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    System.out.println("Invalid choice. Please choose a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}