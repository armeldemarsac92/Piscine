public class PlasmaRifle extends Weapon {
    public PlasmaRifle(){
        super("PlasmaRifle", 5, 21, false);
    }

    @Override
    public void attack() {
        System.out.println("PIOU");
    }
    
}
