package decorator.adventuregame;

public class Sword extends CharacterDecorator {

    public Sword(GameCharacter character) {
        // Call the constructor in the superclass (CharacterDecorator)
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Wielder of Sting";
    }

    @Override
    public double getMight() {
        return character.getMight() + 10;
    }
}
