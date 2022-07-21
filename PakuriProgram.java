import java.lang.reflect.Array;
import java.util.*;

public class PakuriProgram {

    public static void main (String[] args){
        //Declare Variables
        int maxCap = 0;
        String check = "";
        int count = 0;
        boolean beginning = true;
        Scanner proj = new Scanner(System.in);

        //Introduction
        System.out.println("Welcome to Pakudex: Tracker Extraordinaire!");
        while (beginning == true) {
            System.out.print("Enter max capacity of the Pakudex: ");
            String input = proj.next();
            try {
                maxCap = Integer.parseInt(input);
                if (!(maxCap >= 0)){
                    System.out.println("Please enter a valid size.");
                } else {
                    beginning = false;
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid size.");
            }
        }
        System.out.println("The Pakudex can hold " + maxCap + " species of Pakuri.");
        Pakudex toast = new Pakudex(maxCap);

        //Select Operations
        System.out.println("Pakudex Main Menu");
        System.out.println("-----------------");
        System.out.println("1. List Pakuri");
        System.out.println("2. Show Pakuri");
        System.out.println("3. Add Pakuri");
        System.out.println("4. Evolve Pakuri");
        System.out.println("5. Sort Pakuri");
        System.out.println("6. Exit");
        System.out.println();
        System.out.print("What would you like to do? ");
        String option = proj.next();

        while (!option.equals("6")) {
            if (option.equals("1")) {
                //List Pakuri
                if (toast.getSpeciesArray() == null){
                    System.out.println("No Pakuri in Pakudex yet!");
                    System.out.println();
                } else {
                    System.out.print("Pakuri In Pakudex:");
                    System.out.println();
                    for (int i = 0; i < toast.getSize(); i++){
                        System.out.println((i+1) + ". " + Array.get(toast.getSpeciesArray(), i));
                    }
                    System.out.println();
                }

                //Select Operations
                System.out.println("Pakudex Main Menu");
                System.out.println("-----------------");
                System.out.println("1. List Pakuri");
                System.out.println("2. Show Pakuri");
                System.out.println("3. Add Pakuri");
                System.out.println("4. Evolve Pakuri");
                System.out.println("5. Sort Pakuri");
                System.out.println("6. Exit");
                System.out.println();
                System.out.print("What would you like to do? ");
                option = proj.next();

            } else if (option.equals("2")) {
                //Show Pakuri
                System.out.print("Enter the name of the species to display: ");
                check = proj.next();

                if (toast.exist(check) == true){
                    toast.getStats(check);
                    System.out.println("Species: " + check);
                    System.out.println("Attack: " + toast.stats[0]);
                    System.out.println("Defense: " + toast.stats[1]);
                    System.out.println("Speed: " + toast.stats[2]);

                } else {
                    System.out.print("Error: No such Pakuri!");
                    System.out.println();
                }

                //Select Operations
                System.out.println("Pakudex Main Menu");
                System.out.println("-----------------");
                System.out.println("1. List Pakuri");
                System.out.println("2. Show Pakuri");
                System.out.println("3. Add Pakuri");
                System.out.println("4. Evolve Pakuri");
                System.out.println("5. Sort Pakuri");
                System.out.println("6. Exit");
                System.out.println();
                System.out.print("What would you like to do? ");
                option = proj.next();

            }  else if (option.equals("3")) {
                //Add Pakuri
                try {
                    if (toast.getSize() == maxCap){
                        System.out.print("Error: Pakudex is full!");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Error: Pakudex is full!");
                    break;
                }

                //After checking for errors, add species
                System.out.print("Enter the name of the species to add: ");
                check = proj.next();
                if (toast.addPakuri(check) == true){
                    System.out.println("Pakuri species " + check + " successfully added!");
                } else {
                    System.out.println("Error: Pakudex already contains this species!");
                }

                //Select Operations
                System.out.println("Pakudex Main Menu");
                System.out.println("-----------------");
                System.out.println("1. List Pakuri");
                System.out.println("2. Show Pakuri");
                System.out.println("3. Add Pakuri");
                System.out.println("4. Evolve Pakuri");
                System.out.println("5. Sort Pakuri");
                System.out.println("6. Exit");
                System.out.println();
                System.out.print("What would you like to do? ");
                option = proj.next();

            }  else if (option.equals("4")) {
                //Evolve Pakuri
                System.out.print("Enter the name of the species to evolve: ");
                check = proj.next();
                if (toast.evolveSpecies(check) == true){
                    count++;
                    toast.evolve(check, count);
                    System.out.println(check + " has evolved!");

                } else {
                    System.out.print("Error: No such Pakuri!");
                    System.out.println();
                }

                //Select Operations
                System.out.println("Pakudex Main Menu");
                System.out.println("-----------------");
                System.out.println("1. List Pakuri");
                System.out.println("2. Show Pakuri");
                System.out.println("3. Add Pakuri");
                System.out.println("4. Evolve Pakuri");
                System.out.println("5. Sort Pakuri");
                System.out.println("6. Exit");
                System.out.println();
                System.out.print("What would you like to do? ");
                option = proj.next();

            }  else if (option.equals("5")) {
                //Sort Pakuri
                System.out.print("Pakuri have been sorted!");
                System.out.println();

                //Select Operations
                System.out.println("Pakudex Main Menu");
                System.out.println("-----------------");
                System.out.println("1. List Pakuri");
                System.out.println("2. Show Pakuri");
                System.out.println("3. Add Pakuri");
                System.out.println("4. Evolve Pakuri");
                System.out.println("5. Sort Pakuri");
                System.out.println("6. Exit");
                System.out.println();
                System.out.print("What would you like to do? ");
                option = proj.next();

            } else {
                //Normal option not picked and Quit Loop
                System.out.println("Unrecognized menu selection!");
                System.out.println();
                System.out.println("Pakudex Main Menu");
                System.out.print("Please enter an option: ");
                option = proj.next();
            }

        }
        //Charasaurus
        if (toast.getSize() != maxCap){
            System.out.println("Thanks for using Pakudex! Bye!");
        }
        if (toast.getSize() == maxCap){
            System.out.println();
            System.out.println();
            System.out.println("Pakudex Main Menu");
        }

    }

}



//mypakuri.getSpecies();
//System.out.println("Species: "+ .getSpecies());
                /* mypakuri.getSpecies();
                   System.out.println("Species: "+ mypakuri.getSpecies());
                   mypakuri.getAttack();
                   System.out.println("Attack: "+mypakuri.getAttack());
                   mypakuri.getDefense();
                   System.out.println("Defense: "+ mypakuri.getDefense());
                   mypakuri.getSpeed();
                   System.out.println("Speed: "+ mypakuri.getSpeed());
                   System.out.print("Please enter an option: ");
                   option = scan.next();
                 /

/*
                for (int i = 0; i < maxCap; i++){
                    System.out.println((i+1) + ". " + toast.getSpeciesArray());
                }
                */
//mypakudex.getSpeciesArray();
/*
                    if (count != 0) {
                        System.out.println("Attack: " + toast.stats[0] * 2 * count);
                        System.out.println("Defense: " + toast.stats[1] * 4 *count);
                        System.out.println("Speed: " + toast.stats[2] * 3 * count);
                    } else {
                        System.out.println("Attack: " + toast.stats[0]);
                        System.out.println("Defense: " + toast.stats[1]);
                        System.out.println("Speed: " + toast.stats[2]);
                    }

                     */

//int[] test;
//int option = 0;
//String pakuriOne;
//Pakudex mypakudex = new Pakudex(maxCap);
//Pakudex[] myStringArray = new Pakudex[maxCap];
//String[] qPakumons = null;
//System.out.println((i+1) + ". " + toast.getSpeciesArray());
//toast.toString().replace("[", " ").replace("]", "");
//+ Arrays.toString(toast.getSpeciesArray()