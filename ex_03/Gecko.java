// package ex_03;
public class Gecko{
    private String name;
    public Gecko(){
        name = "Unknown";
        System.out.println("Hello!");
    }
    Gecko(String name){
        this.name = name;
        System.out.println("Hello " + this.name + "!");
    }

    public String getName() {
        return name;
    }

}

