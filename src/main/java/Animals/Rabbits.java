package Animals;

public class Rabbits extends Herbivorous {

    //idea wanted to create constructor that matches Herbivorous constructor
    public Rabbits(String animalName) {
        super(animalName);
        this.animalSubType = "rabbit";
        System.out.println("It is a " + this.animalSubType + ", its name is " + this.animalName + ".");
        System.out.println("-------------");
    }
}
