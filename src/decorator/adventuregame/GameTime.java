package decorator.adventuregame;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GameTime {
    boolean living;
    Scanner keyboard = new Scanner(System.in);

    public void startGameTime(Creatures creatures, GameCharacter gameCharacter) {
       creatures.startMessage();

        System.out.println("You have a might level of " + gameCharacter.getMight());
        System.out.println("The villainous " + creatures.getName() + " has a might level of " + creatures.getMight());
        if (gameCharacter.getMight() >= creatures.getMight()){
            creatures.victoryMessage();
            living = true;
        }
        else{
            creatures.deathMessage();
            living = false;
        }
    }
    public boolean isLiving(){
        return living;
    }
}
