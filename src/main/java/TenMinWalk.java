import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TenMinWalk {

    public boolean isValid(char[] walk) {
        if (validCharacter(walk, walk.length))
        {
            int alongNorth_South = 0;
            int widthWestEast = 0;
            for (char walkChar : walk)
            {
                if (walkChar == 'n')
                    alongNorth_South++;
                else if (walkChar == 's')
                    alongNorth_South--;
                else if (walkChar == 'w')
                    widthWestEast++;
                else if (walkChar == 'e')
                    widthWestEast--;
            }
            return alongNorth_South == 0 && widthWestEast == 0;
        } else return false;

    }

    public boolean validCharacter(char[] walk, int length) {
        String text = new String(walk);
        System.out.println(text);
        String regex = "[wnse]+";
        return (Pattern.matches(regex, text) && length == 10);
    }
}
