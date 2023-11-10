import java.util.Scanner;

public class Rooms extends Main {
    public void startGame() {  // start game
        initRooms();
        Menu();
    }

    public static Scanner input = new Scanner(System.in); // init scanner
    private static final Object[] roomOne = new Object[6];
    private static String roomOneMap;

    private static void Menu() { // pyramid scheme
        String playerName;
        System.out.println("================================================");
        System.out.println("        Enter your character's name: ");
        playerName = input.nextLine();
        Player player = new Player(playerName);
        player.setName(playerName); // THIS WORKS DO NOT TOUCH IT
        System.out.println("================================================");
        Room1();
    }
    private static void Room1() { // Subterranean Pit
        System.out.println(roomOne[0]);
        System.out.println(roomOneMap);
        }
    private static void Room2() { // Gallery
    }
    private static void Room3() { // Queen Chamber
    }
    private static void Room4() { // King chamber
    }
    private static void Room5() { // Prince Bonus Chamber
    }
    private void initRooms() {
        // init room one
        roomOneMap = """
                ------------------------
                |                       |
                |                x      |
                |                       |
                |  o                    |
                ------------------------""";
        roomOne[0] = "You come across a pyramid you are going to explore.\nAs you descend deeper into the mysterious depths, " +
                "the door ominously shuts behind you, trapping you inside.\nWith your wits and skills, you must " +
                "navigate the treacherous labyrinth, uncover ancient secrets,\nand overcome formidable challenges to " +
                "escape the pyramid's clutches.";
        roomOne[1] = "test";

    }
}