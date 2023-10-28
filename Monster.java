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

    public void melee(Fighter opponent){
        if (this.moveCloseTo(opponent) == false){
            System.out.println("I'm too far away from " + opponent.getName());
        } else {
            if (this.ap >= this.getApcost()){
                this.ap -= this.getApcost();
                System.out.println(this.getName() + " attacks " + opponent.getName() + ".");
                opponent.receiveDamage(this.getDamage());
            }
        }
    }
    
}
