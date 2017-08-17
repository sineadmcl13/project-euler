import level3.*;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by sineadmclaughlin on 01/04/2016.
 */
public class LevelThreeTests {


    @Test
    public void problem51() {
        String result = Problem51.problem51();
        assertEquals("121313", result);
    }


    @Test
    public void problem52() {
        int result = Problem52.problem52();
        assertEquals(142857, result);
    }


    @Test
    public void problem53() {
        int result = Problem53.problem53();
        assertEquals(4075, result);
    }


    @Test
    public void problem54() {
        int result = Problem54.problem54();
        assertEquals(376, result);
    }


    @Test
    public void problem55() {
        int result = Problem55.problem55();
        assertEquals(249, result);
    }

}


