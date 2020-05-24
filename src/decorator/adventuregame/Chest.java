package decorator.adventuregame;

public class Chest {
    public void listOfChests(){
        System.out.println("1) Open the Bronze Chest");
        System.out.println("2) Open the Silver Chest");
        System.out.println("3) Open the Golden Chest");
        System.out.println("4) Open the Platinum Chest");
    }
    public String treasureChest(int option){
        String loot;
        switch (option){
            case 1:
                loot = "A sturdy spear";
                break;
            case 2:
                loot = "A stinging sword";
                break;

            case 3:
                loot = "A broad shield";
                break;

            case 4:
                loot = "A poisonous spell";
                break;

            default:
                loot = "Whoops, all empty.";
        }
        return loot;
    }

    public GameCharacter levelUp(GameCharacter gameCharacter, int options){
        GameCharacter newSoldier;
        switch (options){
            case 1:
                newSoldier = new Spear(gameCharacter);
                break;

            case 2:
                newSoldier = new Sword(gameCharacter);
                break;

            case 3:
                newSoldier = new Shield(gameCharacter);
                break;

            case 4:
                newSoldier = new Starving(gameCharacter);
                break;

            default: newSoldier = gameCharacter;
            break;
        }
        return newSoldier;
    }
}
