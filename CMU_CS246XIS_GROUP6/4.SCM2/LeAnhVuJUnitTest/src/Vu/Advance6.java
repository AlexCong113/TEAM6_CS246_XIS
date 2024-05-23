/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vu;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author ACER
 */
public class Advance6 {

    public int tinhTuoi(int ngay, int thang, int nam) {
        LocalDate ngaySinh = LocalDate.of(nam, thang, ngay);
        LocalDate ngayHienTai = LocalDate.now();
        return Period.between(ngaySinh,
                ngayHienTai).getYears();
    }

}
