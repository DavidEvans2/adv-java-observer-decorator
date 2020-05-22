package decorator.adventuregame;
import java.util.Scanner;

public class GameTime {
    public static void main(String[] args) throws InterruptedException{
        GameCharacter Bilbo = new BasicCharacter("Bilbo Boggins");
        Scanner keyboard = new Scanner(System.in);
        boolean isStarving = false;

        System.out.println("Your eyes slowly open as you hear a voice speaking....");
        Thread.sleep(2500);
        System.out.println("*Glepnir speaks* \n Hey you, you're finally awake");

    }
}
