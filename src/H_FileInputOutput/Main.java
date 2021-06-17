package H_FileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // file input (reading from a file)
        Scanner inFile = null;

        try {
            inFile = new Scanner(new File("I.txt"));
            while (inFile.hasNextLine()){
                String line = inFile.nextLine();
                System.out.println(line);
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found");
        }

        // file output (writing from a file)
        try {
            PrintStream outFile = new PrintStream(new File("O.txt"));
            outFile.println("NAC Breda");
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                outFile.println(random.nextInt(6) + 1);
            }
            outFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: unable to open file for writing");
        }
    }
}
