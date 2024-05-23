/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Sort1;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */
public class Sort1Test {
    
    public Sort1Test() {
    }

    @Test
    public void testNumber1GreaterThanNumber2() {
        Sort1.number1 = 10;
        Sort1.number2 = 5;
        Sort1.sortAsc();
        assertEquals(5, Sort1.number1);
        assertEquals(10, Sort1.number2);
    }

    @Test
    public void testNumber1LessThanNumber2() {
        Sort1.number1 = 3;
        Sort1.number2 = 7;
        Sort1.sortAsc();
        assertEquals(3, Sort1.number1);
        assertEquals(7, Sort1.number2);
    }
    
}
