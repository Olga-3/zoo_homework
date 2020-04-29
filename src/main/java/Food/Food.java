package Food;
import java.*;

public abstract class Food {

    public String foodType; //grass or meat
    public String foodSubType;  //carrot, for example
    public String foodName;  //box of carrots, for example
    public int foodAmount;

    //constructor for food
    public Food(int foodAmount, String foodName) {
        this.foodAmount = foodAmount;
        this.foodName = foodName;
        System.out.println("-------------");
        System.out.println("There is some new food.");
        System.out.println("It is " + this.foodName + " and we have " + this.foodAmount + " of it.");
        System.out.println("-------------");
    }

    /**
     * the method prints out foodSubType, foodName and foodAmount
     */
    public void displayFood() {
        if(this.foodAmount == 0) {
            System.out.println("There is no more " + this.foodName + ".");
        }
        else {
            System.out.print("FOOD INFO: " + this.foodName + " is some " + this.foodSubType + ". ");
            String tobe;
            if(this.foodAmount == 1) {
                tobe = "is";
            }
            else {
                tobe = "are";
            }
            System.out.println("There " + tobe + " " + this.foodAmount + " more of it.");
        }
    }

    /**
     * the method increases amount of existing food
     * @param amount is added to the foodAmount of the existing food object
     */
    public void addFood(int amount) {
        this.foodAmount = this.foodAmount + amount;
        System.out.print("We got " + amount + " more " + this.foodName + ". ");
        System.out.println("Now we have " + this.foodAmount + " " + this.foodName + "!");
    }
}
