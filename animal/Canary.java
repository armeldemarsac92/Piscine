package animal;
public class Canary extends Animal{

    private Integer eggs;

    public Canary(String name){
        super(name, 2, Type.BIRD);
        this.eggs = 0;
        System.out.println("Yellow and smart? Here I am!");
    }

    public void layEgg(){
        this.eggs += 1;
    }

    public int getEggsCount(){
        return this.eggs;
    }
    
}
