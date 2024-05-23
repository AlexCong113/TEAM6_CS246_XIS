/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhommm;

/**
 *
 * @author ACER
 */
public class AppCustomer {

    private String ID;
    private String name;
    private String address;
    private String numberphone;

    public AppCustomer(String ID, String name, String address, String numberphone) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.numberphone = numberphone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }

}
