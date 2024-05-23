/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baicanhan;

/**
 *
 * @author ACER
 */
public class MathUtil {
    public static int timSoNguyen(double x) {

        return (int) Math.round(x);

    }
    public static void main(String[] args) {
       double myDouble= 0.7;
       int myInt= timSoNguyen(myDouble);
        System.out.println("so nguyen la:"+myInt);
    }
}

