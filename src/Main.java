//REGEX Möglichkeiten:
// - Wörter erkennen: z.B. darf nur aus Buchstaben besetehen

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    private int amount_rows = 0;
    private int count_words = 0;
    private int count_letters = 0;


    private void function() {

        /* HIER OUTPUT VON IO*/ String[] output_buffered_reader = {"Ic(h", "Test123 45", "!er=", "äöüß"};      //zählt 45 als Wort? -> CONTAINS min 1 BUCHSTABE

        amount_rows = output_buffered_reader.length;

        String[] words;

        for(int i=0; i<output_buffered_reader.length; i++)
        {
            words = output_buffered_reader[i].split("\\s+"); //Wörter durch Leerzeichen trennen

            count_words += words.length; //Anzahl an getrennten Wörter wird zur aktuellen Anzahl an Wörtern dazugezählt

            count_letters += getAmountLettersInWord(output_buffered_reader[i]); //zurückgegebene Anzahl an Buchstaben wird zur aktuellen Anzahl dazugezählt
        }

        System.out.println( // Ausgabe von Werten
                "Ausgabe: " + "\n" +
                        "Anzahl Reihen: " + amount_rows + "\n" +
                        "Anzahl Wörter: " + count_words + "\n" +
                        "Anzahl Buchstaben: " + count_letters + "\n"
        );
    }

    private int getAmountLettersInWord(String word){

        int count_letters = 0;

        String regex = "[A-Za-zöäüß]"; // Teste Wort auf Buchstaben

        Pattern pattern = Pattern.compile(regex); //Lege Muster fest
        Matcher matcher = pattern.matcher(word); //ein Wort auf Muster überprüfen

        while (matcher.find()) //Zählt alle gefundenen Klein- & Großbuchstaben
            count_letters++;

        return count_letters; //gibt Anzahl an gefundenen Buchstaben zurück
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.function();

    }
}
