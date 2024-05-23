/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vu;

/**
 *
 * @author ACER
 */
public class Advance5 {

    public boolean kiemTraDoiXung(int number) {
        StringBuilder xau = new StringBuilder();
        String str = number + "";
        xau.append(str);
        String check = xau.reverse().toString();
        if (str.equals(check)) {
            return true;
        }
        return false;
    }

}
