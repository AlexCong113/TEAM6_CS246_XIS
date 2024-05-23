/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.Advance5;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ACER
 */
public class Advance5Test {

    public Advance5Test() {
    }

    private Advance5 advance;

    @Before
    public void setUp() {
        advance = new Advance5();
    }

    @Test
    public void testKiemTraDoiXungSingleDigit() {
        assertTrue(advance.kiemTraDoiXung(0));
        assertTrue(advance.kiemTraDoiXung(1));
        assertTrue(advance.kiemTraDoiXung(9));
    }

    @Test
    public void testKiemTraDoiXungEvenDigits() {
        assertTrue(advance.kiemTraDoiXung(11));
        assertTrue(advance.kiemTraDoiXung(22));
        assertTrue(advance.kiemTraDoiXung(12121));
        assertTrue(advance.kiemTraDoiXung(123321));
    }

    @Test
    public void testKiemTraDoiXungOddDigits() {
        assertFalse(advance.kiemTraDoiXung(10));
        assertFalse(advance.kiemTraDoiXung(123));
        assertFalse(advance.kiemTraDoiXung(1234));
    }
}
