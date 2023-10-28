public abstract class Monster extends Unit {
    protected Integer damage = 0;
    protected Integer apcost = 0;

    public Monster(String name, Integer hp, Integer ap){
        super(name, hp, ap);
    }
    
    public Integer getDamage() {
        return damage;
    }

    public Integer getApcost() {
        return apcost;
    }

    public void equip(){
        System.out.println("Monsters are proud and fight with their own bodies.");
    }

    @Override
    public void recoverAP(){
        if (this.hp > 0) {
            if (this.ap + 7 > 50){
                this.ap = 50;
            } else {
                this.ap += 7;
            }
        }       
    }

    public Boolean attack(Fighter opponent){
        if (this.moveCloseTo(opponent) == false){
            System.out.println("I'm too far away from " + opponent.getName()+ ".");
            return false;
        } else {
            if (this.ap >= this.getApcost()){
                this.ap -= this.getApcost();
                System.out.println(this.getName() + " attacks " + opponent.getName() + ".");
                opponent.receiveDamage(this.getDamage());
                return true;
            } else {
                return false;
            }
        }
    }
    
}
