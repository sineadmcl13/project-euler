import level2.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sineadmclaughlin on 28/03/2016.
 */
public class LevelTwoTests {

    @Test
    public void problem26() {
        Problem26 test = new Problem26();
        int result = test.problem26();

        assertEquals(983, result);
    }

    @Test
    public void problem27() {
        Problem27 test = new Problem27();
        int result = test.problem27();

        assertEquals(-59231, result);
    }


    @Test
    public void problem28() {
        Problem28 test = new Problem28();
        int result = test.problem28();

        assertEquals(669171001, result);
    }

    @Test
    public void problem29() {
        Problem29 test = new Problem29();
        int result = test.problem29();

        assertEquals(9183, result);
    }

    @Test
    public void problem30() {
        Problem30 test = new Problem30();
        int result = test.problem30();

        assertEquals(443839, result);
    }




}


