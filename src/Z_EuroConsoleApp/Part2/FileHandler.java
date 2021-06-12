package Z_EuroConsoleApp.Part2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileHandler {
    private static String fileName = "teams.txt";

    public static void writeData(String data) {
        try {
            File dataFile = new File(fileName);
            FileWriter fw = new FileWriter(dataFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.newLine();
            bw.close();
        }
        catch(Exception ex) {
            System.out.println("Exception opgetreden tijdens het wegschrijven: " + ex.getMessage());
        }
    }
}
