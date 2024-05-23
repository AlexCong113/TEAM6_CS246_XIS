/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Advance1;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ACER
 */
public class Advance1Test {
    
    public Advance1Test() {
    }

    private Advance1 advance;

    @Before
    public void setUp() {
        advance = new Advance1();
    }

    @Test
    public void testUSCLN() {
        assertEquals(1, advance.USCLN(1, 1));
        assertEquals(1, advance.USCLN(7, 5));
        assertEquals(2, advance.USCLN(4, 2));
        assertEquals(6, advance.USCLN(54, 24));
        assertEquals(12, advance.USCLN(48, 180));
    }

    @Test
    public void testBSCNN() {
        assertEquals(1, advance.BSCNN(1, 1));
        assertEquals(35, advance.BSCNN(7, 5));
        assertEquals(6, advance.BSCNN(3, 2));
        assertEquals(216, advance.BSCNN(54, 24));
        assertEquals(720, advance.BSCNN(48, 180));
    }
    
}
