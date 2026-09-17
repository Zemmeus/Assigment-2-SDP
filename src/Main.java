import Character.Character;
import Character.Warlock;
import Character.Rogue;
import Character.Warrior;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Character zemmeusLock = new Warlock("Zemmeus", "Undead", 8, 5, 24, 60);
        Character zemmeusWarrior = new Warrior("Zemmeus", "Undead", 8, 5, 24, 60);
        Character zemmeusRogue = new Rogue("Zemmeus", "Undead", 8, 5, 24, 60);

        List<Character> zemmeusList = new ArrayList<>();
        zemmeusList.add(zemmeusLock);
        zemmeusList.add(zemmeusWarrior);
        zemmeusList.add(zemmeusRogue);

        for (Character character : zemmeusList) {
            character.useAbility();
        }

    }
}