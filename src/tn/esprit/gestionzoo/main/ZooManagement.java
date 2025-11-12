package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);



        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

      
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);


        Dolphin aqua1 = new Dolphin(70,"Dolphin", "Mammal", "Flipper", 5, true);
        Terrestiral terestre1 = new Terrestiral(2, "Canine", "Canine", 2, true);
        Dolphin dolphin = new Dolphin(70, "nie", "Canine", "Canine", 2, true);
        Penguin penguin = new Penguin(200, "sea", "pingwinet", "black", 2, false);

        System.out.println("Aquatique :");
        System.out.println(aqua1.toString());

        System.out.println("\nTerrestre :");
        System.out.println(terestre1.toString());

        System.out.println("\nDauphin :");
        System.out.println(dolphin.toString());

        System.out.println("\nPingouin :");
        System.out.println(penguin.toString());

        System.out.println("\ninstructiion 24");

        aqua1.swim();

        dolphin.swim();


//prosit6
        Zoo zoo = new Zoo();
       
        zoo.addAquaticAnimal(new Dolphin(70,"Dolphin", "Mammal", "Flipper", 5, true));

        zoo.addAquaticAnimal(new Penguin(200,"penguin", "Fish", "Goldie", 1, false));

   // Prosit 7 — Test de l’exception 
        System.out.println("\n=== Test de la capacité du Zoo ===");

        Zoo zooo = new Zoo("dofi", "Tunis"); 

          try {
            zooo.addAnimal(new Animal("Feline", "Lion", 4, true));
            System.out.println("Animal ajouté : Lion");
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre d’animaux : " + zoo.getNbrAnimals());

        try {
            zooo.addAnimal(new Animal("Canine", "Chien", -2, true));
            System.out.println("Animal ajouté : Chien");
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre d’animaux : " + zoo.getNbrAnimals());

        try {
            zooo.addAnimal(new Animal("Avian", "Aigle", 3, false));
            System.out.println("Animal ajouté : Aigle");
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }



        System.out.println("Nombre final d’animaux" + zoo.getNbrAnimals());
        System.out.println("=== Fin du test ===");

        zoo.addAquaticAnimal(new Dolphin(70,"Dolphin", "Mammal", "Flipper", 5, true));
        zoo.addAquaticAnimal(new Penguin(200,"penguin", "Fish", "Goldie", 1, false));
    }
}