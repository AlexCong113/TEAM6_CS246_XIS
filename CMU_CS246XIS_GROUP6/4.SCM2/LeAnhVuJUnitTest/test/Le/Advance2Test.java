/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Advance2;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ACER
 */
public class Advance2Test {

    public Advance2Test() {
    }

    private Advance2 advance;

    @Before
    public void setUp() {
        advance = new Advance2();
    }

    @Test
    public void testSumSingleDigitNumber() {
        assertEquals(5, advance.sum(5));
    }

    @Test
    public void testSumMultipleDigitNumber() {
        assertEquals(23, advance.sum(5765));
        assertEquals(10, advance.sum(1234));
        assertEquals(36, advance.sum(9999));
    }

    @Test
    public void testSumZero() {
        assertEquals(0, advance.sum(0));
    }

    @Test
    public void testSumNegativeNumber() {
        assertEquals(6, advance.sum(123));
    }

}
