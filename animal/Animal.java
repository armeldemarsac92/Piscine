package animal;

public class Animal{
    protected enum Type {
        MAMMAL, FISH, BIRD
    }

    protected String name;
    protected Integer nLegs;
    protected Type type;
    protected static Integer numberOfAnimals = 0;
    protected static Integer numberOfMammals = 0;
    protected static Integer numberOfBirds = 0;
    protected static Integer numberOfFish = 0;
    
    


    public Animal(String name, Integer nLegs, Type type) {
        this.name = name;
        this.nLegs = nLegs;
        this.type = type;
        numberOfAnimals += 1;

        switch (type) {
            case MAMMAL:
                numberOfMammals += 1;
                break;

            case FISH:
                numberOfFish += 1;
                break;

            case BIRD:
                numberOfBirds += 1;
                break;
        
            default:
                break;
        }

        System.out.println("My name is " +  this.name + " and I am a " + this.getType() + "!");

    }

    public String getName() {
        return name;
    }

    public String getType() {
        String typeLowerCase = type.toString().toLowerCase();
        return typeLowerCase;
    }

    public Integer getnLegs() {
        return nLegs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Integer getNumberOfAnimals() {
        if (numberOfAnimals == 1) {
            System.out.println("There is currently 1 animal in our world.");
        } else {
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        }
        return numberOfAnimals;
    }

    public static Integer getNumberOfBirds() {
        if (numberOfBirds == 1 ) {
            System.out.println("There is currently 1 bird in our world.");
        } else {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        }
        return numberOfBirds;
    }

    public static Integer getNumberOfFish() {
        if (numberOfFish == 1 ) {
            System.out.println("There is currently 1 fish in our world.");
        } else {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }
        return numberOfFish;
    }

    public static Integer getNumberOfMammals() {
        if (numberOfMammals == 1 ) {
            System.out.println("There is currently 1 mammal in our world.");
        } else {
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        }
        return numberOfMammals;
    }



} 