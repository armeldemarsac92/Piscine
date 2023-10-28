public interface Fighter {

    public Boolean equip(Weapon weapon);

    public Boolean attack(Fighter opponent);

    public void receiveDamage(int damage);
    
    public Boolean moveCloseTo(Fighter opponent);
    
    public void recoverAP();

    public String getName();

    public int getAp();

    public int getHp();


}
