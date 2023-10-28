public abstract class Unit implements Fighter {
    protected String name;
    protected Integer hp;
    protected Integer ap;

    protected Unit(String name, Integer hp, Integer ap){
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public int getAp() {
        return this.ap;
    }

    public void recoverAP(){ 
    }

    public void receiveDamage(Integer damage){
        if (this.hp - damage <= 0){
            this.hp = 0;
        } else {
            this.hp = this.hp - damage;
        }
    }

    public Boolean moveCloseTo(Fighter opponent){
        if (this.hp > 0) {
            if (this == opponent){
            return false;
        } else {
            System.out.println(this.name + " is moving closer to " + opponent.getName());
            return true;
            }
        } else {
            return false;
        }
        

    }

    
}
