/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vu;

import java.util.Calendar;

/**
 *
 * @author ACER
 */
public class Advance7 {

    public int tinhThu(int ngay, int thang, int nam) {
        Calendar cal = Calendar.getInstance();
        cal.set(nam, thang - 1, ngay);
        return cal.get(Calendar.DAY_OF_WEEK);
    }
}
