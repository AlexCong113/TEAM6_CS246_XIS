/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;
public class maxnumber {
    public int max2(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public int max3(int a, int b, int c) {
        if (a >= b) {
            if (a >= c) {
                return a;
            } else {
                return c;
            }
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        maxnumber m = new maxnumber();
        int resultMax2 = m.max2(10, 20);
        System.out.println("Max of 10 and 20 is: " + resultMax2);
        int resultMax3 = m.max3(10, 20, 30);
        System.out.println("Max of 10, 20, and 30 is: " + resultMax3);
    }
}
