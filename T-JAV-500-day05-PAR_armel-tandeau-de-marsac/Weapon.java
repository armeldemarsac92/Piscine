public abstract class Weapon{
    protected String name;
    protected Integer apcost;
    protected Integer damage;
    protected boolean melee;
    protected static SpaceMarine owner = null;

    protected Weapon(String name, Integer apcost, Integer damage, boolean melee){
        this.name = name;
        this.apcost = apcost;
        this.damage = damage;
        this.melee = melee;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Integer getApcost() {
        return apcost;
    }

    public Integer getDamage() {
        return damage;
    }

    public boolean isMelee() {
        return melee;
    }

    public SpaceMarine getOwner(){
        return this.owner;
    }

    public static void setOwner(SpaceMarine owner) {
        Weapon.owner = owner;
    }

    public abstract void attack();

}