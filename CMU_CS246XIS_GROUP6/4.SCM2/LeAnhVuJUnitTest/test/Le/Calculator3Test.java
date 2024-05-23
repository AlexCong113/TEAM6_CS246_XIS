/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Calculator3;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class Calculator3Test {

    Calculator3 c = new Calculator3(1, 2);

    public Calculator3Test() {
    }

    @Test
    public void testSomeMethod() {
        assertEquals(2, c.mul());
        c = new Calculator3(Integer.MAX_VALUE, 2);
        assertEquals(Integer.MAX_VALUE * 2, c.mul());
        c = new Calculator3(Integer.MIN_VALUE, -2);
        assertEquals(Integer.MIN_VALUE * 2, c.mul());
    }

}
