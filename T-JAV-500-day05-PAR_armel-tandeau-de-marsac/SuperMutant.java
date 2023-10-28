public class SuperMutant extends Monster {

    private static int id;
    private static String name = "SuperMutant #" + id;
    private int damage = 60;
    private int apcost = 20;

    public SuperMutant(){

        super(name, 170, 20);
        id +=1;
        System.out.println(this.getName() + ": Roaarrr!");
    }

    @Override
    public Boolean attack(Fighter opponent){
        if (opponent instanceof AssautTerminator) {
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
    } else {
        if (this.moveCloseTo(opponent) == false){
            System.out.println("I'm too far away from " + opponent.getName()+ ".");
            return false;
            } else {
            if (this.ap >= this.getApcost()){
                this.ap -= this.getApcost();
                System.out.println(this.getName() + " attacks " + opponent.getName() + ".");
                opponent.receiveDamage(this.getDamage()*2);
                return true;
            } else {
                return false;
            }
        }
            
    }

        
    }

    @Override
    public Boolean equip(Weapon weapon) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'equip'");
    }

    @Override
    public void receiveDamage(int damage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receiveDamage'");
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
        
        if (this.hp + 10 < 170){
            this.hp += 10;
        } else {
            this.hp =170;
        }
    }
}
