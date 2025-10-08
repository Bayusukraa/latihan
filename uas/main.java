package myproject;

import java.text.DecimalFormat;

/**
 *
 * @author Bayu Sukra
 */
public class main {
    public static void main(String[] args) {
        karyawantetap tetap = new karyawantetap("bayu", "K001", 5000000, 1000000);
        karyawankontrak kontrak = new karyawankontrak("sukra", "K002", 4000000);
        freelance freelance = new freelance("dinata", "K003", 120, 50000);

        DecimalFormat rupiah = new DecimalFormat("Rp #,###.00");

        System.out.println("SISTEM GAJIH KARYAWAN AOKWKWKK");
        System.out.println("Gaji " + tetap.getNama() + ": " + rupiah.format(tetap.hitungGaji()));
        System.out.println("Gaji " + kontrak.getNama() + ": " + rupiah.format(kontrak.hitungGaji()));
        System.out.println("Gaji " + freelance.getNama() + ": " + rupiah.format(freelance.hitungGaji()));
    }
}
