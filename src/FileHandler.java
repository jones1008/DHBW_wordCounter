// Programmierer: Jonas Fluhrer
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class FileHandler {

    private String[] lines;

    FileHandler(){
        this.lines = null;
    }


    String[] readFile (String filePath) throws IOException {
        BufferedReader br = null;
        String line;
        List<String> fileContent = new ArrayList<>();
        boolean fileOpened = false;

        try {
            br = new BufferedReader((new FileReader(filePath)));
            while ((line = br.readLine()) != null) {
                fileContent.add(line);
            }
            fileOpened = true;
        } finally {
            if(fileOpened) br.close();
        }

        this.lines = fileContent.toArray(new String[0]);

        return this.lines;
    }
}
