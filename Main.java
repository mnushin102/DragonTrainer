import java.util.*;
public class Main {

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name challenger?");
        String heroName = in.nextLine();

        Hero h = new Hero(heroName, 50);

        ArrayList<Dragon> dragons = new ArrayList<Dragon>();
        dragons.add(new Dragon("Deadly Nadder", 10));
        dragons.add(new FireDragon("Gronckle", 15));
        dragons.add(new FlyingDragon("Timberjack", 20));
        System.out.println(h.toString());

    }
    
}
