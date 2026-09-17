package Character;

import java.util.ArrayList;
import java.util.List;


public abstract class Character {
    protected final String name;
    protected final String race;
    protected final int agility;
    protected final int strength;
    protected final int intelligence;
    protected final int level;
    protected List<Item> equipment = new ArrayList<>();

    protected Character(String name, String race, int agility, int strength, int intelligence, int level) {
        this.name = name;
        this.race = race;
        this.agility = agility;
        this.strength = strength;
        this.intelligence = intelligence;
        this.level = level;
    }

    public void equip(Item item) {
        equipment.add(item);
    }

    public abstract void useAbility();
    public abstract String getResourceType();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(this.name).append('\n');
        stringBuilder.append("Race: ").append(this.race).append('\n');
        stringBuilder.append("Level: ").append(this.level).append('\n');
        stringBuilder.append("Stats: ").append('\n');
        stringBuilder.append("   - Agility: ").append(this.agility).append('\n');
        stringBuilder.append("   - Strength: ").append(this.strength).append('\n');
        stringBuilder.append("   - Intellect: ").append(this.intelligence).append('\n');

        stringBuilder.append("Equipment: ").append('\n');
        for (Item item : this.equipment) {
            stringBuilder.append("   - ").append(item).append('\n');
        }

        return stringBuilder.toString();


    }
}
