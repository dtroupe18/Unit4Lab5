/**
 * Created by Dave on 1/24/17.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GuinnessBook {
    private ArrayList<Animal> landAnimals;

    public GuinnessBook(String filename) throws FileNotFoundException{

        landAnimals = new ArrayList<Animal>();

        File animalFile = new File(filename);
        Scanner scan = new Scanner(animalFile);

        while(scan.hasNextLine()){
            String[] animalInfo = scan.nextLine().split(" ");
            String animalName = "";

            for(int i = 0; i < (animalInfo.length-1); i++){
                animalName += animalInfo[i] + " ";
            }
            animalName = animalName.trim();
            Integer topSpeed = Integer.parseInt(animalInfo[animalInfo.length-1]);

            Animal animal = new Animal(animalName, topSpeed);
            landAnimals.add(animal);
        }
        scan.close();
    }

    public String toString(){
        String output = "";
        for (int i = 0; i < landAnimals.size(); i++) {
            output += landAnimals.get(i).toString() + "\n";
        }
        return output;
    }

    public void testGuinnessBook() throws FileNotFoundException {
        System.out.println("Is there an animal whose speed is around 70mph? " + landAnimals.contains(new Animal("fast animal", 70)));
        System.out.println("Is there an animal whose speed is around 35mph? " + landAnimals.contains(new Animal("slow animal", 35)));

        System.out.println(landAnimals.get(landAnimals.indexOf(new Animal("fast animal", 70))));
        System.out.println(landAnimals.get(landAnimals.indexOf(new Animal("slow animal", 35))));

        for (int i = 0; i < landAnimals.size(); i++) {
            if (landAnimals.get(i).equals(new Animal("animal", 50))) {
                System.out.println(landAnimals.get(i).toString());
            }
        }
    }
}
