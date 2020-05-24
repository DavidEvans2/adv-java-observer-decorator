package decorator.adventuregame;
import java.util.Scanner;

public class DecoratorDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        GameCharacter gameCharacter = new Spear(new Sword(new BasicCharacter("Bilbo")));
        System.out.println("Welcome to the game " + gameCharacter.getName());
        System.out.println("Your might is now: " + gameCharacter.getMight());

        System.out.println("You and a party of Dwarves have found a troll horde, and discovered 4 chests\n" +
                "Pick your chests carefully.\n");

        int i = 0;
        Chest chest = new Chest();
        while (i <2){
            if (i == 1){
                System.out.println("Choose another chest.");
            }
            chest.listOfChests();
            int option = keyboard.nextInt();
            keyboard.nextLine();

            String loot = chest.treasureChest(option);
            gameCharacter = chest.levelUp(gameCharacter, option);

            System.out.println("Nicely done! You've found a " + loot);
            System.out.println("You are now " + gameCharacter.getName());
            System.out.println("You now have a might score of " + gameCharacter.getMight() + "XP");
            i++;
        }

        System.out.println("Now that you have some equipment, you can go off and face some monsters. Be careful.");

        boolean living = true;
        Creatures Orc = new Orc();
        Creatures Smaug = new Smaug();
        GameTime gameTime = new GameTime();

        //Orc Boss Battle
        gameTime.startGameTime(Orc, gameCharacter);
        living = gameTime.isLiving();

        //Smaug Final Boss
        if(living){
            gameTime.startGameTime(Smaug, gameCharacter);
        }
    }
}
