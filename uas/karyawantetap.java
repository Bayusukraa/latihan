package myproject;

/**
 *
 * @author Bayu Sukra
 */

public class karyawantetap extends karyawan {
    private double gajiPokok;
    private double tunjangan;

    public karyawantetap(String nama, String idKaryawan, double gajiPokok, double tunjangan) {
        super(nama, idKaryawan);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        double total = gajiPokok + tunjangan;
        setGaji(total);
        return total;
    }
}
