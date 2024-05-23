/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Advance6;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ACER
 */
public class Advance6Test {

    public Advance6Test() {
    }
    private Advance6 advance;

    @Before
    public void setUp() {
        advance = new Advance6();
    }

    @Test
    public void testTinhTuoiCorrectDate() {
        assertEquals(24, advance.tinhTuoi(12, 3, 2000));
        assertEquals(24, advance.tinhTuoi(12, 2, 2000));
    }

    @Test
    public void testTinhTuoiFutureDate() {
        assertEquals(0, advance.tinhTuoi(12, 1, 2025));
    }

    @Test
    public void testTinhTuoiInvalidDate() {
        assertEquals(25, advance.tinhTuoi(31, 1, 1999)); 
        assertEquals(25, advance.tinhTuoi(12, 1, 1999)); 
        assertEquals(25, advance.tinhTuoi(12, 1, 1999)); 
    }

}
