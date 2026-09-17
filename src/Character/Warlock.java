package Character;

public class Warlock extends Character{
    public Warlock(String name, String race, int agility, int strength, int intelligence, int level) {
        super(name, race, agility, strength, intelligence, level);
    }

    @Override
    public void useAbility() {
        System.out.println("Shadow bolt!");
    }

    @Override
    public String getResourceType() {
        return "Mana + Soul Shards";
    }
}
