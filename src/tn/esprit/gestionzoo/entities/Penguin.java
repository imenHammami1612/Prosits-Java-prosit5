package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatiques{
    protected  float swimmingDepth ;

    public Penguin (float swimmingDepth ,String habitat ,String family, String name, int age, boolean isMammal){
        super(habitat ,family, name,  age, isMammal);
        this.swimmingDepth=swimmingDepth;
    }
    @Override
    public String toString() {
        return "Aquatique{" +
                "family='" + getFamily() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", swimingDepth='" + swimmingDepth + '\'' +
                '}';
    }
 @Override
    public void swim(){
        System.out.println("this pinguin is swimming");
    }
}
