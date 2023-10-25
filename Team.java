import java.util.ArrayList;

public class Team {

    String teamName = null;
    ArrayList  <Astronaut> teamMembers = new ArrayList<Astronaut>() ;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void add(Astronaut astronaut) {
        this.teamMembers.add(astronaut);
    }

    public void remove(Astronaut astronaut) {
        this.teamMembers.remove(teamMembers.indexOf(astronaut));
    }

    public Integer countMembers() {
        return this.teamMembers.size();
    }

    public void showMembers() {
        Integer arrayLen = teamMembers.size();
        System.out.print(teamName + ": ");

        if (arrayLen != 0) {
            for (Integer i = 0; i < arrayLen; i++) {
                Astronaut astronaut = this.teamMembers.get(i);
                if (astronaut.getDestination() != null) {
                    System.out.print(astronaut.getName() + " on mission");
                } else {
                    System.out.print(astronaut.getName() + " on standby");
                }

                if (arrayLen - i != 1) {
                    System.out.print(", ");
                } else {
                    System.out.println(".");
                }
            }
        } else {
            System.out.print("");
        }
    }

    public void doActions(Object planet) {
        for (Astronaut astronaut : teamMembers) {
            astronaut.doAction(planet);
        }
    }

    public void doActions() {
        System.out.println(this.teamName + ": Nothing to do.");
    }
}
