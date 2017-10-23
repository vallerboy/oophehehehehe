package task1;

public class GameStarter {
    public static void main(String[] args) {
        Game RPG = new Game("Moja fajna gra", 3);

        Player oskar = new Player("Oskar", "Polak", 110);
        Player szymon = new Player("Szymon", "Bednarz", 20);
        Player leopoldia = new Player("Leopoldia", "Byk", 140);

        RPG.addPlayer(oskar);
        RPG.addPlayer(szymon);
        RPG.addPlayer(leopoldia);

        RPG.checkGameWinner();


        Game.getAllPeople(RPG.getPlayers());
    }
}
