public abstract class SpaceMarine extends Unit {

    Weapon weapon;

    public SpaceMarine(String name, Integer hp, Integer ap){
        super(name, hp, ap);
    }


    public Weapon getWeapon(Weapon weapon) {
        this.weapon = weapon;
        Weapon.owner = this;
        return weapon;
    }
}
