import unit.Casino;
import unit.player.Player;
import unit.roullete.Roulette;

public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[2];
        players[0] = new Player(10, "Bob");
        players[1] = new Player(20, "Alexa");
        Casino casic = new Casino(players, 10000);
        casic.play();

    }
}