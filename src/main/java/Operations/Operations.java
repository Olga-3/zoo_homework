package Operations;
import Animals.*;
import Food.*;
import OpenAirCage.*;
import java.*;

public class Operations {

    public void zooLife() {
        OpenAirCage smallCage = new OpenAirCage(2, "smallCage");
        OpenAirCage bigCage = new OpenAirCage(5, "bigCage");

        Rabbits rabbitBunny = new Rabbits("Bunny" );
        Tigers tigerShere_Khan = new Tigers("Shere Khan");
        Chicken chickNorris = new Chicken("Chick Norris");
        Wolves nymeria = new Wolves("Nymeria");

        rabbitBunny.petAnimal();
        nymeria.petAnimal();


        smallCage.addToCage(rabbitBunny);
        smallCage.addToCage(tigerShere_Khan);

        smallCage.cageDisplay();
        bigCage.cageDisplay();

        rabbitBunny.displayAnimal();
        chickNorris.displayAnimal();

        Carrot freshCarrot = new Carrot(2, "fresh carrot");
        Salad freshSalad = new Salad(1,"fresh salad");
        Pork rawPork = new Pork(2, "raw pork");
        Beef tastySteak= new Beef(1, "tasty steak");

        rawPork.displayFood();
        freshCarrot.displayFood();

        rabbitBunny.eat(tastySteak);
        chickNorris.eat(freshSalad);
        nymeria.eat(rawPork);
        tigerShere_Khan.displayAnimal();
        tastySteak.addFood(2);
    }

/* You can uncomment any lines in main and experiment with animals.
You can create them, pet, feed and add to cages.
Use methods eat(), petAnimal(), displayAnimal() for animals,
displayFood() for food and cageDisplay() and addToCage() for cages
If you put a carnivorous animal into a cage first, and then a herbivorous animal, the herbivorous animal becomes eaten.
Unfortunately, I cannot make it eaten if it is added to the cage first.
Someday maybe.
    */
    public static void main (String[] args) {
        Operations zoo = new Operations();
        zoo.zooLife();

//        Rabbits rabbitBunny = new Rabbits("Bunny" );
//        Rabbits rabbitFluffy = new Rabbits("Fluffy" );
//        Carrot freshCarrot = new Carrot(2, "fresh carrot");
//        Carrot bigCarrot = new Carrot(1, "big carrot");
//        Beef tastySteak= new Beef(1, "tasty steak");
//        rabbitBunny.eat(freshCarrot);
//        freshCarrot.displayFood();
//        rabbitBunny.eat(freshCarrot);
//        freshCarrot.displayFood();
//        rabbitFluffy.eat(bigCarrot);
//        bigCarrot.displayFood();
//        //rabbitFluffy.eat("meat");
//        rabbitBunny.displayAnimal();
//        rabbitFluffy.displayAnimal();
//        OpenAirCage smallCage = new OpenAirCage(2, "smallCage");
//        OpenAirCage bigCage = new OpenAirCage(5, "bigCage");
//
//        smallCage.addToCage(rabbitBunny);
//        rabbitBunny.displayAnimal();
//
//        smallCage.addToCage(rabbitFluffy);
//        rabbitFluffy.displayAnimal();
//        smallCage.cageDisplay();
//
//        Tigers tigerShere_Khan = new Tigers("Shere Khan");
//        Tigers tigerRajah = new Tigers("Rajah");
//        bigCage.addToCage(rabbitFluffy);
//        bigCage.cageDisplay();
//        bigCage.addToCage(tigerRajah);
//        bigCage.addToCage(tigerShere_Khan);
//        bigCage.cageDisplay();
//        tigerRajah.eat(bigCarrot);
//        tigerRajah.petAnimal();
//        rabbitBunny.petAnimal();
//        rabbitBunny.petAnimal();
//        rabbitBunny.displayAnimal();
//        tigerRajah.displayAnimal();
//        tigerRajah.eat(tastySteak);
//        tigerRajah.displayAnimal();
    }
}
