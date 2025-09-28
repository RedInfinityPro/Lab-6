import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PlayerReader {

    public static ArrayList<Player> getPlayerList(String fileName) {
        ArrayList<Player> players = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = buffer.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                String type = parts[0].trim();
                String name = parts[1].trim();
                int strength = Integer.parseInt(parts[2].trim());
                int dexterity = Integer.parseInt(parts[3].trim());
                int wisdom = Integer.parseInt(parts[4].trim());
                int intelligence = Integer.parseInt(parts[5].trim());
                int chrisma = Integer.parseInt(parts[6].trim());
                int damage = Integer.parseInt(parts[7].trim());
                int defince = Integer.parseInt(parts[8].trim());
                Player player = null;

                switch (type) {
                    case "Fighter":
                        String sword = parts[7].trim();
                        String armor = parts[8].trim();
                        player = new Fighter(name, strength, dexterity, wisdom, intelligence, chrisma, damage, defince);
                        break;
                    case "Wizard":
                        String spell = parts[7].trim();
                        String robe = parts[8].trim();
                        player = new Wizard(name, strength, dexterity, wisdom, intelligence, chrisma, damage, defince);
                        break;
                    case "Priest":
                        String mace = parts[7].trim();
                        String shield = parts[8].trim();
                        player = new Priest(name, strength, dexterity, wisdom, intelligence, chrisma, damage, defince);
                        break;
                    case "Rogue":
                        String dagger = parts[7].trim();
                        String cloak = parts[8].trim();
                        player = new Rogue(name, strength, dexterity, wisdom, intelligence, chrisma, damage, defince);
                        break;
                    default:
                        throw new AssertionError();
                }

                if (player != null) {
                    players.add(player);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return players;
    }
}