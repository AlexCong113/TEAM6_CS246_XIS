/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vu;

/**
 *
 * @author ACER
 */
public class MaxNumber1 {

    private int number1;
    private int number2;
    private int number3;

    public MaxNumber1(int number1, int number2, int number3) {
        super();
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int max3() {
        if (number1 > number2) {
            if (number1 > number3) {
                return number1;
            } else {
                return number3;
            }
        } else if (number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }
}
