/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;

import java.util.Scanner;
public class Arrayy {

    public static int[] inputArray(int n, Scanner sc) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao so nguyen:");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array, String message) {
        System.out.println(message);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Đe bai: Viet chuong trinh cho phep nhap vao n, sau đo nhap vao n phan tu so nguyen.\nSap xap cac phan tu trong mang theo thu tu nguoc lai.");

        System.out.println("Nhap n:");
        int n = sc.nextInt();

        int[] soNguyen = inputArray(n, sc);

        printArray(soNguyen, "Mang truoc khi đảo nguoc:");

        reverseArray(soNguyen);

        printArray(soNguyen, "Mang sau khi đao nguoc:");
    }
}
