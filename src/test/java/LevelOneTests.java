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
        int result = Problem1.problem1();
        assertEquals(233168, result);
    }


    @Test
    public void problem2() {
        int result = Problem2.problem2();
        assertEquals(4613732, result);
    }


    @Test
    public void problem3() {
        long result = Problem3.problem3();
        assertEquals(6857, result);
    }


    @Test
    public void problem4() {
        int result = Problem4.problem4();
        assertEquals(906609, result);
    }


    @Test
    public void problem5() {
        int result = Problem5.problem5();
        assertEquals(232792560, result);
    }


    @Test
    public void problem6() {
        BigInteger result = Problem6.problem6();
        assertEquals(BigInteger.valueOf(25164150), result);
    }


    @Test
    public void problem7() {
        int result = Problem7.problem7();
        assertEquals(104743, result);
    }


    @Test
    public void problem8() {
        long result = Problem8.problem8();
        assertEquals(23514624000L, result);
    }


    @Test
    public void problem9() {
        long result = Problem9.problem9();
        assertEquals(31875000, result);
    }


    @Test
    public void problem10() {
        long result = Problem10.problem10();
        assertEquals(142913828922L, result);
    }


    @Test
    public void problem11() {
        BigInteger result = Problem11.problem11();
        assertEquals(BigInteger.valueOf(70600674), result);
    }


    @Test
    public void problem12() {
        long result = Problem12.problem12();
        assertEquals(76576500, result);
    }


    @Test
    public void problem13() {
        String result = Problem13.problem13();
        assertEquals("5537376230", result);
    }


    @Test
    public void problem14() {
        int result = Problem14.problem14();
        assertEquals(837799, result);
    }


    @Test
    public void problem15() {
        BigInteger result = Problem15.problem15();
        assertEquals(BigInteger.valueOf(137846528820L), result);
    }


    @Test
    public void problem16() {
        int result = Problem16.problem16();
        assertEquals(1366, result);
    }


    @Test
    public void problem17() {
        int result = Problem17.problem17();
        assertEquals(21124, result);
    }


    @Test
    public void problem18() {
        int result = Problem18.problem18();
        assertEquals(1074, result);
    }


    @Test
    public void problem19() {
        int result = Problem19.problem19();
        assertEquals(171, result);
    }


    @Test
    public void problem20() {
        int result = Problem20.problem20();
        assertEquals(648, result);
    }


    @Test
    public void problem21() {
        int result = Problem21.problem21();
        assertEquals(31626, result);
    }


    @Test
    public void problem22() {
        BigInteger result = Problem22.problem22();
        assertEquals(BigInteger.valueOf(871198282), result);
    }


    @Test
    public void problem23() {
        int result = Problem23.problem23();
        assertEquals(4179871, result);
    }


    @Test
    public void problem24() {
        String result = Problem24.problem24();
        assertEquals("2783915460", result);
    }


    @Test
    public void problem25() {
        int result = Problem25.problem25();
        assertEquals(4782, result);
    }

}