package factory;

import model.Character;
import model.Warrior;

public class WarriorCreator extends CharacterCreator {

    @Override
    public Character createCharacter(String name, String race, int agility, int strength, int intelligence, int level) {
        return new Warrior(name, race, agility, strength, intelligence, level);
    }

}
