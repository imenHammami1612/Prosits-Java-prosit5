package tn.esprit.gestionzoo.entities;

public abstract class Aquatiques extends Animal {
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

       public abstract void swim();


@Override
public boolean equals(Object obj) {
    if (obj == null)
        return false;

    if (obj instanceof Aquatiques aquatic) {
        return this.getAge() == aquatic.getAge()
            && this.getName().equals(aquatic.getName())
            && this.habitat.equals(aquatic.habitat);
    }

    return false;
}


}

