/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;
public class Hexa {
    private static final char[] HEX_DIGITS = new char[] { 
        '0', '1', '2', '3', '4', '5', '6', '7', 
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' 
    };

    public void printHexAndDecimal() {
        int decimal = 0;
        StringBuilder hexValue = new StringBuilder(4);

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                for (int k = 0; k < 16; k++) {
                    for (int l = 0; l < 16; l++) {
                        hexValue.setLength(0);
                        hexValue.append(HEX_DIGITS[i])
                                .append(HEX_DIGITS[j])
                                .append(HEX_DIGITS[k])
                                .append(HEX_DIGITS[l]);
                        System.out.println(hexValue + "\t" + decimal);
                        decimal++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Hexa hexa = new Hexa();
        System.out.println("Hexa\tDecimal");
        hexa.printHexAndDecimal();
    }
}
