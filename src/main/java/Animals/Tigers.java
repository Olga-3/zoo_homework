package Animals;

public class Tigers extends Carnivorous{

    //idea wanted to create constructor that matches Herbivorous constructor
    public Tigers(String animalName) {
        super(animalName);
        this.animalSubType = "tiger";
        System.out.println("It is a " + this.animalSubType + ", its name is " + this.animalName + ".");
        System.out.println("-------------");
    }
}
