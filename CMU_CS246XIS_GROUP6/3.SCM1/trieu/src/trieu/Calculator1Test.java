package trieu;

import Nguyen.Calculator1;

public class Calculator1Test {

    
    public void testAddResultValue() {
        Calculator1 calculator = new Calculator1();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-1, calculator.add(-1, 0));
    }

   
    public void testAddLargerThanMaxInt() {
        Calculator1 calculator = new Calculator1();
        assertThrows(ArithmeticException.class, () -> {
            calculator.add(Integer.MAX_VALUE, 1);
        });
    }

    
    public void testAddSmallerThanMinInt() {
        Calculator1 calculator = new Calculator1();
        assertThrows(ArithmeticException.class, () -> {
            calculator.add(Integer.MIN_VALUE, -1);
        });
    }
}
