package animal;

public class Example {
    public static void main(String[] args) {
        Animal loutre = new Animal("Loutre", 4, Animal.Type.MAMMAL);
        System.out.println(loutre.getName() + " has " + loutre.getnLegs() + " legs and is a " + loutre.getType() + ".");

        Animal eagle = new Animal("Eagle", 2, Animal.Type.BIRD);
        System.out.println(eagle.getName() + " has " + eagle.getnLegs() + " legs and is a " + eagle.getType() + ".");

        Animal salmon = new Animal("Salmon", 0, Animal.Type.FISH);
        System.out.println(salmon.getName() + " has " + salmon.getnLegs() + " legs and is a " + salmon.getType() + ".");

        Animal lion = new Animal("Lion", 4, Animal.Type.MAMMAL);
        System.out.println(lion.getName() + " has " + lion.getnLegs() + " legs and is a " + lion.getType() + ".");

        Animal parrot = new Animal("Parrot", 2, Animal.Type.BIRD);
        System.out.println(parrot.getName() + " has " + parrot.getnLegs() + " legs and is a " + parrot.getType() + ".");

        // Display counts for each type and total animals
        System.out.println(); // Add an empty line for clearer output
        Animal.getNumberOfMammals();
        Animal.getNumberOfBirds();
        Animal.getNumberOfFish();
        Animal.getNumberOfAnimals();

        System.out.println("");
        Cat alfred = new Cat("Alfred");
        System.out.println(alfred.name + " has " + alfred.getnLegs() + " legs.");
        alfred.meow();

        System.out.println("");
        Cat thierry = new Cat("Thierry");
        thierry.meow();

        Shark megalodon = new Shark("Megalodon");
        megalodon.smellsBlood(true);
        megalodon.status();
        System.out.println("");
        megalodon.smellsBlood(false);
        megalodon.status();

        System.out.println("");
        Canary paul = new Canary("Paul");
        System.out.println("Layed eggs: " + paul.getEggsCount());
        paul.layEgg();
        paul.layEgg();
        System.out.println("Layed eggs: " + paul.getEggsCount());
    }
}
