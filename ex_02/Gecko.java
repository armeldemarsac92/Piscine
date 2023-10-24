// package ex_02;
public class Gecko{
    String name;
    Gecko(){
        name = "Unknown";
        System.out.println("Hello!");
    }
    Gecko(String name){
        this.name = name;
        System.out.println("Hello " + this.name + "!");
    }

    public static void main ( String [] args ) {
        Gecko arthur = new Gecko ("Arthur") ;
        Gecko benjy = new Gecko () ;

        System.out.println(arthur.name);
        System.out.println(benjy.name);
        }
}