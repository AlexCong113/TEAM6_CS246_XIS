/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;
public class binary {

    public binary() {

    }

    public void printFourBitBinaryNumbers() {

        for (int decimal = 0; decimal < 16; decimal++) {

            String binary = String.format("%4s", Integer.toBinaryString(decimal)).replace(' ', '0');

            System.out.println(binary + "\t" + decimal);
        }
    }

    public static void main(String[] args) {
        binary b = new binary();
        System.out.println("Binary\tDecimal");
        b.printFourBitBinaryNumbers();
    }
}
