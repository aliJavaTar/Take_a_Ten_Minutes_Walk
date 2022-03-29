import java.util.regex.Pattern;

public class TenMinWalk {

    public boolean isValid(char[] walk) {

        if (isValidCharacter(walk) && walk.length == 10) {
            return isThenMin(walk);
        } else return false;
    }

    public boolean isThenMin(char[] walks) {
        int alongNorth_South = 0;
        int widthWestEast = 0;
        for (char walkChar : walks) {
            switch (walkChar) {
                case 'n' -> alongNorth_South++;
                case 's' -> alongNorth_South--;
                case 'w' -> widthWestEast++;
                case 'e' -> widthWestEast--;
            }
        }
        return alongNorth_South == 0 && widthWestEast == 0;
    }

    public boolean isValidCharacter(char[] walk) {
        String text = new String(walk);
        System.out.println(text);
        String regex = "[wnse]+";
        return Pattern.matches(regex, text);
    }
}
