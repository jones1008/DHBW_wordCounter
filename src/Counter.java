import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Counter {

    public int getWordsCount(String line){
        if (line.trim().isEmpty()) {
            return 0;
        } else {
            String[] words = line.split("\\s", -1);
            return words.length;
        }
    }

    public int getLettersCount(String line){
        // "\p{L}" matches the Unicode Category: "any kind of letter from any language"
        Pattern p = Pattern.compile("\\p{L}", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = p.matcher(line);
        int lettersCount = 0;
        while (matcher.find()) {
            lettersCount++;
        }
        return lettersCount;
    }
}
