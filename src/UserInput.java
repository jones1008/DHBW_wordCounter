// Programmierer: Jonas Fluhrer
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInput {

    private String input;

    UserInput() {
        this.input = "";
    }

    String getInput(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            this.input = br.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return this.input;
    }
}
