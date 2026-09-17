package Character;

public class Warrior extends Character{
    public Warrior(String name, String race, int agility, int strength, int intelligence, int level) {
        super(name, race, agility, strength, intelligence, level);
    }

    @Override
    public void useAbility() {
        System.out.println("Mortal Strike!");
    }

    @Override
    public String getResourceType() {
        return "Rage";
    }
}
