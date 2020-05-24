package decorator.adventuregame;

public class Smaug implements Creatures {

    String dragonName;
    int might;

    public Smaug() {
        dragonName = "Smaug the Terrible";
        might = 40;
    }

    @Override
    public String getName() {
        return dragonName;
    }

    @Override
    public double getMight() {
        return might;
    }

    @Override
    public void startMessage() {
        System.out.println("You have come face to face with Smaug the terrible.\n" +
                "If you can slay this mighty beast you'll win the game");
        System.out.println("Any key to continue.");
    }

    @Override
    public void victoryMessage() {
        System.out.println("Well done! You've slain the dragon and restored the Dwarves homeland");
    }

    @Override
    public void deathMessage() {
        System.out.println("Smaug has incinerated you and your party of dwarves. Game Over");
    }
}