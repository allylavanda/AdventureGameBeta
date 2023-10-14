import java.util.Scanner;

public class Rooms extends Main {
    public void startGame() {Menu();}
    public static Scanner input = new Scanner(System.in);

    public static void Menu() { // pyramid scheme
        String playerName;
        Scanner input = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("        Enter your character's name: ");
        playerName = input.nextLine();
        Player player = new Player(playerName);
        player.setName(playerName); // THIS WORKS DO NOT TOUCH IT
        System.out.println("================================================");
        Room1();
    }
    public static void Room1() {
        System.out.println("PROMPT");
        System.out.println("LINE1");
        System.out.println("LINE2");
        System.out.println("LINE3");
        System.out.println("LINE4");
        int choice = getUserChoice(input);
        switch (choice) {
            case 1:
                System.out.println("TEST OUTPUT1");
                System.out.println("================================================");
            case 2:
                System.out.println("TEST OUTPUT2");
                System.out.println("================================================");
            case 3:
                System.out.println("TEST OUTPUT 3");
                System.out.println("================================================");
            case 4:
                System.out.println("TEST OUTPUT4");
                System.out.println("================================================");
            default:
                System.out.println("TEST DEFAULT SWITCH CASE");
                System.out.println("================================================");
        }
        Room2();
    }
    public static void Room2() {
        System.out.println("PROMPT");
        System.out.println("LINE1");
        System.out.println("LINE2");
        System.out.println("LINE3");
        System.out.println("LINE4");
        int choice = getUserChoice(input);
        switch (choice) {
            case 1:
                System.out.println("TEST OUTPUT1");
                System.out.println("================================================");
            case 2:
                System.out.println("TEST OUTPUT2");
                System.out.println("================================================");
            case 3:
                System.out.println("TEST OUTPUT 3");
                System.out.println("================================================");
            case 4:
                System.out.println("TEST OUTPUT4");
                System.out.println("================================================");
            default:
                System.out.println("TEST DEFAULT SWITCH CASE");
                System.out.println("================================================");
        }
        Room3();
    }

    public static void Room3() {
        Room4();

    }
    public static void Room4() {
        Room5();
    }
    public static void Room5() {

    }
}