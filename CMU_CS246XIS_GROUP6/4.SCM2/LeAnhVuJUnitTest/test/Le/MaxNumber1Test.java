/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.MaxNumber1;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class MaxNumber1Test {

    public MaxNumber1Test() {
    }

    @Test
    public void testFirstNumberIsMax() {
        MaxNumber1 maxNumber = new MaxNumber1(10, 5, 3);
        int result = maxNumber.max3();
        assertEquals(10, result);
    }

    @Test
    public void testSecondNumberIsMax() {
        MaxNumber1 maxNumber = new MaxNumber1(5, 10, 3);
        int result = maxNumber.max3();
        assertEquals(10, result);
    }

    @Test
    public void testThirdNumberIsMax() {
        MaxNumber1 maxNumber = new MaxNumber1(5, 3, 10);
        int result = maxNumber.max3();
        assertEquals(10, result);
    }

}
