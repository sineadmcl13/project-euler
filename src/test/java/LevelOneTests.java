import level1.*;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by sineadmclaughlin on 25/03/2016.
 */
public class LevelOneTests {

    @Test
    public void problem1() {
        Problem1 test = new Problem1();
        int result = test.problem1();

        assertEquals(233168, result);
    }

    @Test
    public void problem2() {
        Problem2 test = new Problem2();
        int result = test.problem2();

        assertEquals(4613732, result);
    }

    @Test
    public void problem3() {
        Problem3 test = new Problem3();
        long result = test.problem3();

        assertEquals(6857, result);
    }

    @Test
    public void problem4() {
        Problem4 test = new Problem4();
        int result = test.problem4();

        assertEquals(906609, result);
    }

    @Test
    public void problem5() {
        Problem5 test = new Problem5();
        int result = test.problem5();

        assertEquals(232792560, result);
    }

    @Test
    public void problem6() {
        Problem6 test = new Problem6();
        BigInteger result = test.problem6();

        assertEquals(new BigInteger("25164150"), result);
    }

    @Test
    public void problem7() {
        Problem7 test = new Problem7();
        int result = test.problem7();

        assertEquals(104743, result);
    }

    @Test
    public void problem8() {
        Problem8 test = new Problem8();
        long result = test.problem8();

        assertEquals(23514624000L, result);
    }

    @Test
    public void problem9() {
        Problem9 test = new Problem9();
        long result = test.problem9();

        assertEquals(31875000, result);
    }

    @Test
    public void problem10() {
        Problem10 test = new Problem10();
        long result = test.problem10();

        assertEquals(142913828922L, result);
    }



}


