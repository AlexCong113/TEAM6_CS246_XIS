/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;

import java.util.Arrays;
public class Sort {

    private int[] numbers;

    public Sort(int a, int b, int c) {
        numbers = new int[]{a, b, c};
    }

    public void ascSort() {
        Arrays.sort(numbers); 
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
