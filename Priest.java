
public class Priest extends Player {

    private int mace;
    private int shield;

    Priest(String name, int strength, int dexterity, int wisdom, int intelligence, int chrisma, int mace, int shield) {
        super(name, strength, dexterity, wisdom, intelligence, chrisma, mace, shield);
        this.mace = mace;
        this.shield = shield;
    }

    @Override
    public void printPlayer() {
        System.out.println(String.format("\n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s", getType(), this.name, getStrength(), getDexterity(), getWisdom(), getIntelligence(), getChrisma(), calculateDamage(), calculateDefense()));
    }
    
    @Override
    public String getType() {
        return "Priest";
    }
    
    @Override
    public double calculateDamage() {
        return wisdom * 1.8 + mace * 1.8;
    }

    @Override
    public double calculateDefense() {
        return shield * 0.6 + wisdom * 0.8;
    }
}
