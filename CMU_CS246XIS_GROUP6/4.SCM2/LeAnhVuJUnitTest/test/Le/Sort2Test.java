/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Sort2;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ACER
 */
public class Sort2Test {

    public Sort2Test() {
    }

    private Sort2 sort;

    @Before
    public void setUp() {
        sort = new Sort2();
    }

    @Test
    public void testNumber1GreaterThanNumber2() {
        sort.number1 = 10;
        sort.number2 = 5;
        sort.sortDesc();
        assertEquals(10, sort.number1);
        assertEquals(5, sort.number2);
    }

    @Test
    public void testNumber1LessThanNumber2() {
        sort.number1 = 3;
        sort.number2 = 7;
        sort.sortDesc();
        assertEquals(7, sort.number1);
        assertEquals(3, sort.number2);
    }

}
