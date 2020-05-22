package decorator.adventuregame;

public class TheRing extends CharacterDecorator{
    public TheRing (GameCharacter character){
        super(character);
    }
    @Override
    public double getMight(){
        return character.getMight() + 100;
    }
    @Override
    public String getName(){
        return character.getName() + ", Ring-Bearer";
    }
}
