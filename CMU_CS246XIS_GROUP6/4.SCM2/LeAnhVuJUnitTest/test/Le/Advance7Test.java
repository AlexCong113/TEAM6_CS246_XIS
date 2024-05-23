/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Advance7;
import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ACER
 */
public class Advance7Test {
    
    public Advance7Test() {
    }
 private Advance7 advance;

    @Before
    public void setUp() {
        advance = new Advance7();
    }

    @Test
    public void testTinhThuSunday() {
        assertEquals(Calendar.SUNDAY, advance.tinhThu(5, 4, 2020));
    }

    @Test
    public void testTinhThuMonday() {
        assertEquals(Calendar.MONDAY, advance.tinhThu(6, 4, 2020));
    }

    @Test
    public void testTinhThuInvalidDate() {
        assertEquals(2, advance.tinhThu(31, 1, 2022)); 
        assertEquals(4, advance.tinhThu(12, 1, 2022)); 
        assertEquals(4, advance.tinhThu(12, 1, 2022)); 
    }
    
}
