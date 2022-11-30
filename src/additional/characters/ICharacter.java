package additional.characters;

public interface ICharacter {

    /**
     * Атакует одного персонажа
     * @param iCharacter
     */
    void attack(ICharacter iCharacter);

    /**
     * Принимает урон от аттаки
     * @param damage
     */
    void receiveDamage(int damage);


    /**
     * Проверяет, умер ли персонаж
     * @return
     */
    boolean isDead();

    /**
     * Возвращает урон, наносимый персонажем
     * @return
     */
    int getDamage();
}
