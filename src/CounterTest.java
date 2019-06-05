import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import static org.junit.Assert.*;

public class CounterTest extends Counter{

    @Test
    public void getWordsCountTest(){
        String sampleFile = "sample1.txt";
        int expected = 21;

        int wordCount = 0;
        try (BufferedReader br = new BufferedReader((new FileReader(sampleFile)))) {
            Counter c = new Counter();

            String line;
            while ((line = br.readLine()) != null) {
                wordCount = wordCount + c.getWordsCount(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Datei " + sampleFile + " nicht gefunden!");
        } catch (IOException e) {
            System.out.println("ERROR: Fehler beim Öffnen der Datei " + sampleFile + "!");
        }

        assertEquals(expected, wordCount);
    }

    @Test
    public void getLettersCount(){
        String sampleFile = "sample2.txt";
        int expected = 21;

        int lettersCount = 0;
        try (BufferedReader br = new BufferedReader((new FileReader(sampleFile)))) {
            Counter c = new Counter();

            String line;
            while ((line = br.readLine()) != null) {
                lettersCount = lettersCount + c.getLettersCount(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Datei " + sampleFile + " nicht gefunden!");
        } catch (IOException e) {
            System.out.println("ERROR: Fehler beim Öffnen der Datei " + sampleFile + "!");
        }

        assertEquals(expected, lettersCount);
    }
}
