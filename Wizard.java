public class Wizard extends Player {
    private int spell;
    private int robe;

    Wizard(String name, int strength, int dexterity, int wisdom, int intelligence, int chrisma, int spell, int robe) {
        super(name, strength, dexterity, wisdom, intelligence, chrisma, spell, robe);
        this.spell = spell;
        this.robe = robe;
    }

    @Override
    public void printPlayer() {
        System.out.println(String.format("\n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s", getType(), this.name, getStrength(), getDexterity(), getWisdom(), getIntelligence(), getChrisma(), calculateDamage(), calculateDefense()));
    }
    
    @Override
    public String getType() {
        return "Wizard";
    }
    
    @Override
    public double calculateDamage() {
        return intelligence * 2.0 + spell * 1.5;
    }

    @Override
    public double calculateDefense() {
        return robe * 0.5 + wisdom * 0.3;
    }
}
