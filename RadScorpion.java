public class RadScorpion extends Monster {

    private static int id;
    private static String name = "Radscorpion #" + id;
    private int damage = 25;
    private int apcost = 8;

    public RadScorpion(){

        super(name, 80, 50);
        id +=1;
        System.out.println(this.getName() + ": Crrr!");
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
}
