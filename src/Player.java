import java.util.Scanner;

/**
 * Created by 1137399 on 8/11/2017.
 */
public class Player
{
    private String name;
    private int HP;
    private int DEF; //Reduces damage taken
    private int ATK;
    private int INT; // magic damage
    private int mana; // max 50
    private int gold;
    private int xp; // max 100
    private int sword; //Increase ATK
    private String swordName;
    private int shield; // Increases DEF
    private String shieldName;

    public Player()
    {
        name = "";
        HP = 20;
        DEF = 5;
        ATK = 10;
        INT = 5;
        mana = 0;
        gold = 0;
        xp = 0;
        sword = 0;
        shield = 0;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getHP()
    {
        return HP;
    }

    public void setHP(int HP)
    {
        this.HP = HP;
    }

    public int getDEF()
    {
        return DEF;
    }

    public void setDEF(int DEF)
    {
        this.DEF = DEF;
    }

    public int getATK()
    {
        return ATK;
    }

    public void setATK(int ATK)
    {
        this.ATK = ATK;
    }

    public int getINT()
    {
        return INT;
    }

    public void setINT(int INT)
    {
        this.INT = INT;
    }

    public int getMana()
    {
        return mana;
    }

    public void setMana(int mana)
    {
        this.mana = mana;
    }

    public int getGold()
    {
        return gold;
    }

    public void setGold(int gold)
    {
        this.gold = gold;
    }

    public int getXp()
    {
        return xp;
    }

    public void setXp(int xp)
    {
        this.xp = xp;
    }

    public void checkLevelUp()
    {
        if(xp >= 100)
        {
            System.out.println("You leveled up!");
            levelUp();
        }

        else
        {
            System.out.println("Not enough xp");
        }
    }

    public void levelUp()
    {
        Scanner input = new Scanner(System.in);
        if(xp >= 100)
        {
            System.out.println("You leveled up!");
            System.out.println("Please choose a stat to level up.");
            System.out.println("1. HP + 5");
            System.out.println("2. DEF + 1");
            System.out.println("3. ATK + 1");
            System.out.println("4. INT + 1");

            int choice = input.nextInt();

            while(choice < 1 || choice > 4)
            {
                System.out.print("Invalid input, please try again: ");
                choice = input.nextInt();
            }

            if(choice == 1)
            {
                setHP(getHP() + 5);
                System.out.println("HP increased by 5");
            }

            else if(choice == 2)
            {
                setDEF(getDEF() + 1);
                System.out.println("DEF increased by 1");
            }

            else if(choice == 3)
            {
                setATK(getATK() + 1);
                System.out.println("ATK increased by 1");
            }

            else if(choice == 4)
            {
                setINT(getINT() + 1);
                System.out.println("INT increased by 1");
            }

            xp -= 100;
        }

        else
        {
            System.out.println("Fix this shit yo");
        }
    }

    public int getSword()
    {
        return sword;
    }

    public void setSword(int sword)
    {
        this.sword = sword;
    }

    public String getSwordName()
    {
        return swordName;
    }

    public void setSwordName(String swordName)
    {
        this.swordName = swordName;
    }

    public int getShield()
    {
        return shield;
    }

    public void setShield(int shield)
    {
        this.shield = shield;
    }

    public String getShieldName()
    {
        return shieldName;
    }

    public void setShieldName(String shieldName)
    {
        this.shieldName = shieldName;
    }

    public String showStats()
    {
        String a = "HP: " + HP + "\n" +
                "DEF: " + DEF + "\n" +
                "ATK: " + ATK;

        return a;
    }
}
