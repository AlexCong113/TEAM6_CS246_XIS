/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vu;

/**
 *
 * @author ACER
 */
public class Sort2 {

    public int number1;
    public int number2;

    public void sortDesc() {
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
    }
}
