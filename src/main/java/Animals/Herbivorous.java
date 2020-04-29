package Animals;

import Food.Food;

public abstract class Herbivorous extends Animal {

//constructor that matches super class Animal
    public Herbivorous(String animalName) {
        super(animalName);
        this.animalType = "herbivorous";
        this.favoriteFood = "grass";
    }

    /**
     * method for an animal to eat
     * @param food - parameter shows what is eaten;
     * if the animal is alive, the method prints out that the animal has eaten.
     * if foodType is the animal's favoriteFood, animal eats, and isHungry becomes false;
     */
    @Override
    public void eat(Food food) throws IllegalArgumentException{
        System.out.print("Trying to feed " + this.animalName + "...");
        if(food.foodType.equals(this.favoriteFood) && this.isAlive) { //if the animal is alive and can eat this food and is hungry
            super.eat(food);
        }
        else if(!this.isAlive) {
            System.out.println(this.animalName + " cannot eat...it is dead. Probably eaten by a carnivorous animal.");
        }
        else {
            System.out.println(this.animalName + " is herbivorous. It only eats grass!");
        }
    }
}
