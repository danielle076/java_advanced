package Z_EuroConsoleApp.Part2;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private String countryCode;
    private ArrayList<Coach> coaches = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();

    public Team(String teamName, String countryCode) {
        this.teamName = teamName;
        this.countryCode = countryCode;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void addCoach(Coach newCoach) {
        coaches.add(newCoach);
    }

    public void addPlayer(Player newPlayer) {
        players.add(newPlayer);
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", coaches=" + coaches +
                ", players=" + players +
                '}';
    }
}

