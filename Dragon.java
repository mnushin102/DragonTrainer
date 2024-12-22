import java.util.*;

public class Dragon 
{
    public String name; 
    public int hp; 
    public int maxHp; 

    // Within the constructor, intialize each dragon's name and their hit points 
    public Dragon(String n, int mHp)
    {
        name = n; 
        hp = mHp;
        maxHp = mHp; 
    }

    // Get the name of each dragon 
    public String getName()
    {
        return name; 
    }

    // Get the hit points of each dragon
    public int getHp()
    {
        return hp; 
    }

    // Reduce the dragon's HP 
    public void takeDamage(int d)
    {
        hp = hp - d; 

        if (hp < 0)
        {
            hp = 0; 
        }
    }

    // This function is also known as the tail attack that the hero takes damage from the dragon's attack
    public String basicAttack(Hero h)
    {

        Random rand = new Random(); 

        // Generate a random number between 0 and 4 (inclusively) 
        int random = rand.nextInt(5); 

        // Add 3 to shift the range to 3-7 for the tail attack 
        int tailAttack = random + 3; 

        // Call the takeDamage function from Hero class 
        h.takeDamage(tailAttack);

        return name + " smashes you with its tail for " + tailAttack + " damage.";
    }

    // This function is also known as the claw attack that the hero takes damage from the dragon's attack
    public String specialAttack(Hero h)
    {

        Random rand = new Random(); 
        
        // Generate a random number between 0 and 4 (inclusively) 
        int random = rand.nextInt(5);

        // Add 4 to shift the range to 4-8 for the claw attack 
        int specialAttack = random + 4; 

        // Call the takeDamage function from the Hero class
        h.takeDamage(specialAttack);

        return name + " slashes you with its claw for " + specialAttack + " damage";
    }

    // Display the name and the hit points of each Dragon 
    public String toString()
    {
        return "Attack " + getName() + ": " + getHp() + "/" + maxHp; 
    }
}
