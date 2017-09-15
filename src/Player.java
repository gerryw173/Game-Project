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
