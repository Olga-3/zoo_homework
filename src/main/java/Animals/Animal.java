package Animals;
import Food.*;

public abstract class Animal {

    public String favoriteFood;//grass or meat
    boolean isHungry = true;
    public String animalName;
    public String animalType; //carnivorous or herbivorous
    public boolean isInCage = false;
    public String animalSubType; //for ex., rabbit
    public boolean isHappy;
    public boolean isAlive;

    //constructor for animal creation
    public Animal (String animalName) {
        this.animalName = animalName;
        this.isAlive = true;
        this.isHappy = false;
        System.out.println("-------------");
        System.out.println("A new animal baby is born! It is hungry and lost.");
        System.out.println("Put it in an open-air cage, feed it and pet it.");
    }

    /**
     * method for an animal to eat
     * @param food - parameter shows what is eaten;
     * if the animal is alive, the animal eats, and isHungry becomes false;
     * the method prints out that the animal has eaten.
     */
    public void eat(Food food) {
        System.out.print("Trying to feed " + this.animalName + "...");
        if(this.isHungry && food.foodAmount != 0 && this.isAlive) {  //if animal is hungry and if there is some food of this type
            this.isHungry = false; //animal eats
            food.foodAmount --; //food amount decreases
            System.out.println("The " + this.animalSubType + " " + this.animalName + " has eaten " + food.foodSubType + ".");
        }
        else if(!this.isAlive) {
            System.out.println(this.animalName + " cannot eat...it is dead. Probably eaten by a carnivorous animal.");
        }
        else {
            System.out.println(this.animalName + " is not hungry.");
        }
    }

    /**
     * the method prints out animalName, animalType, animalSubType, if it is in cage and if it is hungry.
     * and if it is happy and if it is alive
     */
    public void displayAnimal() {
        System.out.print("ANIMAL INFO: " + this.animalName + " is a " + this.animalSubType + ", it is " + this.animalType + ". ");

        if(this.isAlive) {
            if (this.isHungry) {
                System.out.print("It is very hungry. ");
            } else {
                System.out.print("It is not hungry. ");
            }
            if(this.isHappy) {
                System.out.println(this.animalName + " is happy:)");
            }
            else {
                System.out.println(this.animalName + " is lonely, try to pet and comfort it.");
            }
        }
        if(this.isInCage) {
            System.out.println(this.animalName + " is in an open-air cage.");
        }
        else {
            System.out.println(this.animalName + " is out of cage and lost.");
        }
        if(!this.isAlive) {
            System.out.println(this.animalName + " is dead, poor baby. It was a bad idea to put it in the same cage with carnivorous animal.");
        }
    }

    /**
     * check if the animal is alive and pet it if it is alive.
     * the animal becomes happy.
     * you are not allowed to pet a carnivorous animal.
     */
    public void petAnimal() {
        System.out.print("You are going to pet " + this.animalName + "...");
        if(this.isAlive) {
            if (this.isHappy) {
                System.out.println(this.animalName + " is already happy:)");
            } else if (this.animalType == "carnivorous") {
                System.out.println("Are you sure? " + this.animalName + " is carnivorous, it's not safe to pet it!");
            } else {
                this.isHappy = true;
                System.out.println("You have stroked " + this.animalName + " lovingly. " + this.animalName + " is very happy:)");
            }
        }
        else {
            System.out.println("You cannot pet " + this.animalName + "... it is dead. Probably eaten by a carnivorous animal.");
        }
    }
}
