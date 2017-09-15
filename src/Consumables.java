/**
 * Created by 1137399 on 8/17/2017.
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
public class Consumables
{
    private int healthPot;
    private int healthPotChance;
    private int manaPot;
    //private int manaPotChance;

    public Consumables() // starting items
    {
        healthPot = 3;
        healthPotChance = 20; // out of 100
        manaPot = 1;
        //manaPotChance = 10; // out of 100
    }

    public int getHealthPot()
    {
        return healthPot;
    }

    public void setHealthPot(int pot)
    {
        healthPot = pot;
    }

    public void useHealthPot()
    {
        if(healthPot == 0)
        {
            System.out.println("No health potions left");
        }

        else
        {
            healthPot--;
        }
    }

    public void useManaPot()
    {
        if(manaPot == 0)
        {
            System.out.println("No health potions left");
        }

        else
        {
            manaPot--;
        }
    }

    public int getManaPot()
    {
        return manaPot;
    }

    public void setManaPot(int pot)
    {
        manaPot = pot;
    }

    public void lootPot()
    {
        Random randy = new Random();
        int x = randy.nextInt(101);

        if(x <= 20)
        {
            System.out.println("You found a health potion.");
            healthPot++;
        }

    }
    public String showPot()
    {
        String a = "Health Potions: " + healthPot + "\n" +
                "Mana Potions: " + manaPot;

        return a;
    }
}
