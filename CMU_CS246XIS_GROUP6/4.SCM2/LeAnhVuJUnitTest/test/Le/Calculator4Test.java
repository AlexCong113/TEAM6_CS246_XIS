/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Calculator4;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class Calculator4Test {

    Calculator4 c = new Calculator4();

    public Calculator4Test() {
    }

    public void testAddition() {
        Calculator4 c = new Calculator4();
        c.setNumber1(5);
        c.setNumber2(3);
        int result = c.getNumber1() + c.getNumber2();
        assertEquals(8, result);

    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator4 c = new Calculator4();
        c.setNumber1(10);
        c.setNumber2(0);
        c.div();
    }

    @Test
    public void testDivisionReturnsDouble() {
        Calculator4 c = new Calculator4();
        c.setNumber1(5);
        c.setNumber2(2);
        double result = (double) c.div();
        assertEquals(2, result, 0.001);
    }

}
