package factory;

import model.Character;

public abstract class CharacterCreator {

    public abstract Character createCharacter(String name, String race, int agility, int strength, int intelligence, int level);

    public Character spawn(String name, String race, int agility, int strength, int intelligence, int level) {
        Character c = createCharacter(name, race, agility, strength, intelligence, level);
        System.out.println("Spawned: " + name);
        c.useAbility();
        System.out.println(c.getResourceType());
        return c;
    }
}
