public class Shark extends Animal {

    private Boolean frenzy = false;

    public Shark(String name){
        super(name, 0, Type.FISH);
        System.out.println("A KILLER IS BORN!");
    }

    public void smellsBlood(Boolean blood){
        this.frenzy = blood;
    }

    public void status(){
        if (this.frenzy){
            System.out.println(this.name + " is smelling blood and wants to kill.");
        } else {
            System.out.println(this.name + " is swimming peacefully.");
        }
    }

    public boolean canEat(Animal prey){
        if (this == prey) {
            return false;
        } else {
            if (this instanceof BlueShark){
                if (prey.type == Type.FISH) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (prey instanceof Canary) {
                    System.out.println(this.name + ": nex time you try to give me that to eat, I'll eat you instead.");
                    return false;
                } else {
                    if (prey instanceof Shark) {
                        System.out.println(this.name + ": The best meal one could wish for.");
                        return true;
                    } else {
                        return true;
                    }
                } 

            }
        }
        
        
    }

    public void eat(Animal prey){
        if (this.canEat(prey)){
            System.out.println(this.name + " ate a " + prey.getType() + " named " + prey.getName() + ".");
            this.frenzy = false;
        } else {
            System.out.println(this.name + ": It's not worth my time.");
        }
    }
    
}
