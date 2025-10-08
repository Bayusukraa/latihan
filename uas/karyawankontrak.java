package myproject;

/**
 *
 * @author Bayu Sukra
 */

public class karyawankontrak extends karyawan {
    private double gajiBulanan;

    public karyawankontrak(String nama, String idKaryawan, double gajiBulanan) {
        super(nama, idKaryawan);
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public double hitungGaji() {
        setGaji(gajiBulanan);
        return gajiBulanan;
    }
}
