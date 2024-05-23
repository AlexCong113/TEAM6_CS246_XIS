/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Le;

import Vu.SolveEquation;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ACER
 */

public class SolveEquationTest {

    @Test
    public void testMultiRoots() {
        SolveEquation equation = new SolveEquation();
        equation.setNumber1(0);
        equation.setNumber2(0);
        String result = equation.linearEquation();
        assertEquals("Multi roots", result);
    }

    @Test
    public void testNoRoot() {
        SolveEquation equation = new SolveEquation();
        equation.setNumber1(0);
        equation.setNumber2(1);
        String result = equation.linearEquation();
        assertEquals("No root", result);
    }

    @Test
    public void testOneRoot() {
        SolveEquation equation = new SolveEquation();
        equation.setNumber1(1);
        equation.setNumber2(0);
        String result = equation.linearEquation();
        assertEquals("One root", result);
    }
}