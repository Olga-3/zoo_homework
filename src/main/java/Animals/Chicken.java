package Animals;

public class Chicken extends Herbivorous{

    //idea wanted to create constructor that matches Herbivorous constructor
    public Chicken(String animalName) {
        super(animalName);
        this.animalSubType = "chicken";
        System.out.println("It is a " + this.animalSubType + ", its name is " + this.animalName + ".");
        System.out.println("-------------");
    }
}
