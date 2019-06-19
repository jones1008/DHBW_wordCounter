// Programmierer: Jan Dietzel (Algorithmus implementieren)
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Counter {

    int getWordsCount(String[] lines){
        int wordsCount = 0;
        for (String line : lines) {
            line = line.trim();
            if (!line.isEmpty()) {
                String[] words = line.split("\\s", -1);
                wordsCount += words.length;
            }
        }
        return wordsCount;
    }

    int getLettersCount(String[] lines){
        int lettersCount = 0;
        for (String line : lines) {
            // \p{L} matches the Unicode Category: "any kind of letter from any language"
            Pattern p = Pattern.compile("\\p{L}", Pattern.UNICODE_CHARACTER_CLASS);
            Matcher matcher = p.matcher(line);
            while (matcher.find()) {
                lettersCount++;
            }
        }
        return lettersCount;
    }

    int getLinesCount(String[] lines){
        int linesCount = 0;
        for (String line : lines) {
            linesCount++;
        }
        return linesCount;
    }
}
