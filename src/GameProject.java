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
        //Monsters
        String[] easyMob = {"Zombie", "Skeleton", "Bat"};
        //Monster Stats
        //int monsterHP = 0;
        //int monsterDEF = 0;
        //int monsterATK = 0;
        //int monsterINT = 0;
        //int monsterMana = 0;
        /*Stats
        int HP = 0;
        int DEF = 0;
        int ATK = 0;
        int INT = 0;
        int mana = 0;
        int gold = 0;
        int xp = 0;
        */
        //Items
        //int sword = 0;
        //int shield = 0;

        //Consumnables
        //int healthPot = 3;
        //int healthPotChance = 20;
        //int manaPot = 1;
        //int manaPotChance = 10;

        Scanner input = new Scanner(System.in);
        Player player = new Player();
        Consumables consums = new Consumables();
        boolean game = true;
        boolean combat = false;

        System.out.println("Welcome to Game 2.0");
        System.out.print("Please enter your name: ");
        player.setName(input.nextLine());
        System.out.println("Welcome " + player.getName() + " to the (lore shit or whatever). ");
        System.out.println("Please select a class: 1.Paladin 2.Warrior 3.Mage");
        int choice = input.nextInt();
        while(choice < 1 || choice > 3)
        {
            System.out.print("Invalid input, please try again: ");
            choice = input.nextInt();

        }

        if(choice == 1)
        {
            System.out.println("You chose the paladin.");
            player.setDEF(6);
        }

        else if(choice == 2)
        {
            System.out.println("You chose the warrior");
            player.setATK(11);
        }

        else if(choice == 3)
        {
            System.out.println("You chose the mage.");
            player.setINT(6);
        }

        System.out.println("asdasdasd");



    }

    /**
     * Player deals damage to monster
     * @param playerATK
     * @param sword
     * @param monsterHP
     * @param monsterDEF
     * @return monster's hp
     */
    public static int calculatePlayerDamage(int playerATK, int sword, int monsterHP, int monsterDEF)
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
    public static int calculateMonsterDamage(int HP, int DEF, int shield, int monsterATK)
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
