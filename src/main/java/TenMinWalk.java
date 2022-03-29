import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TenMinWalk {

    public boolean isValid(char[] walk) {
        validCharacter(walk, walk.length == 10));
        if (walk.length == 10) {
            int alongNorth_South = 0;
            for (char walkChar : walk) {
                if (walkChar == 'n')
                    alongNorth_South++;
                else if (walkChar == 's')
                    alongNorth_South--;
            }
            return alongNorth_South == 0;
        } else return false;

    }

    Pattern pattern = Pattern.compile("w3schools");
    Matcher matcher = pattern.matcher("Visit W3Schools!");

    public boolean validCharacter(char[] walk, int length)

    {
        for (char walkCheek : walk) {

        }
        Pattern pattern = Pattern.compile("[wnse]");
        Matcher matcher = pattern.matcher("Visit W3Schools!");
    }
}
