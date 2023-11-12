public class Player {
    public Player() {}
    // init vars
    private String playerName;
    private int tokens;
    private int lives;
    private int playerScore;
    private int currentRoom;
    // player token handler
    public void setTokens(int token) {tokens = token;}
    public void addToken(int addPoint) {tokens += addPoint;}
    public int getTokens() {return tokens;}
    // player room handler
    public void setRoom(int room){currentRoom = room;}
    public int getRoom() {return currentRoom;}
    // player life handler
    public void setLives(int life) {lives = life;}
    public void addLife(int addLifePoint) {lives+=addLifePoint;}
    public void subtractLife() {lives--;}
    public int getLives() {return lives;}
    // player score handler
    public void setScore(int point){playerScore=point;}
    public void addScore(int points){playerScore+=points;}
    public int getScore(){return playerScore;}
    public void subtractScore(int points){playerScore-=points;}

    public void setName(String name) {playerName = name;} // set player name
    public String getName() {return playerName;} // get player name
    public String getPlayerData(){
        return "Player Name: "+playerName+
                "Lives: "+lives+
                "Tokens: "+tokens+
                "Current Room: "+currentRoom+
                "Score: "+playerScore;
    }
}