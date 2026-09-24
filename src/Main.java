import equipment.Adventurer;
import equipment.AllianceEquipmentFactory;
import equipment.HordeEquipmentFactory;
import factory.CharacterCreator;
import factory.RogueCreator;
import factory.WarlockCreator;
import factory.WarriorCreator;
import model.Character;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Factory Method: creators produce characters ====\n");

        List<CharacterCreator> creators = new ArrayList<>();
        creators.add(new WarlockCreator());
        creators.add(new WarriorCreator());
        creators.add(new RogueCreator());

        List<Character> party = new ArrayList<>();
        for (CharacterCreator creator : creators) {
            party.add(creator.spawn("Zemmeus", "Undead", 8, 5, 24, 60));
            System.out.println();
        }

        System.out.println("=== The client never named a concrete class ===\n");
        for (Character member : party) {
            System.out.println(member);
        }

        System.out.println("\n=== Abstract Factory: one factory equips a whole adventurer ===\n");

        Adventurer grommash = new Adventurer("Grommash", new HordeEquipmentFactory());
        grommash.goToBattle();

        System.out.println();

        Adventurer anduin = new Adventurer("Anduin", new AllianceEquipmentFactory());
        anduin.goToBattle();
    }
}