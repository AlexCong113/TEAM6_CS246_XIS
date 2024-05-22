/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;

import java.util.Scanner;
public class Equation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap he so bac 2, a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhap he so bac 1, b = ");
        float b = scanner.nextFloat();
        System.out.print("Nhập hang so tu do, c = ");
        float c = scanner.nextFloat();

        solveEquation(a, b, c);

        scanner.close();
    }

    public static void solveEquation(float a, float b, float c) {
        if (a == 0) {
            solveLinear(b, c);
        } else {
            solveQuadratic(a, b, c);
        }
    }

    public static void solveLinear(float b, float c) {
        if (b == 0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }

    public static void solveQuadratic(float a, float b, float c) {
        float delta = b * b - 4 * a * c;
        if (delta > 0) {
            float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phuong trinh có 2 nghiem la: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            float x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
}
