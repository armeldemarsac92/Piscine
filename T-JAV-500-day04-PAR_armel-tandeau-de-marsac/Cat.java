public class Cat extends Animal {

private String color = "grey";

    public Cat(String name, String color) {
        super(name, 4, Type.MAMMAL);
        this.color = color;
        System.out.println(this.name + ": MEEEOOWWW." );
    }

    public Cat(String name) {
        super(name, 4, Type.MAMMAL);
        System.out.println(this.name + ": MEEEOOWWW." );
    }


    public String getColor() {
        return color;
    }

    public void meow(){
        System.out.println(this.name + " the " + this.color + " kitty is meowing.");
    }
}
