/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;
public class OctanNumber {

    public OctanNumber() {

    }

    public void FourNumber() {
        for (int decimal = 0; decimal < 4096; decimal++) {
            String octal = Integer.toOctalString(decimal);

            while (octal.length() < 4) {
                octal = "0" + octal;
            }
            System.out.println(octal + "\t" + decimal);
        }
    }

    public static void main(String[] args) {
        OctanNumber oc = new OctanNumber();
        System.out.println("Octal\tDecimal");
        oc.FourNumber();
    }
}
