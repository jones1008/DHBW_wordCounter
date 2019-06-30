// Programmierer: Jonas Fluhrer
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

class FileHandler {

    private String[] lines;

    FileHandler(){
        this.lines = null;
    }


    String[] readFile (String filePath) throws IOException {
        String line;
        List<String> fileContent = new ArrayList<>();

        try(FileInputStream     fr = new FileInputStream(filePath);
            InputStreamReader   ir = new InputStreamReader(fr, StandardCharsets.UTF_8);
            BufferedReader      br = new BufferedReader(ir)){
            while ((line = br.readLine()) != null) {
                fileContent.add(line);
            }
        }
        this.lines = fileContent.toArray(new String[0]);

        return this.lines;
    }
}
