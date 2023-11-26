import java.util.Scanner;

public class Rooms extends Main {
    private static final Object[] roomOne = new Object[12];
    private static final Object[] roomTwo = new Object[12];
    private static final Object[] roomThree = new Object[12];
    private static final Object[] roomFour = new Object[12];
    private static Scanner input = new Scanner(System.in);


    public static boolean Room1(Player player) throws InterruptedException {
        int correct, answer;

        for (int j = 0; j < 5; j++) {
            System.out.println(roomOne[j]);
            Thread.sleep(2000);
        }
        correct = (int) roomOne[5];
        answer = getUserChoice(input);
        InputHandler(correct, answer, player);
        if (player.getCurrentHP() < 1) {
            return Game.runRoom = false;
        }

        for (int i = 6; i < 11; i++) {
            System.out.println(roomOne[i]);
            Thread.sleep(2000);
        }
        correct = (int) roomOne[11];
        answer = getUserChoice(input);
        InputHandler(correct, answer, player);
        if (player.getCurrentHP() < 1) {
            return Game.runRoom = false;
        }
        player.setCurrentRoom(1);
        return true;
    }
    public static boolean Room2(Player player) throws InterruptedException {
        int correct, answer;
        for (int j = 0; j < 5; j++) {
            System.out.println(roomTwo[j]);
            Thread.sleep(2000);
        }
        correct = (int) roomTwo[5];
        answer = getUserChoice(input);
        InputHandler(correct, answer, player);
        if (player.getCurrentHP() < 1) {
            return Game.runRoom = false;
        }

        for (int i = 6; i < 11; i++) {
            System.out.println(roomTwo[i]);
            Thread.sleep(2000);
        }
        correct = (int) roomTwo[5];
        answer = getUserChoice(input);
        InputHandler(correct, answer, player);
        if (player.getCurrentHP() < 1) {
            return Game.runRoom = false;
        }
        player.setCurrentRoom(2);
        return true;
    }
    public static boolean Room3(Player player) throws InterruptedException {
        int correct, answer;
        for (int j = 0; j < 5; j++) {
            System.out.println(roomThree[j]);
            Thread.sleep(2000);
        }
        correct = (int) roomThree[5];
        answer = getUserChoice(input);
        InputHandler(correct, answer, player);
        if (player.getCurrentHP() < 1) {
            return Game.runRoom = false;
        }

        for (int i = 6; i < 11; i++) {
            System.out.println(roomThree[i]);
            Thread.sleep(2000);
        }
        correct = (int) roomThree[5];
        answer = getUserChoice(input);
        InputHandler(correct, answer, player);
        if (player.getCurrentHP() < 1) {
            return Game.runRoom = false;
        }
        player.setCurrentRoom(3);
        return true;
    }
    public static boolean Room4(Player player) throws InterruptedException {
        ;
        int correct, answer;
        for (int j = 0; j < 5; j++) {
            System.out.println(roomFour[j]);
            Thread.sleep(2000);
        }
        correct = (int) roomFour[5];
        answer = getUserChoice(input);
        InputHandler(correct, answer, player);
        if (player.getCurrentHP() < 1) {
            return Game.runRoom = false;
        }

        for (int i = 6; i < 11; i++) {
            System.out.println(roomFour[i]);
            Thread.sleep(2000);
        }
        correct = (int) roomFour[5];
        answer = getUserChoice(input);
        InputHandler(correct, answer, player);
        if (player.getCurrentHP() < 1) {
            return Game.runRoom = false;
        }
        player.setCurrentRoom(4);
        return true;
    }
    private static void InputHandler(int correct,int choice, Player player) {
        if (correct == choice) {
            System.out.println("You have answered correctly!");
            player.addTokens(1);
            player.addPlayerScore(1000);
        } else {
            System.out.println("You have entered incorrectly, you lose 1 life.");
            player.subtractCurrentHP(1);
            player.subtractPlayerScore(500);
        }
    }
    public static void TokenShop(Player player) throws InterruptedException {
        boolean runShop = true;
        System.out.println("===============================================");
        Thread.sleep(1000);
        switch (player.getCurrentRoom()) {
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
        System.out.println("===============================================");
        while (runShop) {
            System.out.println("Welcome to the token shop, you currently have " + player.getTokens() + " tokens and " + player.getCurrentHP() + " lives.");
            Thread.sleep(1000);
            System.out.println("You have the choice to spend your tokens to gain 1 life, or you can save them til the end to" +
                    "multiply your score.");
            System.out.println("1. Buy lives, 1 life is 2 tokens.");
            System.out.println("2. Save tokens and continue to the next chamber.");
            if (getUserChoice(input) == 1) {
                System.out.print("How many lives would you like to buy? (1 - 3): ");
                if (getUserChoice(input) == 1) {
                    if (player.getTokens() >= 2) {
                        System.out.println("You have bought one life.");
                        player.addHP(1);
                    } else {
                        System.out.println("You do not have enough tokens.");
                    }
                } else if (getUserChoice(input) == 2) {
                    if (player.getTokens() >= 4) {
                        System.out.println("You have bought Three lives.");
                        player.addHP(2);
                    } else {
                        System.out.println("You do not have enough tokens.");
                    }
                } else if (getUserChoice(input) == 3) {
                    if (player.getTokens() >= 6) {
                        System.out.println("You have bought three lives");
                        player.addHP(3);
                    } else {
                        System.out.println("You do not have enough tokens.");
                    }
                }
            }
            Thread.sleep(1000);
            System.out.println("===============================================");
            System.out.println("Would you like to exit the token shop and continue to the next chamber?");
            Thread.sleep(1000);
            System.out.println("1. Look at the token shop's inventory again.");
            System.out.println("2. Continue to the next chamber.");
            if (getUserChoice(input) == 2) {
                runShop = false;
            }
        }
    }
    public static void initRooms() {
        // Room One Array
        roomOne[0] = "Prompt 1";
        roomOne[1] = "Question 1"; // question 1
        roomOne[2] = "Answer 1";
        roomOne[3] = "Answer 2";
        roomOne[4] = "Answer 3";
        roomOne[5] = 2; // answer number for this set
        roomOne[6] = "Prompt 2";
        roomOne[7] = "Question 2";
        roomOne[8] = "Answer 1";
        roomOne[9] = "Answer 2";
        roomOne[10] = "Answer 3";
        roomOne[11] = 1;
        // Room Three Array
        roomTwo[0] = "Prompt 1";
        roomTwo[1] = "Question 1"; // question 1
        roomTwo[2] = "Answer 1";
        roomTwo[3] = "Answer 2";
        roomTwo[4] = "Answer 3";
        roomTwo[5] = 2; // answer number for this set
        roomTwo[6] = "Prompt 2";
        roomTwo[7] = "Question 2";
        roomTwo[8] = "Answer 1";
        roomTwo[9] = "Answer 2";
        roomTwo[10] = "Answer 3";
        roomTwo[11] = 3;
        // Room three array
        roomThree[0] = "Prompt 1";
        roomThree[1] = "Question 1"; // question 1
        roomThree[2] = "Answer 1";
        roomThree[3] = "Answer 2";
        roomThree[4] = "Answer 3";
        roomThree[5] = 2; // answer number for this set
        roomThree[6] = "Prompt 2";
        roomThree[7] = "Question 2";
        roomThree[8] = "Answer 1";
        roomThree[9] = "Answer 2";
        roomThree[10] = "Answer 3";
        roomThree[11] = 2;
        // Room four array
        roomFour[0] = "Prompt 1";
        roomFour[1] = "Question 1"; // question 1
        roomFour[2] = "Answer 1";
        roomFour[3] = "Answer 2";
        roomFour[4] = "Answer 3";
        roomFour[5] = 2; // answer number for this set
        roomFour[6] = "Prompt 2";
        roomFour[7] = "Question 2";
        roomFour[8] = "Answer 1";
        roomFour[9] = "Answer 2";
        roomFour[10] = "Answer 3";
        roomFour[11] = 1;
    }
}