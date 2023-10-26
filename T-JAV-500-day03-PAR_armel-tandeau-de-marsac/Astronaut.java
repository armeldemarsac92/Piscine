import planet.*;
import chocolate.*;


public class Astronaut {
    private String name;
    private Integer snacks = 0;
    private String destination = null;
    private Integer id = 0;
    private static Integer count = 0;

    public Astronaut(String name) {
        this.id = count;
        count += 1;
        this.name = name;
        System.out.println(this.name + " ready for launch!");
    }

    public String getName() {
        return name;
    }

    public static Integer getCount() {
        return count;
    }

    public String getDestination() {
        return destination;
    }
    
    public Integer getId() {
        return id;
    }

    public Integer getSnacks() {
        return snacks;
    }
    
    public void doAction(Object planet) {
        if (planet instanceof planet.Mars) {
            planet.Mars marsPlanet = (planet.Mars) planet;
            this.destination = marsPlanet.getLandingSite();
            System.out.println(this.name + ": Started a mission!");
        } else if (planet instanceof chocolate.Mars) {
            chocolate.Mars marsChocolate = (chocolate.Mars) planet;
            this.snacks += 1;
            System.out.println(this.name + ": Thanks for this mars number " + marsChocolate.getId());
        } else if (planet instanceof planet.moon.Phobos) {
            planet.moon.Phobos phobosMoon = (planet.moon.Phobos) planet;
            this.destination = phobosMoon.getLandingSite();
            System.out.println(this.name + ": Started a mission!");
        }

        if (this.getDestination() == null) {
            System.out.println(this.getName() + ": I may have done nothing but at least I have " + this.getSnacks() + " Mars to eat.");
        }
    }

    public void doAction() {
        System.out.println("Nothing to do.");
        if (this.getDestination() == null) {
            System.out.println(this.getName() + ": I may have done nothing but at least I have " + this.getSnacks() + " Mars to eat.");
        }
    }
}
