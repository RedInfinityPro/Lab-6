public abstract class Player {
    public String name;
    public int strength;
    public int dexterity;
    public int wisdom;
    public int intelligence;
    public int chrisma;
    public int damage;
    public int defince;

    Player() {

    }

    Player(String name, int strength, int dexterity, int wisdom, int intelligence, int chrisma, int damage, int defince) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.wisdom = wisdom;
        this.intelligence = intelligence;
        this.chrisma = chrisma;
        this.damage = damage;
        this.defince = defince;
    }

    public String getName() {
        return this.name;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public int getWisdom() {
        return this.wisdom;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public int getChrisma() {
        return this.chrisma;
    }

    public void setStrength(int new_strength) {
        this.strength = new_strength;
    }

    public void setDexterity(int new_dexterity) {
        this.dexterity = new_dexterity;
    }

    public void setIntelligence(int new_intelligence) {
        this.intelligence = new_intelligence;
    }
    
    public void setWisdom(int new_wisdom) {
        this.wisdom = new_wisdom;
    }

    public void setChrisma(int new_chrisma) {
        this.chrisma = new_chrisma;
    }
    
    public abstract void printPlayer();

    public abstract String getType();

    public abstract double calculateDamage();

    public abstract double calculateDefense();
}