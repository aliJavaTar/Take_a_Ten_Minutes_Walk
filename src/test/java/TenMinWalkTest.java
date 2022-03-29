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

        char[] walk4 = {'b', 'a', 'n', 'n', 'j', 's', 's', 'b', 's', 'f'};
        boolean valid4 = tenMinWalk.isValid(walk4);
        assertFalse(valid4);
    }

    @Test
    public void WestAndEast() {
        char[] walk1 = {'e', 'a', 'e', 'e', 'e', 'w', 'w', 'w', 'w', 'w'};
        boolean valid1 = tenMinWalk.isValid(walk1);
        assertFalse(valid1);


        char[] walk2 = {'e', 'e', 'e', 'e', 'e', 'w', 'w', 'w', 'w', 'w'};
        boolean valid2 = tenMinWalk.isValid(walk2);
        assertTrue(valid2);

        char[] walk3 = {'e', 'a', 'e', 'e', 'e', 'e', 'e', 'b', 'e', 'e'};
        boolean valid3 = tenMinWalk.isValid(walk3);
        assertFalse(valid3);

        char[] walk4 = {'b', 'a', 'e', 'e', 'j', 'w', 'w', 'b', 'w', 'f'};
        boolean valid4 = tenMinWalk.isValid(walk4);
        assertFalse(valid4);
    }

    @Test
    public void northAndSouthWestAndEast() {
        char[] walk1 = {'w', 'w', 'e', 'e', 'n', 'n', 's', 's', 'w', 'w'};
        boolean valid1 = tenMinWalk.isValid(walk1);
        assertFalse(valid1);


        char[] walk2 = {'w', 'w', 'w', 'e', 'e', 'e', 'n', 's', 'n', 's'};
        boolean valid2 = tenMinWalk.isValid(walk2);
        assertTrue(valid2);

        char[] walk3 = {'e', 'e', 'e', 'e', 'e', 'e', 'e', 'w', 's', 's'};
        boolean valid3 = tenMinWalk.isValid(walk3);
        assertFalse(valid3);
    }
}