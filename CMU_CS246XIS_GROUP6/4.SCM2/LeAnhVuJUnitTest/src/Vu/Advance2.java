/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vu;

/**
 *
 * @author ACER
 */
public class Advance2 {

    public int sum(long number) {
        int sum = 0;
        long index;
        while (number != 0) {
            index = number % 10;
            sum += index;
            number /= 10;
        }
        return sum;
    }

}
