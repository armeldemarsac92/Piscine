package planet;

public class Mars {
    private int Id = 0;
    private static int count = 0;
    private String landingSite = null;

    public Mars(String landingSite){
        this.Id = count;
        count += 1;
        this.landingSite = landingSite;
    } 

    public int getId() {
        return Id;
    }

    public String getLandingSite() {
        return landingSite;
    }

}