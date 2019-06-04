import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    private String input;

    public UserInput() {
        this.input = "";
    }

    public String getInput(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            this.input = br.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return this.input;
    }
}
