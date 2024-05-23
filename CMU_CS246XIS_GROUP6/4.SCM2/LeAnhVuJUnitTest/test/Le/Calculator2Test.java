/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Calculator2;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class Calculator2Test {

    Calculator2 c = new Calculator2();

    public Calculator2Test() {
    }

    @Test
    public void testSomeMethod() {
        c.number1 = 5;
        c.number2 = 3;
        c.sub();
        assertEquals(2, c.result);
        c.number1 = Integer.MAX_VALUE;
        c.number2 = Integer.MIN_VALUE;
        c.sub();
        assertEquals(-1,c.result); 
        c.number1=Integer.MIN_VALUE;
        c.number2=Integer.MAX_VALUE;
        c.sub();
        assertEquals(1,c.result);
    }
    
}
