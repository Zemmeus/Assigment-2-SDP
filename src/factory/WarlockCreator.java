package factory;

import model.Character;
import model.Warlock;

public class WarlockCreator extends CharacterCreator {

    @Override
    public Character createCharacter(String name, String race, int agility, int strength, int intelligence, int level) {
        return new Warlock(name, race, agility, strength, intelligence, level);
    }

}
