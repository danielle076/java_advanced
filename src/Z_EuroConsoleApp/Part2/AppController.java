package Z_EuroConsoleApp.Part2;

import java.util.ArrayList;

public class AppController {
    private ArrayList<Person> persons = new ArrayList<Person>();
    private ArrayList<Team> teams = new ArrayList<>();

    public AppController() {
        this.generateHollandTeam();
        this.printTeams();
    }

    public void generateHollandTeam(){
        Team holland = new Team("Nederland", "NL");

        Player player1 = new Player("Memphis", "Depay", 27, 9);
        Player player2 = new Player("Donny", "van de Beek", 24, 20);

        Coach coach1 = new Coach("Frank", "de Boer", 51);
        coach1.setRole("Hoofd coach");

        holland.addPlayer(player1);
        holland.addPlayer(player2);

        holland.addCoach(coach1);

        teams.add(holland);
        FileHandler.writeData(holland.toString());
    }

    public void printTeams() {
        for (int i = 0; i < teams.size(); i++) {
            Team tmpTeam = teams.get(i);
            System.out.println(tmpTeam);
        }
    }

    public void generatePerson() {
        Person person1 = new Person("Danielle", "van den Akker", 37);
        Person person2 = new Person("Freckle", "van den Akker", 2);
        Person person3 = new Person("Frummel", "van den Akker", 1);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
    }

    public void generatePlayers() {
        Player player1 = new Player("Memphis", "Depay", 27, 9);
        Player player2 = new Player("Donny", "van de Beek", 24, 20);

        persons.add(player1);
        persons.add(player2);
    }

    public void generateCoach() {
        Coach coach1 = new Coach("Frank", "de Boer", 51);
        coach1.setRole("Hoofd coach");

        persons.add(coach1);
    }

    public void printList() {
        int listSize = persons.size();

        for (int i = 0; i < listSize; i++) {
            Person tmpPerson = persons.get(i);
            System.out.println(tmpPerson);
        }
    }
}
