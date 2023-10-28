public class AssautTerminator extends SpaceMarine{
    public AssautTerminator(String name){
        super(name, 150, 30);
        Weapon defaultWeapon = new PowerFist();
        this.equip(defaultWeapon);
        System.out.println(this.getName() + " has teleported from space.");

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

    @Override
    public void receiveDamage(int damage){
        if (damage - 3 >= 1) {
        } else {
            damage = 1;
        }
        
        if (this.hp + 3 - damage <= 0){
            this.hp = 0;
        } else {
            this.hp = this.hp + 3 - damage;
        }
    }
  
}
