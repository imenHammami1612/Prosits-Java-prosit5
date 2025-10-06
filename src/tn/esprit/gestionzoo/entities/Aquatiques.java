package tn.esprit.gestionzoo.entities;

public class Aquatiques extends Animal {
    protected String habitat ;

    public Aquatiques(String habitat ,String family, String name, int age, boolean isMammal){
        super(family, name, age,  isMammal);
        this.habitat=habitat;
    }
    @Override
    public String toString() {
        return "Aquatique{" +
                "family='" + getFamily() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", habitat='" + habitat + '\'' +
                '}';
    }

    public void swim() {
        System.out.println("this aquatic animal is swimming");
    }
}
