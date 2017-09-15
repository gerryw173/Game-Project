/**
 * Created by 1137399 on 8/15/2017.
 */
public class Monster
{
    private int monsterHP;
    private int monsterDEF;
    private int monsterATK;
    private int monsterINT;
    private int monsterMagicDamage;
    private int monsterMana;

    public Monster()
    {
        monsterHP = 10;
        monsterDEF = 5;
        monsterATK = 5;
        monsterINT = 0;
        monsterMagicDamage = 0;
        monsterMana = 0;
    }

    public int getMonsterHP()
    {
        return monsterHP;
    }

    public void setMonsterHP(int monsterHP)
    {
        this.monsterHP = monsterHP;
    }

    public int getMonsterDEF()
    {
        return monsterDEF;
    }

    public void setMonsterDEF(int monsterDEF)
    {
        this.monsterDEF = monsterDEF;
    }

    public int getMonsterATK()
    {
        return monsterATK;
    }

    public void setMonsterATK(int monsterATK)
    {
        this.monsterATK = monsterATK;
    }

    public int getMonsterINT()
    {
        return monsterINT;
    }

    public void setMonsterINT(int monsterINT)
    {
        this.monsterINT = monsterINT;
    }

    public int getMonsterMagicDamage()
    {
        return monsterMagicDamage;
    }

    public void setMonsterMagicDamage(int monsterMagicDamage)
    {
        this.monsterMagicDamage = monsterMagicDamage;
    }

    public int getMonsterMana()
    {
        return monsterMana;
    }

    public void setMonsterMana(int monsterMana)
    {
        this.monsterMana = monsterMana;
    }
}
