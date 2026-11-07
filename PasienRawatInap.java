public class PasienRawatInap extends Pasien
        implements BisaDiperiksa, BisaDibayar {

    private int lamaInap;
    private double biayaPerHari;

    // Konstruktor
    public PasienRawatInap(String nomorRekamMedis,
                           String nama,
                           int umur,
                           int lamaInap,
                           double biayaPerHari) {

        super(nomorRekamMedis, nama, umur);

        this.lamaInap = lamaInap;
        this.biayaPerHari = biayaPerHari;
    }

    // Getter dan Setter
    public int getLamaInap() {
        return lamaInap;
    }

    public void setLamaInap(int lamaInap) {
        this.lamaInap = lamaInap;
    }

    public double getBiayaPerHari() {
        return biayaPerHari;
    }

    public void setBiayaPerHari(double biayaPerHari) {
        this.biayaPerHari = biayaPerHari;
    }

    // Implementasi abstract method
    @Override
    public void prosesLayanan() {

        if (getStatus().equals("Terdaftar")) {
            setStatus("Sedang Dirawat");
            System.out.println("Pasien rawat inap mulai dirawat.");
        } else {
            System.out.println("Pasien belum dapat diproses.");
        }
    }

    // Implementasi interface pertama
    @Override
    public void periksaPasien() {
        System.out.println("Pasien " + getNama() +
                " menjalani pemeriksaan rawat inap.");
    }

    // Implementasi interface kedua
    @Override
    public double hitungBiaya() {
        return (lamaInap * biayaPerHari) + BIAYA_ADMIN;
    }

    // Method overriding
    @Override
    public void tampilkanInfo() {

        super.tampilkanInfo();

        System.out.println("Jenis Layanan : Rawat Inap");
        System.out.println("Lama Menginap : " + lamaInap + " hari");
        System.out.println("Total Biaya   : " + hitungBiaya());
    }
}

