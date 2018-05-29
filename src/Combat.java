public class Combat
{
    private boolean combatStatus;
    private Player player;
    private Monster monster;

    public Combat()
    {

    }

    public Combat(Player player, Monster monster)
    {
        this.player = player;
        this.monster = monster;
    }
}
