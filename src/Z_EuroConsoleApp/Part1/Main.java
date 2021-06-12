package Z_EuroConsoleApp.Part1;

public class Main {
    public static void main(String args[]) {
        AppController app = new AppController();
        app.generateCoach();
        app.generatePerson();
        app.generatePlayers();
        app.printList();
    }
}
