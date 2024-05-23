/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Advance4;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ACER
 */
public class Advance4Test {
    
    public Advance4Test() {
    }
 private Advance4 advance;

    @Before
    public void setUp() {
        advance = new Advance4();
    }

    @Test
    public void testIsPrimeNumber2() {
        assertTrue(advance.isPrimeNumber(2));
    }

    @Test
    public void testIsPrimeNumber3() {
        assertTrue(advance.isPrimeNumber(3));
    }

    @Test
    public void testIsPrimeNumber5() {
        assertTrue(advance.isPrimeNumber(5));
    }

    @Test
    public void testIsPrimeNumber7() {
        assertTrue(advance.isPrimeNumber(7));
    }

    @Test
    public void testIsPrimeNumber11() {
        assertTrue(advance.isPrimeNumber(11));
    }

    @Test
    public void testIsPrimeNumber13() {
        assertTrue(advance.isPrimeNumber(13));
    }

    @Test
    public void testIsPrimeNumber17() {
        assertTrue(advance.isPrimeNumber(17));
    }

    @Test
    public void testIsPrimeNumber19() {
        assertTrue(advance.isPrimeNumber(19));
    }

    @Test
    public void testIsPrimeNumber4() {
        assertFalse(advance.isPrimeNumber(4));
    }

    @Test
    public void testIsPrimeNumber6() {
        assertFalse(advance.isPrimeNumber(6));
    }

    @Test
    public void testIsPrimeNumber9() {
        assertFalse(advance.isPrimeNumber(9));
    }

    @Test
    public void testIsPrimeNumber15() {
        assertFalse(advance.isPrimeNumber(15));
    }

    @Test
    public void testIsPrimeNumber20() {
        assertFalse(advance.isPrimeNumber(20));
    }

    @Test
    public void testIsPrimeNumber25() {
        assertFalse(advance.isPrimeNumber(25));
    }
}
