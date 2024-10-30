/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.wahyu;

import java.time.YearMonth;
/**
 *
 * @author ASUS
 */
public class HitungHari {
    public int hitung(int tahun, String bulan) {
        int bulanIndex = switch (bulan) {
            case "Januari" -> 1;
            case "Februari" -> 2;
            case "Maret" -> 3;
            case "April" -> 4;
            case "Mei" -> 5;
            case "Juni" -> 6;
            case "Juli" -> 7;
            case "Agustus" -> 8;
            case "September" -> 9;
            case "Oktober" -> 10;
            case "November" -> 11;
            case "Desember" -> 12;
            default -> throw new IllegalArgumentException("Bulan tidak valid");
        };
        YearMonth yearMonth = YearMonth.of(tahun, bulanIndex);
        return yearMonth.lengthOfMonth();
    }
}
  
