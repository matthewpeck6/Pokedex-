import java.util.*;

public class Pakudex {

    //Declare variables
    int capacity = 20;
    int size = 0;
    Pakuri[] Pakumons;
    int[] stats = new int[3];

    //Constructors
    public Pakudex() {
        Pakumons = new Pakuri[capacity];
    }

    public Pakudex (int _capacity) {
        capacity = _capacity;
        Pakumons = new Pakuri[capacity];
    }

    //Quick Get Methods
    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    //Get all of the Species
    public String[] getSpeciesArray() {
        int i=0;
        String s[] = new String[size];

        // Checks to ensure at least 1 pakuri has been made
        // if so, gets the array
        if (size == 0){
            return null;
        } else {
            for (i=0; i < size; i++){
                s[i] = Pakumons[i].getSpecies();
            }
            return s;
        }

    }

    //Get Stats
    public int[] getStats(String species) {
        int count = 0;
        boolean parity = false;

        //Checks for species, if found, gets the stats
        for (int i=0; i < size; i++){

            if (Pakumons[i].getSpecies().equals(species) ) {
                stats[0] = Pakumons[i].getAttack();
                stats[1] = Pakumons[i].getDefense();
                stats[2] = Pakumons[i].getSpeed();
                parity = true;
                count += 1;
            }

        }

        //Returns the species stats, otherwise, nothing
        if (parity == true){
            return stats;
        } else {
            return null;
        }
    }

    //Sort Method
    public void sortPakuri() {
        Arrays.sort(Pakumons);
    }

    //public int compareTo(Pakuri target){
        //return str1.compareTo(str2);
    //}

    //Add pakuri Method
    public boolean addPakuri(String species){
        boolean parity = true;
        int i=0;

        //Adds pakuri
        for (i =0; i<size; i++) {
            if ((Pakumons[i] != null) && Pakumons[i].getSpecies().equals(species) ) {
                parity = false;
                break;
            }
        }
        //Checks if the pakudex is full
        if(size >= capacity){
            parity = false;
        }
        Pakumons[size] = new Pakuri(species);
        size++;
        return parity;
    }

    //Checks if the species should evolve
    public boolean evolveSpecies(String species){
        boolean parity = false;
        int i = 0;

        //Checks and then evolves correct specie
        for (i =0; i < size; i++) {
            if ((Pakumons[i] != null) && Pakumons[i].getSpecies().equals(species) ) {
                parity = true;
                Pakumons[i].evolve();
                break;
            }
        }
        return parity;
    }

    //Additional Method that checks if the pakuri exists
    public boolean exist(String species){
        boolean parity = false;
        int i = 0;
        for (i =0; i < size; i++) {
            if ((Pakumons[i] != null) && Pakumons[i].getSpecies().equals(species) ) {
                parity = true;
                break;
            }
        }
        return parity;
    }

    //Additional method that evolves the pakuri
    public int[] evolve(String species, int count) {
        for (int i=0; i < size; i++){
            if (Pakumons[i].getSpecies().equals(species) ) {
                stats[0] = Pakumons[i].getAttack();
                stats[1] = Pakumons[i].getDefense();
                stats[2] = Pakumons[i].getSpeed();
                break;
            }
        }
        return stats;
    }
}





/*
        for (int i=0; i < Pakumons.length; i++){
            getSpeciesArray() = Pakumons[i];
        }
        if (Pakumons == null) {
            return null;
        } else {
            return Pakumons;
        }
*/

//return Pakumons;
/*
        if(Pakumons.length > capacity){
            return false;
        }
        Pakumons[i]=species;
        return true;
*/


/*
            if (Pakumons[i].equals(species)) {
                parity = true;
                Pakumons[i].evolve();
            }
*/

    /*
    public boolean evolveSpecies(String species){
        boolean parity = true;
        int i = 0;
        for (i =0; i < size - 1; i++) {
            if ((Pakumons[i] != null) && Pakumons[i].getSpecies().equals(species) ) {
                parity = false;
                Pakumons[i].evolve();
                break;
            }
        }
        return parity;
    }
    */


//String[] Pakumons = null;
//String s = new String(size);
//Pakumons[i].getSpecies();
//if ((Pakumons[i].equals(species)) && (count == 0)) {
//(Pakumons[i] != null) &&
//System.out.println("Hello");