package chocolate;

public class Mars {
    private int Id = 0;
    private static int count = 0;

    public Mars(){
        Id = count;
        count += 1;
    } 

    public int getId() {
        return Id;
    }


}