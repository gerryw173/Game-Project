/**
 * Created by 1137399 on 8/3/2017.
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.Random;

public class GameProject
{
    public static void main(String[] args)
    {
        //Create a combat,shop, and maybe entity class
        //clean up this driver class

        Scanner input = new Scanner(System.in);
        Player player = new Player();
        Consumables consumables = new Consumables();
        boolean game = true;
        //boolean combat = false;

        System.out.println("Welcome to Game 2.0");
        System.out.print("Please enter your name: ");
        player.setName(input.nextLine());
        System.out.println("Welcome " + player.getName() + " to the (lore shit or whatever). ");
        System.out.println("Please select a class: 1.Paladin 2.Warrior 3.Mage");


        System.out.println(player);

        while(game)
        {
            System.out.println("You move into next room");
            // set choices and then a combat loop
        }
    }

    /**
     * Player deals damage to monster
     * @param playerATK
     * @param sword
     * @param monsterHP
     * @param monsterDEF
     * @return monster's hp
     */
    private static int calculatePlayerDamage(int playerATK, int sword, int monsterHP, int monsterDEF)
    {
        int playerDamage = (playerATK + sword) - monsterDEF;
        if(playerDamage < 0)
        {
            playerDamage = 0;
        }
        monsterHP -= playerDamage;
        return monsterHP;
    }

    /**
     * Monster deals damage to player
     * @param HP
     * @param DEF
     * @param shield
     * @param monsterATK
     * @return player hp
     */
    private static int calculateMonsterDamage(int HP, int DEF, int shield, int monsterATK)
    {
        int monsterDamage = monsterATK - (DEF + shield);
        if(monsterDamage < 0)
        {
            monsterDamage = 0;
        }
        HP -= monsterDamage;
        return HP;
    }
}
