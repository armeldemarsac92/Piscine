package planet.moon;

public class Phobos {
    private planet.Mars marsPlanet;
    private String landingSite;

    public Phobos(Object mars, String landingSite) {
        if (mars instanceof planet.Mars) {
            planet.Mars marsPlanet = (planet.Mars) mars;
            this.marsPlanet = marsPlanet;
            this.landingSite = landingSite;
            System.out.println("Phobos placed in orbit.");
        } else {
            System.out.println("No planet given.");
        }
    }

    public planet.Mars getMars() {
        return this.marsPlanet;
    }

    public String getLandingSite() {
        return landingSite;
    }

}
