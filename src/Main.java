import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.print("Absoluter Pfad einer Text-Datei eingeben: ");
        UserInput input = new UserInput();
        String filePath = input.getInput();

        try (BufferedReader br = new BufferedReader((new FileReader(filePath)))) {
            Counter c = new Counter();

            int linesCount = 0;
            int wordCount = 0;
            int lettersCount = 0;

            String line;
            while ((line = br.readLine()) != null) {
                linesCount++;
                wordCount = wordCount + c.getWordsCount(line);
                lettersCount = lettersCount + c.getLettersCount(line);
            }

            br.close();

            System.out.print("Anzahl Zeilen: " + linesCount + "\n");
            System.out.print("Anzahl Wörter: " + wordCount + "\n");
            System.out.print("Anzahl Buchstaben: " + lettersCount + "\n");

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Datei " + filePath + " nicht gefunden!");
        } catch (IOException e) {
            System.out.println("ERROR: Fehler beim Öffnen der Datei " + filePath + "!");
        }
    }
}
