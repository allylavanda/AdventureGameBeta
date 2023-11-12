import java.util.Scanner;

public class Rooms extends Main {
    private static final Player player = new Player();
    public void startGame() {  // start game
        initRooms();
        Menu();
    }
    public static Scanner input = new Scanner(System.in); // init scanner
    private static final Object[] roomOne = new Object[6];
    private static final Object[] roomTwo = new Object[6];
    private static final Object[] roomThree = new Object[6];
    private static final Object[] roomFour = new Object[6];

    private static void Menu() {
        String playerName;
        System.out.println("================================================");
        System.out.println("Enter your character's name: ");
        playerName = input.nextLine();
        player.setLives(3);
        player.setTokens(0);
        player.setName(playerName);
        System.out.println("================================================");
        Room1();
    }
    private static void Room1() { // Subterranean Pit
        player.setRoom(1);
        for (int i = 0; i < 5; i++) {
            System.out.println(roomOne[i]);
        }
        InputHandler((int)roomOne[5], getUserChoice(input));
        TokenShop();
        Room2();
    }
    private static void InputHandler(int correct,int choice) {
        if (correct == choice) {
            System.out.println("You have answered correctly!");
            player.addToken(1);
            player.addScore(1000);
        } else {
            System.out.println("You have entered incorrectly, you lose 1 life.");
            player.subtractLife();
            player.subtractScore(500);
        }
    }

    private static void Room2() { // Gallery
        player.setRoom(2);
    }
    private static void Room3() { // Queen Chamber
        player.setRoom(3);
    }
    private static void Room4(){ // get to if u get 90% correct
        // double or nothing trivia
    }
    private static void TokenShop() {
        boolean runShop = true;
        System.out.println("Welcome to the token shop!");
        System.out.println("You currently have: " +player.getTokens()+ "tokens.");
        switch (player.getRoom()) {
            case 1 -> {
                System.out.println("Congratulations on clearing the Subterranean Pit!");
            }
            case 2 -> {
                System.out.println("Congratulations on clearing the Gallery");
            }
            case 3 -> {
                System.out.println("Congratulations on clearing the Queen's Chamber");
            }
            case 4 -> {
                System.out.println("Congratulations on clearing the King's Chamber");

            }
            default -> System.out.println("How did you get here? You broke the code.");
        }
        while (runShop) {
            System.out.println("Welcome to the token shop, you currently have " + player.getTokens() + " tokens and " + player.getLives() + "lives.");
            System.out.println("You have the choice to spend your tokens to gain 1 life, or you can save them til the end to" +
                    "multiply your score.");
            System.out.println("1. Buy lives, 1 life is 2 tokens.");
            System.out.println("2. Save tokens and continue to the next chamber.");
            if (getUserChoice(input) == 1) {
                System.out.print("How many lives would you like to buy? (1 - 3): ");
                if (getUserChoice(input) == 1) {
                    if (player.getTokens() >= 2) {
                        System.out.println("You have bought one life.");
                        player.addLife(1);
                    } else {
                        System.out.println("You do not have enough tokens.");
                    }
                } else if (getUserChoice(input) == 2) {
                    if (player.getTokens() >= 4) {
                        System.out.println("You have bought two lives.");
                        player.addLife(2);
                    } else {
                        System.out.println("You do not have enough tokens.");
                    }
                } else if (getUserChoice(input) == 3) {
                    if (player.getTokens() >= 6) {
                        System.out.println("You have bought three lives");
                        player.addLife(3);
                    } else {
                        System.out.println("You do not have enough tokens.");
                    }
                }
            }
            System.out.println("Would you like to exit the token shop and continue to the next chamber?");
            System.out.println("Look at the token shop's inventory again.");
            System.out.println("Continue to the next chamber.");
            if (getUserChoice(input) == 2) {
                runShop = false;
            }

        }
    }
    private void initRooms() {
        // Room One Array
        roomOne[0] = "You come across a pyramid you are going to explore.\nAs you descend deeper into the mysterious depths, " +
                "the door ominously shuts behind you, trapping you inside.\nWith your wits and skills, you must " +
                "navigate the treacherous labyrinth, uncover ancient secrets,\nand overcome formidable challenges to " +
                "escape the pyramid's clutches.";
        roomOne[1] = "Question 1"; // question 1
        roomOne[2] = "Answer 1";
        roomOne[3] = "Answer 2";
        roomOne[4] = "Answer 3";
        roomOne[5] = 2; // answer number
        // Room Two Array

    }
}