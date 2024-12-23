import java.util.*;

public class FireDragon extends Dragon {

    // Set the number of fire shots to a number
    protected int fireShots = 3; 

    // In a constructor, assign name and maximum hit points to the Dragon's instance variables by calling super
    public FireDragon(String n, int mHP)
    {
        super(n, mHP);
    }

    // The specialAttack function (also known as the fire attack) is overidden 
    // since there is a same method name with the same parameter in the Dragon class
    @Override
    public String specialAttack(Hero h)
    {
        Random rand = new Random();

        // Generate a random number between 0 and 4 (inclusively) 
        int random = rand.nextInt(5);

         // Add 4 to shift the range to 5-9 for the fire attack 
        int fireAttack = random + 5; 

        // If there are a number of fire shots left, then deal random damage to the hero 
        if (fireShots > 0){
            h.takeDamage(fireAttack);
            fireShots--;
            return "Gronckle engulfs you in flames for " + fireAttack + " damage!";
        }

        // Return 0 if there is no fire shots left
        else {
            return "Gronckle has no shots to attack the hero!";
        }
    }

    // Display the attack description with the name, hit points, and the number of fire shots remaining
    public String toString()
    {
        return "Attack " + super.getName() + ": " + super.getHp() + "/" + super.maxHp
                + "\nFire Shots remaining: " + fireShots;
    }
}
