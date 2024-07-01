import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketsFindPractice {
    public static void main(String[] args) {

        System.out.print("Input parenthesis : ");

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferedReader.readLine();

            BracketsPairValidator bracketsPairValidator = new BracketsPairValidator(input);
            if (bracketsPairValidator.validate()) {
                System.out.println("You entered pairs of parenthesis");
            } else {
                System.out.println("You entered invalid pairs of parenthesis");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
