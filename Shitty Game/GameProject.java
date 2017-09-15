import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GameProject
{
	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner(System.in);
      Random randy = new Random();
      
      boolean game = true; 
		
      // Player stats
		int playerHP = 0; // HP 
		int maxPlayerHP = 0; // Max HP
		int playerAttack = 0; // Damage
		int playerDefense = 0; // Defense
		int playerLuck = 0; // Crit % and money 
		int xp = 0;
		
		// Potions
      int potionHeal = 20;
      int numHealthPots = 3;
      
      int potionDropChance = 15;
      
      int potionAttackValue = 5;
      int potionAttack = 5;
      int numAttackPots = 1;
      
      int potionDefenseValue = 5;
      int potionDefense = 5;
      int numDefensePots = 1;

		//Monsterstats
      int monsterHP = 0;
		int monsterATK = 0;
		int monsterDF = 0;
		int monsterLUCK = 0;
		int xpGain = 0;
      
		//Enemy types
      String[] easyEnemies = {"skeleton", "zombie", "bat"};      
    
		printWithDelays("Welcome traveler.", TimeUnit.MILLISECONDS, 20);
      System.out.println(" ");
      printWithDelays("Before we may begin you must first choose your background", TimeUnit.MILLISECONDS, 20);
      System.out.println(" ");
		
		System.out.println("1. A noble (Recommended)" );
		System.out.println("2. A warrior (Recommended)");
		System.out.println("3. A merchant");
		System.out.println("4. A thief");
      
		int father = input.nextInt();
		String fatherBio = " ";
		
		while(father < 1 || father > 4)
		{
			System.out.println("Please enter a valid input.");
			father = input.nextInt();
		}
		
		if(father == 1)
		{
			playerHP = 100;
			maxPlayerHP = 100;
			playerAttack = 20;
			playerDefense = 20;
			playerLuck = 10;
			fatherBio = "You are a noble in the king's court. You headed out to the dungeon to gain glory and advance yourself within the court.";
			
		}
		
		else if(father == 2)
		{
			playerHP = 100;
			maxPlayerHP = 100;
			playerAttack = 25;
			playerDefense = 25;
			playerLuck = 1;
			fatherBio = "Like your father, you became an accomplished warrior. You headed out to the dungeon to prove your worth.";
		}
		
		else if(father == 3)
		{
			playerHP = 80;
			maxPlayerHP = 80;
			playerAttack = 15;
			playerDefense = 10;
			playerLuck = 20;
			fatherBio = "You are simply an oppurtunist and profiteer. You were drawn to the dungeon by it's possible riches. ";
		}
		
		else if(father == 4)
		{
			playerHP = 80;
			maxPlayerHP = 80;
			playerAttack = 15;
			playerDefense = 5;
			playerLuck = 35;
			fatherBio = "You grew up on the streets and became a vagabond. Forced to steal for a living, the dungeon's rewards was a way out of your dirt poor lifestyle.";
		}
		
		printWithDelays(fatherBio, TimeUnit.MILLISECONDS, 25);
		System.out.println(" ");
		printWithDelays("You arrive at the entrance of the dungeon.", TimeUnit.MILLISECONDS, 20);
		System.out.println(" ");
      
	   int count = 0;
   
      boolean combat = true; // while fighting

		while(game) // first stage
		{  
         String enemy = easyEnemies[randy.nextInt(easyEnemies.length)];
         printWithDelays("You enter the next room and spot a " + enemy + ".", TimeUnit.MILLISECONDS, 20);
         System.out.println(" ");
			
         // monster stats           
         monsterHP = randy.nextInt(31) + 15;
         monsterATK = randy.nextInt(26) + 15;
         monsterDF = randy.nextInt(11) + 1;
         monsterLUCK = randy.nextInt(26) + 5;
			xpGain = randy.nextInt(21) + 5;
			
			// buff booleans
			
			boolean atkPot = false;
			boolean defPot = false;
			boolean atkPotStop = false; // End of buff
			boolean defPotStop = false; 
            
		   while(combat)
         {  
				// Conditions for buffs
				if(atkPot == true) // attack buff
				{
					playerAttack += 5; 
					
					atkPot = false;
					atkPotStop = true;
				}
				
				if(defPot == true) // defense buff
				{
					playerDefense += 5; 
					
					defPot = false;
					defPotStop = true;
				}

				        
            System.out.println("What will you do?");
            
            System.out.println("Your HP:" + playerHP);
            System.out.println("Enemy HP:" + monsterHP);

			   System.out.println("1. Attack");
			   System.out.println("2. Items");
         
			   int choice = input.nextInt(); // choice
         
            if(choice < 1 || choice > 2)
            {
               System.out.println("Please choose a valid input.");
            }
			
   	      if(choice == 1) // Attack
   	      {  
					// player deals damage             
               monsterHP = playerCalculateDamage(playerAttack, playerDefense , playerLuck, playerHP, monsterATK, monsterDF, monsterLUCK, monsterHP);
               
               if(monsterHP <= 0) // Monster defeated
               {
						// Buffs end
						if(atkPotStop == true)
						{
							atkPotStop = false;
							playerAttack -= 5;
						}
						
						if(defPotStop == true)
						{
							defPotStop = false;
							playerDefense -= 5;
						}
						
						xp += xpGain;
						
                  printWithDelays("You defeated the " + enemy + ".", TimeUnit.MILLISECONDS, 20);
                  System.out.println(" ");
						printWithDelays("You gained " + xpGain + " exp.", TimeUnit.MILLISECONDS, 20);
						System.out.println(" ");
						
                  // Dropped pots
                  int potionDrop = randy.nextInt(101);
                  
                  if(potionDrop <= potionDropChance)
                  {
                     int num = randy.nextInt(3) + 1;
                     
                     if(num == 1)
                     {
                        System.out.println("You looted an HP potion");
                        numHealthPots++;
                     }
                     
                     if(num == 2)
                     {
                        System.out.println("You looted an Attack potion");
                        numAttackPots++;
                     }
                     
                     if(num == 3)
                     {
                        System.out.println("You looted an Defense potion");
                        numDefensePots++;
                     }
                  }
                  
						if(xp >= 100) // Level up
						{
							printWithDelays("You have leveled up!", TimeUnit.MILLISECONDS, 20);
							System.out.println(" ");
							
							int xpChoice = 0;
							
							System.out.println("What would you like to level up?");
							
			            System.out.println("1. Attack: " + playerAttack + " (+1)");
			            System.out.println("2. Defense: " + playerDefense + " (+1)");
			            System.out.println("3. Luck: " + playerLuck + " (+2)");
							
							xpChoice = input.nextInt();
							
							while(xpChoice < 1 || xpChoice > 3)
							{
								System.out.println("Please choose a valid input.");
								xpChoice = input.nextInt();
							}
							
							if(xpChoice == 1) // ATK upgrade
							{
								printWithDelays("Attack increased by 1." , TimeUnit.MILLISECONDS, 20); 
								System.out.println(" ");
								playerAttack++;
							}
							
							if(xpChoice == 2) // DF upgrade
							{
								printWithDelays("Defense increased by 1." , TimeUnit.MILLISECONDS, 20);
								System.out.println(" ");
								playerDefense++;
							}
							
							if(xpChoice == 3) // LUCK upgrade
							{
								printWithDelays("Luck increased by 2." , TimeUnit.MILLISECONDS, 20);
								System.out.println(" ");
								playerLuck += 2;
							}

							xp -= 100;	
						}
                  
                  System.out.println("What would you like to do before moving on?");    
                  System.out.println("1. Check stats");
                  System.out.println("2. Use a health potion(" + numHealthPots + ")");
                  System.out.println("3. Move on");
                  
                  int victoryChoice = input.nextInt();
						
						while(victoryChoice < 1 || victoryChoice > 3)
						{
							System.out.println("Please enter a valid input.");
							victoryChoice = input.nextInt();
						}
                  
                  if(victoryChoice == 1) // Check stats
                  {
                     System.out.println("HP: " + playerHP);
			            System.out.println("Attack: " + playerAttack);
			            System.out.println("Defense: " + playerDefense);
			            System.out.println("Luck: " + playerLuck);
							System.out.println("EXP: " + xp);
                  }
						
						if(victoryChoice == 2 && numHealthPots >= 1 && playerHP < maxPlayerHP) // Use HP pot
						{
							printWithDelays("You heal yourself for 20." , TimeUnit.MILLISECONDS, 20);
							System.out.println(" ");
							playerHP += 20;
							numHealthPots --;
							
							if(playerHP > maxPlayerHP)
							{
								playerHP = maxPlayerHP;
							}
						}
						
						if(victoryChoice == 3) // Check money
						{
							break;
						}
                  
                  break;
               }
               
               playerHP = monsterCalculateDamage(playerAttack, playerDefense , playerLuck, playerHP, monsterATK, monsterDF, monsterLUCK, monsterHP);
					
               if(playerHP <= 0) // Death
               {
                  System.out.println("You have been defeated.");
                  return;
               }
               
   	      }
			
   			else if(choice == 2) // Items
   			{
               boolean Attack = true; // for when player backs out of menu
               
               System.out.println("You have " + numHealthPots + " health potions."); // SOP for hp potions
   				System.out.println("You have " + numAttackPots + " attack potions."); // SOP for defense potions
   				System.out.println("You have " + numDefensePots + " defense potions."); // SOP for attack potions
               printWithDelays("What potion do you want to use?", TimeUnit.MILLISECONDS, 20);
					System.out.println(" ");
               System.out.println("1. Health Potion (Heals for 20)");
               System.out.println("2. Attack Potion (Increases your attack by 5 for the battle)");
               System.out.println("3. Defense Potion (Increases your defense by 5 for the battle)");
               System.out.println("4. Go back");
               
					int itemChoice = 0;
					
					itemChoice = input.nextInt();
					
					if(itemChoice < 1 || itemChoice > 4)
					{
						System.out.println("Please choose a valid input.");
						
						itemChoice = input.nextInt();
					}
					
					if(itemChoice == 1 && numHealthPots >= 1 && playerHP < maxPlayerHP) // Use HP pot
					{						
						printWithDelays("You heal yourself for 20." , TimeUnit.MILLISECONDS, 20);
						System.out.println(" ");
						playerHP += 20;
						numHealthPots --;
							
						if(playerHP > maxPlayerHP)
						{
							playerHP = maxPlayerHP;
						}
					}
					
					if(itemChoice == 2 && numAttackPots >= 1) // Use attack pot
					{
						System.out.println("You drink an attack potion");
						atkPot = true;
						numAttackPots--;
					}
					
					if(itemChoice == 3 && numDefensePots >= 1) // use defense pot
					{
						System.out.println("You drink a defense potion");
						defPot = true;
						numDefensePots--;
					}
               
               if(itemChoice == 4)
               {
                  Attack = false;
               }
               
               else if(Attack == true)
               {
                  playerHP = monsterCalculateDamage(playerAttack, playerDefense , playerLuck, playerHP, monsterATK, monsterDF, monsterLUCK, monsterHP); // monster attacks
               }
               
               if(playerHP <= 0) // Death
               {
                  System.out.println("You have been defeated.");
                  return;
               }
   			}
         }
			
         count++;
         System.out.println(count);
      }  
   }
	
   // player attack
	public static int playerCalculateDamage(int playerATK, int playerDF, int playerLUCK, int playerHP, int monsterATK, int monsterDF, int monsterLUCK, int monsterHP)
	{
		Random randy = new Random();
		
		int critDamage = 5;
		
		int criticalChance = randy.nextInt(101);
		
		int playerDamage = (playerATK) - monsterDF;
		
		if(criticalChance <= playerLUCK)
		{
			playerDamage += critDamage;
			System.out.println("Critical hit!");
		}
		
		monsterHP -= playerDamage;
      
      if(playerDamage < 0)
      {
         playerDamage = 0;
      }
		
		System.out.println("You dealt " + playerDamage + " damage to the enemy.");
      
      return monsterHP;
	}	
   
   //monster attack
   public static int monsterCalculateDamage(int playerATK, int playerDF, int playerLUCK, int playerHP, int monsterATK, int monsterDF, int monsterLUCK, int monsterHP)
   {
      Random randy = new Random();
   
      int critDamage = 5;

		int criticalChance = randy.nextInt(101);
      
      int monsterDamage = monsterATK - (playerDF);
		
		if(criticalChance <= monsterLUCK)
		{
			monsterDamage += critDamage;
			System.out.println("Critical hit!");
		}
      
      if(monsterDamage < 0)
      {
         monsterDamage = 0;
      }

		playerHP -= monsterDamage;
      
      System.out.println("You received " + monsterDamage + " damage.");
      
      return playerHP;
   }
   
   public static void printWithDelays(String data, TimeUnit unit, long delay) throws InterruptedException
	{
   	for(char ch:data.toCharArray()) 
	 	{
      	System.out.print(ch);
      	unit.sleep(delay);
   	}
	}
}