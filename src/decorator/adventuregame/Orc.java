package decorator.adventuregame;

public class Orc implements Creatures {
    private String orcName;
    private int might;

    public Orc() {
        orcName = "Azog the Defiler";
        might = 15;
    }

    @Override
    public String getName() {
        return orcName;
    }

    @Override
    public double getMight() {
        return might;
    }

    @Override
    public void startMessage() {
        System.out.println("the White Orc, Azog the Deflier has appeared. Prepare for battle!");
        System.out.println("Any key to continue.");
    }

    @Override
    public void victoryMessage() {
        System.out.println("You have slain Azog the Defiler!");
    }

    @Override
    public void deathMessage() {
        System.out.println("Azog has defeated you and ended the line of Durin. Game Over");
    }
}
