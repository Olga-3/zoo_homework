package Animals;

import Food.Food;

public abstract class Carnivorous extends Animal {

    //constructor that matches super class Animal
    public Carnivorous(String animalName) {
        super(animalName);
        this.animalType = "carnivorous";
        this.favoriteFood = "meat";
    }

    /**
     * method for an animal to eat
     * @param food - parameter shows what is eaten;
     * the method prints out that the animal has eaten.
     * if foodType is the animal's favoriteFood, animal eats, and isHungry becomes false;
     */
    @Override
    public void eat(Food food) throws IllegalArgumentException{
        if(food.foodType.equals(this.favoriteFood)) {
            super.eat(food);
        }
        else {
            System.out.println(this.animalName + " is carnivorous. It only eats meat!");
        }
    }
}
