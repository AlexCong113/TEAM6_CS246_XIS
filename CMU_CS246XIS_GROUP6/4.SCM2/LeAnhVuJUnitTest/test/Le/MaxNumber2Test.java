/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.MaxNumber2;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class MaxNumber2Test {

    public MaxNumber2Test() {
    }

    @Test
    public void testFirstNumberIsMax() {
        MaxNumber2 maxNumber = new MaxNumber2();
        maxNumber.number1 = 10;
        maxNumber.number2 = 5;
        int result = maxNumber.max2();
        assertEquals(10, result);
    }

    @Test
    public void testSecondNumberIsMax() {
        MaxNumber2 maxNumber = new MaxNumber2();
        maxNumber.number1 = 5;
        maxNumber.number2 = 10;
        int result = maxNumber.max2();
        assertEquals(10, result);
    }

}
