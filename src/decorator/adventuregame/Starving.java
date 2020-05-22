package decorator.adventuregame;

public class Starving extends CharacterDecorator {
    public Starving(GameCharacter character) {
        super(character);
    }

    @Override
    public String getName() {
    return character.getName() + ", There's a Rumbly in my Tummbly";
    }

    @Override
    public double getMight() {
    return character.getMight() - 10;
    }
}
