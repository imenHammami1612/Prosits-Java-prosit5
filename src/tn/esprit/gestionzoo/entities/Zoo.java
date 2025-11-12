package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.ZooFullException;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
public class Zoo {

    public static final int NUMBER_OF_CAGES = 3;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }
//prosit 7
/* 

public boolean addAnimal(Animal animal) throws ZooFullException {
    if (searchAnimal(animal) != -1)
        return false;

    if (isZooFull()) {
        throw new ZooFullException();
    }

    animals[nbrAnimals] = animal;
    nbrAnimals++;
    return true;
}

*/

 public boolean addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
    if (animal.getAge() < 0) {
        throw new InvalidAgeException();
    }

    if (searchAnimal(animal) != -1)
        return false;

    if (isZooFull()) {
        throw new ZooFullException();
    }

    animals[nbrAnimals] = animal;
    nbrAnimals++;
    return true;
}


    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }



    //prosit 6

   Aquatiques[] aquaticAnimals = new Aquatiques[10];
    int nbrAquaticAnimals = 0;


    public void addAquaticAnimal(Aquatiques aquatic){
        if (nbrAquaticAnimals < 10){
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
        } else {
            System.out.println("impossible dajouter un animal aquatique");
        }

        
        
    }  
    public void makeAquaticAnimalsSwim() {
    for (int i = 0; i < nbrAquaticAnimals; i++) {
        aquaticAnimals[i].swim();
    }
}
 

public float maxPinguinSwimmingDepth() {
    float maxDepth = 0;
    for (int i = 0; i < nbrAquaticAnimals; i++) {
        if (aquaticAnimals[i] instanceof Penguin) {
            Penguin penguin = (Penguin) aquaticAnimals[i];
            if (penguin.swimmingDepth > maxDepth) {
                maxDepth = penguin.swimmingDepth;
            }
        }
    }
    return maxDepth;
}


public void displayNumberOfAquaticAnimals() {
int nbrDolphins = 0;
int nbPenguins = 0;      
for (int i = 0; i < nbrAquaticAnimals; i++) {
    if (aquaticAnimals[i] instanceof Dolphin) {
        nbrDolphins++;
    } else if (aquaticAnimals[i] instanceof Penguin) {
        nbPenguins++;
    }
     System.out.println("Dauphins : " + nbrDolphins);
     System.out.println("Pingouins : " + nbPenguins);
}
}

}