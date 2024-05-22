/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;
public class DogCat {

    String name;
    int height;
    int weight;

    void bark() {
    }

    void meow() {
    }
}

class Dog extends DogCat {

    void bark() {
        System.out.println("The dog is barking...");
    }
}

class Cat extends DogCat {

    void meow() {
        System.out.println("The cat is meowing...");
    }
}
