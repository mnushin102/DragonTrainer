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
        return "You hit the {dragon} with an arrow for {damage} damage.";  
    }

    // Call this swordAttack() function to return the attack description and damage dealt to the dragon
    // The dragon recieves a random amount of damage within the range (1-12) 
    public String swordAttack(Dragon d)
    {
        return "You slash the {dragon} with a sword for {damage} damage.";  
    }

    // Return function when the game begins with a player's name and his/her hit points
    public String toString()
    {
        return "Welcome to the dragon training, " + name + 
        "\nyou must defeat 3 dragons.\n" + 
        name + ": " + hp + "/" + maxHp;  
    }
}