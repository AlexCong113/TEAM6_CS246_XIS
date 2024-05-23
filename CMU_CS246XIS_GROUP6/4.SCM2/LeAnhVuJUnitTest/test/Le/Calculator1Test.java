/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Calculator1;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class Calculator1Test {

    Calculator1 c = new Calculator1();

    public Calculator1Test() {
    }

    @Test
    public void testSomeMethod() {
        assertEquals(5, c.add(2, 3));
        assertEquals(Integer.MAX_VALUE, c.add(Integer.MAX_VALUE - 1, 1));
        assertEquals(Integer.MIN_VALUE, c.add(Integer.MIN_VALUE + 1, -1));
    }

}
