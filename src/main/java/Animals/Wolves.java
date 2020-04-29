package Animals;

public class Wolves extends Carnivorous{
    //idea wanted to create constructor that matches Herbivorous constructor
    public Wolves(String animalName) {
        super(animalName);
        this.animalSubType = "wolf";
        System.out.println("It is a " + this.animalSubType + ", its name is " + this.animalName + ".");
        System.out.println("-------------");
    }
}
