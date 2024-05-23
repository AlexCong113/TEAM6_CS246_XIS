/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Advance3;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ACER
 */
public class Advance3Test {

    public Advance3Test() {
    }
    private Advance3 advance;

    @Before
    public void setUp() {
        advance = new Advance3();
    }

    @Test
    public void testFibonacciZero() {
        assertEquals(0, advance.fibonacci(0));
    }

    @Test
    public void testFibonacciOne() {
        assertEquals(1, advance.fibonacci(1));
    }

    @Test
    public void testFibonacciTwo() {
        assertEquals(1, advance.fibonacci(2));
    }

    @Test
    public void testFibonacciThree() {
        assertEquals(2, advance.fibonacci(3));
    }

    @Test
    public void testFibonacciFour() {
        assertEquals(3, advance.fibonacci(4));
    }

    @Test
    public void testFibonacciFive() {
        assertEquals(5, advance.fibonacci(5));
    }

    @Test
    public void testFibonacciNegative() {
        assertEquals(-1, advance.fibonacci(-3));
    }

}
