package additional.characters;

import java.util.ArrayList;
import java.util.Arrays;

public class CharactersMain1 {

    public static void main(String[] args) {


        Group team = new Group(new ArrayList<>(Arrays.asList(
                new Elf(30, 2, 5),
                new Elf(30, 2, 5), new Ork(35, 1, 3),
                new Human(15, 5, 7),
                new Dwarf(45, 15, 5))));


        Group enemies = new Group(new ArrayList<>(Arrays.asList(
                new Dragon(150, 3, 5),
                new Troll(90, 15, 15))));
        ICharacter troll = new Troll(160, 10, 18);


        team.attack(enemies);

        team.attack(troll);


    }
}
