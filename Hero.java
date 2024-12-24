import java.util.*;
public class Hero {

    public String name; 
    public int hp; 
    public int maxHp; 

    // A Hero constructor intializes the name, hit points, and max hit points 
    public Hero(String n, int mHp)
    {
        name = n;
        hp = mHp; 
        maxHp = mHp; 
    }

    // Return the hp 
    public int getHp(){
        return hp;
    }

    // This function would be called if the player's hit points are reduced by one of the three dragons
    public void takeDamage(int d)
    {
        hp = hp - d; 
        
        if (hp < 0){
            hp = 0; 
        }
    }

    // Call this arrowAttack() function to return the attack description and damage dealt to the dragon
    // The dragon recieves a random amount of damage within the range (1-12) 
    public String arrowAttack(Dragon d)
    {

        Random rand = new Random(); 

        // Generate a random number between 0 and 11 (inclusively) 
        int random = rand.nextInt(12);

        // Add 1 to shift the range to 1-12 for the arrow attack 
        int arrowAttack = random + 1; 

        // Call the takeDamage function to decrement the dragon's hit points
        d.takeDamage(arrowAttack);

        // Return the string including the name of the dragon and the amount of damage to the dragon
        return "You hit the + " + d.getName() + " with an arrow for " + arrowAttack + " damage.";  
    }

    // Call this swordAttack() function to return the attack description and damage dealt to the dragon
    // The dragon recieves a random amount of damage within the range 1-12
    public String swordAttack(Dragon d)
    {

        Random rand = new Random(); 

        // Generate two random numbers between 1 and 12 (inclusively)
        int random = rand.nextInt(12);

        // Add these two generated random numbers to shift the range to (1-6) + (1-6) for the arrow attack 
        int swordAttack = random + 1;

        // Call the takeDamage function to decrement the dragon's hit points
        d.takeDamage(swordAttack);
        return "You slash the + " + d.getName() + " with a sword for " + swordAttack + " damage.";  
    }

    // Return function when the game begins with a player's name and his/her hit points
    public String toString()
    {
        return name + ": " + hp + "/" + maxHp;  
    }
}