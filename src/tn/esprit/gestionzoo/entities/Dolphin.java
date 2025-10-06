package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatiques{
    protected float swimmingSpeed ;

    public Dolphin (float swimmingSpeed ,String habitat ,String family, String name, int age, boolean isMammal){
        super(habitat ,family, name,  age, isMammal);
        this.swimmingSpeed=swimmingSpeed;
    }
    @Override
    public String toString() {
        return "Aquatique{" +
                "family='" + getFamily() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", swimmingSpeed='" + swimmingSpeed + '\'' +
                '}';
    }
    @Override
    public void swim(){
        System.out.println("this dolphin is swimming");
    }
}
