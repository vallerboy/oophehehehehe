package task1;

public class Game {
    private String name;
    private Player[] players;

    public Game(String name, int playerCount) {
        this.name = name;
        players = new Player[playerCount];
    }

    public boolean addPlayer(Player player){
        for (int i = 0; i < players.length; i++) {
            if(players[i] == null){
                players[i] = player;
                return true;
            }
        }
        return false;
    }

    public void checkGameWinner(){
        Player playerWithMaxPoints = players[0];

        for (Player playerLoop : players) {
            if(playerWithMaxPoints.getPoints() < playerLoop.getPoints()){
                playerWithMaxPoints = playerLoop;
            }
        }

        if(playerWithMaxPoints.getPoints() >= 100){
            System.out.println(playerWithMaxPoints.fullName());
        }
    }
}
