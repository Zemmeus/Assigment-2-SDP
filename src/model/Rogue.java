package model;

public class Rogue extends Character{
    public Rogue(String name, String race, int agility, int strength, int intelligence, int level) {
        super(name, race, agility, strength, intelligence, level);
    }

    @Override
    public void useAbility() {
        System.out.println("Backstab!");
    }

    @Override
    public String getResourceType() {
        return "Energy";
    }
}
