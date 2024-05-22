/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Nhap so phan tu mang: ");
        int arraySize = scanner.nextInt();

       
        int[] array = new int[arraySize];
        inputArrayElements(scanner, array);

        
        sortArray(array);

       
        System.out.println("\nDay so xap xep tang dan: ");
        displayArray(array);
    }

    private static void inputArrayElements(Scanner scanner, int[] array) {
        System.out.print("\nNhap cac phan tu mang: \n");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("a[%d] = ", i);
            array[i] = scanner.nextInt();
        }
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
