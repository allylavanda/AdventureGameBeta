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

    private static void Menu() { // pyramid scheme
        String playerName;
        System.out.println("================================================");
        System.out.println("Enter your character's name: ");
        playerName = input.nextLine();
        player.setLives(3);
        player.setTokens(0);
        player.setName(playerName); // THIS WORKS DO NOT TOUCH IT
        System.out.println("================================================");
        Room1();
    }
    private static void Room1() { // Subterranean Pit
        player.setRoom(1);
        System.out.println(roomOne[0]);
        System.out.println(roomOne[1]);
        System.out.println(roomOne[2]);
        System.out.println(roomOne[3]);
        System.out.println(roomOne[4]);
        InputHandler((int)roomOne[5], getUserChoice(input));
        TokenShop();
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
    private static void TokenShop() {
        System.out.println("Welcome to the token shop!");
        System.out.println("You currently have: " +player.getTokens() +"tokens.");

            // buy item hint
            // buy life
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
    private void initRooms() {
        // Room One Array
        roomOne[0] = "You come across a pyramid you are going to explore.\nAs you descend deeper into the mysterious depths, " +
                "the door ominously shuts behind you, trapping you inside.\nWith your wits and skills, you must " +
                "navigate the treacherous labyrinth, uncover ancient secrets,\nand overcome formidable challenges to " +
                "escape the pyramid's clutches.";
        roomOne[1] = "Question";
        roomOne[2] = "Answer 1";
        roomOne[3] = "Answer 2";
        roomOne[4] = "Answer 3";
        roomOne[5] = 2; // answer number
        // Room Two Array

    }
}