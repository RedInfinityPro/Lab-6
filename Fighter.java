public class Fighter extends Player {
    private int sword;
    private int armor;

    Fighter(String name, int strength, int dexterity, int wisdom, int intelligence, int chrisma, int sword, int armor) {
        super(name, strength, dexterity, wisdom, intelligence, chrisma, 0, 0);
        this.sword = sword;
        this.armor = armor;
    }


    @Override
    public void printPlayer() {
        System.out.println(String.format("\n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s", getType(), this.name, getStrength(), getDexterity(), getWisdom(), getIntelligence(), getChrisma(), calculateDamage(), calculateDefense()));
    }
    
    @Override
    public String getType() {
        return "Fighter";
    }

    @Override
    public double calculateDamage() {
        return (strength * 2.5 + sword * 1.2);
    }

    @Override
    public double calculateDefense() {
        return (armor * 0.6 + strength * 0.4);
    }
}
