public interface Fighter {

    public boolean equip(Weapon weapon);

    public boolean attack(Fighter opponent);

    public void receiveDamage(int damage);
    
    public boolean moveCloseTo(Fighter opponent);
    
    public void recoverAP();

    public String getName();

    public int getAp();

    public int getHp();


}
