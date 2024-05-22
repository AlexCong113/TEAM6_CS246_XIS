/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;
public class Person {

    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Instructor extends Person {

    private int yearOfExp;

    public Instructor(String id, String name, int yearOfExp) {
        super(id, name);
        this.yearOfExp = yearOfExp;
    }

    public int getYearOfExp() {
        return yearOfExp;
    }

    public int getSalary() {

        return yearOfExp * 10000;
    }
}

class Student extends Person {

    private String className;

    public Student(String id, String name, String className) {
        super(id, name);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public int getScholarship() {

        return 5000;
    }
}
