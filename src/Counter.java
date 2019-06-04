import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Counter {

    public int getWordsCount(String line){
        String[] words = line.split("\\s+");
        return words.length;
    }

    public int getLettersCount(String line){
        Pattern pattern = Pattern.compile("[A-Za-zöäüß]");
        Matcher matcher = pattern.matcher(line);
        int lettersCount = 0;
        while (matcher.find()) {
            lettersCount++;
        }
        return lettersCount;
    }
}
