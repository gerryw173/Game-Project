public abstract class Unit
{
    private int HP;
    private int DEF;
    private int ATK;
    private int INT;

    public Unit()
    {

    }

    public Unit(int HP, int DEF, int ATK, int INT)
    {
        this.HP = HP;
        this.DEF = DEF;
        this.ATK = ATK;
        this.INT = INT;
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

    public abstract String intro();

    public String showStats()
    {
        String a = "HP: " + HP + "\n" +
                "DEF: " + DEF + "\n" +
                "ATK: " + ATK + "\n" +
                "INT: " + INT;

        return a;
    }
}
