// Programmierer: Kaloyan Zahariev (Unit Tests)
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

public class CounterTest {

    private Counter c = new Counter();
    private FileHandler fh = new FileHandler();
    private String[] lines = null;
    private String sampleFile = "sample1.txt";

    @Test
    public void getWordsCountTest(){
        int expected = 21;
        int wordCount = 0;

        try{
            lines = fh.readFile(sampleFile);
            wordCount = c.getWordsCount(lines);
        } catch(IOException e){
            System.out.println("ERROR: Fehler beim Öffnen der Datei " + sampleFile + "!");
        }

        assertEquals(expected, wordCount);
    }

    @Test
    public void getLettersCount(){
        int expected = 119;
        int lettersCount = 0;

        try{
            lines = fh.readFile(sampleFile);
            lettersCount = c.getLettersCount(lines);
        } catch(IOException e){
            System.out.println("ERROR: Fehler beim Öffnen der Datei " + sampleFile + "!");
        }

        assertEquals(expected, lettersCount);
    }

    @Test
    public void getLinesCount(){
        int expected = 6;
        int linesCount = 0;

        try{
            lines = fh.readFile(sampleFile);
            linesCount = c.getLinesCount(lines);
        } catch(IOException e){
            System.out.println("ERROR: Fehler beim Öffnen der Datei " + sampleFile + "!");
        }

        assertEquals(expected, linesCount);
    }
}
