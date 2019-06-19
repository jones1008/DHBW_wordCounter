// Programmierer: Jonas Fluhrer (Main: nur vollständigkeitshalber)
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Für relativen Pfad die Text-Datei ablegen in: "+System.getProperty("user.dir"));
        System.out.print("Absoluten oder relativen Pfad eingeben: ");

        // read filename from user input
        UserInput input = new UserInput();
        String filePath = input.getInput();

        // initialize variables
        Counter c = new Counter();
        FileHandler fh = new FileHandler();
        String[] lines;

        try{
            lines = fh.readFile(filePath);

            System.out.print("Anzahl Zeilen: " + c.getLinesCount(lines) + "\n");
            System.out.print("Anzahl Wörter: " + c.getWordsCount(lines) + "\n");
            System.out.print("Anzahl Buchstaben: " + c.getLettersCount(lines) + "\n");
        } catch(IOException e){
            System.out.println("ERROR: Fehler beim Öffnen der Datei " + filePath + "!");
        }
    }
}
