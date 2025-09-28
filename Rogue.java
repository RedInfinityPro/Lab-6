public class Rogue extends Player {
    private int dagger;
    private int cloak;

    Rogue(String name, int strength, int dexterity, int wisdom, int intelligence, int chrisma, int dagger, int cloak) {
        super(name, strength, dexterity, wisdom, intelligence, chrisma, dagger, cloak);
        this.dagger = dagger;
        this.cloak = cloak;
    }
    
    @Override
    public void printPlayer() {
        System.out.println(String.format("\n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s", getType(), this.name, getStrength(), getDexterity(), getWisdom(), getIntelligence(), getChrisma(), calculateDamage(), calculateDefense()));
    }
    
    @Override
    public String getType() {
        return "Rogue";
    }
    
    @Override
    public double calculateDamage() {
        return (dexterity * 2.2 + dagger * 1.2 + 10);
    }

    @Override
    public double calculateDefense() {
        return (cloak * 0.75 + dexterity * 0.9);
    }
}
