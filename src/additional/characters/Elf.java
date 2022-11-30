package additional.characters;

public class Elf implements ICharacter {

    private int life;
    private int defence;
    private int damage;

    public Elf(int life, int defence, int damage) {
        this.life = life;
        this.defence = defence;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void attack(ICharacter iCharacter) {
        iCharacter.receiveDamage(this.damage);
    }

    @Override
    public void receiveDamage(int damage) {
        if (this.defence>damage) return;
        this.life = this.life - damage + defence;


    }

    @Override
    public boolean isDead() {
        return this.life<=0;
    }
}
