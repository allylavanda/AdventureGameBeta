import java.util.Scanner;

public class Game {
    public static Player player;
    private static Scanner input = new Scanner(System.in);
    public static boolean runRoom = true;
    public void start() throws InterruptedException {
        Rooms.initRooms();
        Menu();
        while (runRoom) { // end game if player hits 0 lives
            runRoom = Rooms.Room1(player);
            if (!runRoom) {break;}
            Rooms.TokenShop(player);
            runRoom = Rooms.Room2(player);
            if (!runRoom) {break;}
            Rooms.TokenShop(player);
            runRoom = Rooms.Room3(player);
            if (!runRoom) {break;}
            Rooms.TokenShop(player);
            runRoom = Rooms.Room4(player);
            if (!runRoom) {break;}
        }
        if (player.getCurrentRoom() == 4){
            System.out.println("Congratulations! You have cleared all rooms!");
        } else {
            System.out.println("You have not cleared all the rooms.");
        }
        System.out.println("Your subfinal score was: " +player.getPlayerScore());
        System.out.println("You had " + player.getCurrentHP()+" lives left.");
        System.out.println("You had " +player.getTokens()+" tokens left. This will impact your final score!");
        System.out.println("Your final score is: ");

    }
    private static void Menu() {
        String playerName;
        System.out.println("================================================");
        System.out.println("Enter your character's name: ");
        playerName = input.nextLine();
        player = new Player(playerName,0,3,0,0,0,0,0,0,true);
        System.out.println("================================================");
    }
}
