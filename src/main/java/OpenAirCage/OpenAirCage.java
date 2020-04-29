package OpenAirCage;
import Animals.*;

public class OpenAirCage {

    int totalCapacity;
    public int animalsNumber;
    public String cageName;
    public String[] cageArray;
    public boolean hasCarnivores;

    //constructor for cages
    public OpenAirCage(int totalCapacity, String cageName) {
        this.totalCapacity = totalCapacity;
        this.cageName = cageName;
        //this.isAvailable = true;
        this.animalsNumber = 0;
        this.cageArray = new String[this.totalCapacity];
        this.hasCarnivores = false;
        System.out.println("-------------");
        System.out.println("A new cage \"" + this.cageName + "\" has been added. It has " + this.totalCapacity + " places.");
        System.out.println("-------------");
    }

    /**
     * method to add an animal to a cage
     * @param animal - parameter shows which animal to add;
     * if there is a free place in the cage, the animal is added successfully
     * if the cage is full, the animal is not added;
     */
    public void addToCage(Animal animal) {
        System.out.print("Trying to put " + animal.animalName + " into " + this.cageName + "...");
        if(this.animalsNumber < this.totalCapacity && !animal.isInCage) { //if total capacity exceeds amount of animals in cage and if animal is currently not in cage
            int animalIndex = this.totalCapacity - 1 - this.animalsNumber;//we find index for animal, i.e. where to put it
            this.cageArray[animalIndex] = animal.animalName; //we add next animal
            this.animalsNumber ++; //number of animals in this cage increases
            animal.isInCage = true; //animal's property becomes positive
            System.out.println(animal.animalName + " is in the cage \"" + this.cageName + "\" now.");
            if(animal.animalType.equals("carnivorous")) { //if animal is carnivorous, we record that there is a dangerous animal in cage now
                this.hasCarnivores = true;//but we say nothing:)
            }
            if(this.hasCarnivores && animal.animalType.equals("herbivorous")) {
                animal.isAlive = false;
                System.out.println("-------------");
                System.out.println("Oops, there was some carnivorous animal in " + this.cageName + "...");
                System.out.println(animal.animalName + " has been eaten!");
                System.out.println("-------------");
            }
            int num = this.totalCapacity - this.animalsNumber;//checking  if there are more places
            String place = "";
            String amount = "";
            if(num == 1) {
                place = "place";
                amount = "1";
            }
            else if(num > 1){
                place = "places";
                amount = Integer.toString(num);
            }
            else {
                place = "places";
                amount = "no";
            }
            System.out.println(this.cageName + " has " + amount + " more " + place + " for animals.");
        }

        else if(animal.isInCage) {
            System.out.println(animal.animalName + " is already in another cage.");
        }
        else {
           System.out.println("You cannot put any more animals here. The cage is already full.");
        }
    }

    /**
     * method to see what's in some cage
     * the method shows if the cage has free places, and how many.
     */
    public void cageDisplay(){
        System.out.println("Let's look into " + this.cageName + "!");
        for(int i = 0; i < this.totalCapacity; i++) {
            System.out.println("Animal № " + (i+1) + ": " + this.cageArray[i]);
        }
        if(this.totalCapacity == this.animalsNumber) {
            System.out.println(this.cageName + " is full.");
        }
        else {
            int num = this.totalCapacity - this.animalsNumber;
            String place = "";
            if(num > 1) {
                place = "places";
            }
            else{
                place = "place";
            }
            System.out.println(this.cageName + " has " + num + " more " + place + " for animals.");
        }
    }
}
