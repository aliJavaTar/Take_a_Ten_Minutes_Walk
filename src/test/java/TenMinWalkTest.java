import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TenMinWalkTest {
    TenMinWalk tenMinWalk;

    @BeforeEach
    public void TenMinWalk() {
        tenMinWalk = new TenMinWalk();
    }

    @Test
    public void emptyCharacter() {
        char[] talk = new char[0];
        boolean valid = tenMinWalk.isValid(talk);
        assertFalse(valid);
    }

    //  n', 's', 'e', or 'w' only
    @Test
    public void oneCharacter() {
        char[] talk = {'a'};
        boolean valid = tenMinWalk.isValid(talk);
        assertFalse(valid);
    }

    @Test
    public void lessTenChar() {
        char[] walk = {'a', 's', 'n', 't'};
        boolean valid = tenMinWalk.isValid(walk);
        assertFalse(valid);
    }

    @Test
    public void moreTenChar() {
        char[] walk = {'a', 's', 'n', 't', 'a', 's', 'n', 't', 'a', 's', 'n'};
        boolean valid = tenMinWalk.isValid(walk);
        assertFalse(valid);
    }

    @Test
    public void northAndSouth() {
        char[] walk1 = {'n', 'a', 'n', 'n', 'n', 's', 's', 's', 's', 's'};
        boolean valid1 = tenMinWalk.isValid(walk1);
        assertFalse(valid1);


        char[] walk2 = {'n', 'n', 'n', 'n', 'n', 's', 's', 's', 's', 's'};
        boolean valid2 = tenMinWalk.isValid(walk2);
        assertTrue(valid2);

        char[] walk3 = {'n', 'a', 'n', 'n', 'n', 's', 's', 'b', 's', 's'};
        boolean valid3 = tenMinWalk.isValid(walk3);
        assertFalse(valid3);
    }
}