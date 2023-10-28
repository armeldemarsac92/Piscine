public class TacticalMarine extends SpaceMarine {
    public TacticalMarine(String name){
        super(name, 100, 20);
        Weapon defaultWeapon = new PlasmaRifle();
        this.equip(defaultWeapon);
        System.out.println(this.getName() + " on Duty.");

    }

    @Override
    public void recoverAP(){
        if (this.hp > 0) {
            if (this.ap + 12 > 50){
                this.ap = 50;
            } else {
                this.ap += 12;
            }
        }       
    }

    public void receiveDamage(int damage) {
    }


}
