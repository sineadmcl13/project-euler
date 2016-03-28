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

        assertEquals(BigInteger.valueOf(25164150), result);
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

    @Test
    public void problem11() {
        Problem11 test = new Problem11();
        BigInteger result = test.problem11();

        assertEquals(BigInteger.valueOf(70600674), result);
    }

    @Test
    public void problem12() {
        Problem12 test = new Problem12();
        long result = test.problem12();

        assertEquals(76576500, result);
    }

    @Test
    public void problem13() {
        Problem13 test = new Problem13();
        String result = test.problem13();

        assertEquals("5537376230", result);
    }

    @Test
    public void problem14() {
        Problem14 test = new Problem14();
        int result = test.problem14();

        assertEquals(837799, result);
    }

    @Test
    public void problem15() {
        Problem15 test = new Problem15();
        BigInteger result = test.problem15();

        assertEquals(BigInteger.valueOf(137846528820L), result);
    }

    @Test
    public void problem16() {
        Problem16 test = new Problem16();
        int result = test.problem16();

        assertEquals(1366, result);
    }

    @Test
    public void problem17() {
        Problem17 test = new Problem17();
        int result = test.problem17();

        assertEquals(21124, result);
    }

    @Test
    public void problem18() {
        Problem18 test = new Problem18();
        int result = test.problem18();

        assertEquals(1074, result);
    }

    @Test
    public void problem19() {
        Problem19 test = new Problem19();
        int result = test.problem19();

        assertEquals(171, result);
    }

    @Test
    public void problem20() {
        Problem20 test = new Problem20();
        int result = test.problem20();

        assertEquals(648, result);
    }

    @Test
    public void problem21() {
        Problem21 test = new Problem21();
        int result = test.problem21();

        assertEquals(31626, result);
    }

    @Test
    public void problem22() {
        Problem22 test = new Problem22();
        BigInteger result = test.problem22();

        assertEquals(BigInteger.valueOf(871198282), result);
    }

    @Test
    public void problem23() {
        Problem23 test = new Problem23();
        int result = test.problem23();

        assertEquals(4179871, result);
    }

    @Test
    public void problem24() {
        Problem24 test = new Problem24();
        String result = test.problem24();

        assertEquals("2783915460", result);
    }

    @Test
    public void problem25() {
        Problem25 test = new Problem25();
        int result = test.problem25();

        assertEquals(4782, result);
    }



}


