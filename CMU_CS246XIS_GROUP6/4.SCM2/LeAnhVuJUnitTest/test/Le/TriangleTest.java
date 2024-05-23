/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Triangle;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ACER
 */
public class TriangleTest {

    public TriangleTest() {
    }

    private Triangle triangle;

    @Before
    public void setUp() {
        triangle = new Triangle();
    }

    @Test
    public void testFirstNumberIsMax() {
        triangle.setNumber1(10);
        triangle.setNumber2(5);
        triangle.setNumber3(7);
        int result = triangle.maxLength();
        assertEquals(10, result);
    }

    @Test
    public void testSecondNumberIsMax() {
        triangle.setNumber1(3);
        triangle.setNumber2(8);
        triangle.setNumber3(7);
        int result = triangle.maxLength();
        assertEquals(8, result);
    }

    @Test
    public void testThirdNumberIsMax() {
        triangle.setNumber1(3);
        triangle.setNumber2(5);
        triangle.setNumber3(9);
        int result = triangle.maxLength();
        assertEquals(9, result);
    }

    @Test
    public void testInvalidTriangle() {
        triangle.setNumber1(1);
        triangle.setNumber2(2);
        triangle.setNumber3(10);
        int result = triangle.maxLength();
        assertEquals(10, result);
    }

    @Test
    public void testAllNumbersEqual() {
        triangle.setNumber1(7);
        triangle.setNumber2(7);
        triangle.setNumber3(7);
        int result = triangle.maxLength();
        assertEquals(7, result);
    }

    @Test
    public void testNumber1AndNumber2AreMax() {
        triangle.setNumber1(10);
        triangle.setNumber2(10);
        triangle.setNumber3(5);
        int result = triangle.maxLength();
        assertEquals(10, result);
    }

    @Test
    public void testNumber2AndNumber3AreMax() {
        triangle.setNumber1(5);
        triangle.setNumber2(10);
        triangle.setNumber3(10);
        int result = triangle.maxLength();
        assertEquals(10, result);
    }

    @Test
    public void testNumber1AndNumber3AreMax() {
        triangle.setNumber1(10);
        triangle.setNumber2(5);
        triangle.setNumber3(10);
        int result = triangle.maxLength();
        assertEquals(10, result);
    }

}
