package Food;

public abstract class Meat extends Food {

    //constructor that matches super class Food
    public Meat(int foodAmount, String foodName) {
        super(foodAmount, foodName);
        this.foodType = "meat";
    }
}
