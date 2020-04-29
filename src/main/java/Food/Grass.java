package Food;

public abstract class Grass extends Food {

    //constructor that matches super class Food
    public Grass(int foodAmount, String foodName) {
        super(foodAmount, foodName);
        this.foodType = "grass";
    }
}
