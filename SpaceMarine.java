public abstract class SpaceMarine extends Unit {

    private Weapon weapon;

    public SpaceMarine(String name, Integer hp, Integer ap){
        super(name, hp, ap);
    }

    public Weapon getWeapon(){
        return weapon;
    }

    @Override
    public void recoverAP(){
        if (this.hp > 0) {
            if (this.ap + 9 > 50){
                this.ap = 50;
            } else {
                this.ap += 9;
            }
        }       
    }

    public Boolean equip(Weapon weapon) {
        if (weapon.getOwner() == null) {
            this.weapon = weapon;
            Weapon.setOwner(this);
            System.out.println(this.getName() + " has been equiped with " + weapon.getName() + ".");
            return true;
        } else {
            System.out.println(weapon.name + " has already been taken by " + weapon.getOwner().getName() + ".");
            return false;
        }
    }

    public Boolean attack(Fighter opponent){
        if (this.weapon == null) {
            System.out.println("Hey, this is crazy. I'm not gonna this empty-handed.");
            return false;
        } else {
            if (this.weapon.melee == true && this.moveCloseTo(opponent) == false){
                System.out.println(this.getName() + ": I'm too far away from " + opponent.getName() + ".");
                return false;
            } else {
                if (this.ap >= weapon.getApcost()){
                    System.out.println(this.getName() + " attacks " + opponent.getName() + " with a " + weapon.getName() + ".");
                    weapon.attack();
                    opponent.receiveDamage(weapon.getDamage());
                    this.ap -= weapon.getApcost();
                    return true;
                } else {
                    return false;
                }

            }
        }
    }
}
    
