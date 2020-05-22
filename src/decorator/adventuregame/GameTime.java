package decorator.adventuregame;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GameTime {
    public static void main(String[] args) throws InterruptedException {
        GameCharacter Bilbo = new BasicCharacter("Bilbo Boggins");
        Scanner keyboard = new Scanner(System.in);
        boolean isStarving = false;

        System.out.println("Your eyes slowly open as you hear a voice ...");
        Thread.sleep(2500);
        System.out.println("*Glepnir speaks* \n Hey you, you're finally awake");
        Thread.sleep(2500);
        System.out.println("Drowsy and slightly confused, you lift your head and rub your eyes");
        Thread.sleep(2500);
        System.out.println("Glepnir: \n Mate you took a nasty bump on the head from that Orcs club." +
                "\n Can you remember anything?");
        Thread.sleep(2500);
        System.out.println("I remember I was with my group and I fell. Not much else I'm afraid");
        Thread.sleep(1000);
        System.out.println("Name's Bilbo by the way, Bilbo Boggins of the Sphire. And you?");
        Thread.sleep(2500);
        System.out.println("Glepnir's the name. You friends told me to watch over you till you recovered");
        Thread.sleep(2500);
        System.out.println("Here's your stuff Mr.Boggins, you were carrying quite the load given how small you are");
        Thread.sleep(2500);
        System.out.println("You carefully open your bag and start inspecting it's contents...");
        Thread.sleep(1000);
        System.out.println("The first item you pull out is your shield, \"Barricade\"");
        Bilbo = new Shield(Bilbo);
        System.out.println("Your might has been increased!!!" +
                Bilbo.getName() + " Might: " + Bilbo.getMight());

    }
}
