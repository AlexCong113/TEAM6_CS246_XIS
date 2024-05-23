/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;
class User {

    private int id;
    private String name;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCaptcha() {
        return captcha;
    }

    public User(int id, String name, String username, String password, String captcha) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.captcha = captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
    private String captcha;
}

public class Student {

    public void CreateNewUser(User newUser) {
        System.out.println(newUser.getId() + " " + newUser.getName());
    }

}