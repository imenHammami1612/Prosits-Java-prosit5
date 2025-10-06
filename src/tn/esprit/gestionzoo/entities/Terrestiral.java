package tn.esprit.gestionzoo.entities;

public class Terrestiral extends Animal {
    protected int nbrLegs ;

    public Terrestiral(int nbrLegs,String family, String name, int age, boolean isMammal){
        super(family, name, age,  isMammal);
        this.nbrLegs=nbrLegs;
    }

    @Override
    public String toString() {
        return "Aquatique{" +
                "family='" + getFamily() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", nbrLegs='" + nbrLegs+ '\'' +
                '}';
    }
}
