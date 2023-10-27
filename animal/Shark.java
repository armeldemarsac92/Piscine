package animal;

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
    
}
