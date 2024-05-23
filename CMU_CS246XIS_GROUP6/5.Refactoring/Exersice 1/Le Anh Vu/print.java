/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;
public class print {
    
    public static void printBanner(String message) {
        System.out.println("*****************");
        System.out.println("******" + message + "******");
        System.out.println("*****************");
    }

    public static void main(String[] args) {
  
        printBanner("START");

        System.out.println("THE MAIN FUNCTION");

        printBanner("END");
    }

}
