package myproject;

/**
 *
 * @author Bayu Sukra
 */


public class freelance extends karyawan {
    private int jamKerja;
    private double tarifPerJam;

    public freelance(String nama, String idKaryawan, int jamKerja, double tarifPerJam) {
        super(nama, idKaryawan);
        this.jamKerja = jamKerja;
        this.tarifPerJam = tarifPerJam;
    }

    @Override
    public double hitungGaji() {
        double total = jamKerja * tarifPerJam;
        setGaji(total);
        return total;
    }
}
