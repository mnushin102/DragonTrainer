import java.util.*;

public class FlyingDragon extends Dragon {

    // Set the number of swoop attacks for the flying dragon
    public int swoops = 5; 

    // Assign the name and the max hit points to the variables in Dragon class
    public FlyingDragon(String n, int mHp){
        super(n, mHp);
    }

    // The specialAttack function (also known as the swoop attack) that is overridden
    @Override
    public String specialAttack(Hero h)
    {
        Random rand = new Random(); 

        // Set the range of damage between 5-10 to the hero 
        int swoopAttack = rand.nextInt(5 - 10 + 1) + 5;

        // if there are any swoops left, perform an attack to the hero
        // and reduce the number of swoop attacks by 1
        if (swoops > 0)
        {
            h.takeDamage(swoopAttack);
            swoops--;
            return getName() + " has swooped an attack to the hero for " + swoopAttack + " damage!";
        } 

        // Return 0 if there is none left
        else 
        {
            return getName() + " does not have any swoop attacks left";
        }
    }

    // Display the name, hp, and the max hp of the flying dragon with a number of swoops left
    public String toString()
    {
        return "Attack " + super.getName() + ": " + super.getHp() + "/" + super.maxHp
         + "\nSwoop attacks remaining: " + swoops;
    }

}
