public class Pakuri {
    //Declare Variables
    private String species;
    private int attack;
    private int defense;
    private int speed;

    public Pakuri(String _species){
        //Correctly update values
        species = _species;
        attack = (species.length() * 7) + 9;
        defense = (species.length() * 5) + 17;
        speed = (species.length() * 6) + 13;
    }

    //gets the species
    public String getSpecies() {
        return species;
    }

    //Gets stats for Species
    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    //Set Attack
    public void setAttack(int newAttack) {
        this.attack = newAttack;
    }

    //Evolves species
    public void evolve() {
        this.attack = attack * 2;
        this.defense = defense * 4;
        this.speed = speed * 3;
    }
}