package additional.characters;

import java.util.ArrayList;
import java.util.Iterator;

public class Group {

    private ArrayList<ICharacter> company;
    private int collectiveDamage;

    public Group(ArrayList<ICharacter> item) {
        this.company = item;
        for (ICharacter iCharacter : item) {
            collectiveDamage += iCharacter.getDamage();
        }
    }

    /**
     * Метод наносит урон единичному врагу
     * @param enemy
     */
    public void attack(ICharacter enemy) {
        enemy.receiveDamage(collectiveDamage);

    }

    /**
     * Метод наносит урон группе врагов
     * @param group
     */
    public void attack(Group group) {
        group.receiveDamage(this.collectiveDamage);

    }

    /**
     * Реализует получение урона группой. Удаляет мертвых врагов из группы
     * @param damage
     */
    public void receiveDamage(int damage) {
        for (ICharacter iCharacter : company) {
            iCharacter.receiveDamage(damage);
        }
        for (Iterator<ICharacter> it = company.iterator(); it.hasNext(); ) { //вроде работает, не успел толком потестить
            if (it.next().isDead()) {
                it.remove();
            }
        }


    }


}
