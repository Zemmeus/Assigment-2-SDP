package factory;

import model.Character;
import model.Rogue;

public class RogueCreator extends CharacterCreator {

    @Override
    public Character createCharacter(String name, String race, int agility, int strength, int intelligence, int level) {
        return new Rogue(name, race, agility, strength, intelligence, level);
    }

}
