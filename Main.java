
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PlayerReader reader = new PlayerReader();
        ArrayList<Player> players = PlayerReader.getPlayerList("players.txt");
        for (Player p : players) {
            p.printPlayer();
        }
    }
}
