public class PasienRawatJalan extends Pasien
        implements BisaDiperiksa, BisaDibayar {

    private String namaDokter;
    private double biayaPemeriksaan;

    // Konstruktor
    public PasienRawatJalan(String nomorRekamMedis,
                            String nama,
                            int umur,
                            String namaDokter,
                            double biayaPemeriksaan) {

        super(nomorRekamMedis, nama, umur);

        this.namaDokter = namaDokter;
        this.biayaPemeriksaan = biayaPemeriksaan;
    }

    // Getter dan Setter
    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public double getBiayaPemeriksaan() {
        return biayaPemeriksaan;
    }

    public void setBiayaPemeriksaan(double biayaPemeriksaan) {
        this.biayaPemeriksaan = biayaPemeriksaan;
    }

    // Implementasi abstract method
    @Override
    public void prosesLayanan() {

        if (getStatus().equals("Terdaftar")) {
            setStatus("Sedang Diperiksa");
            System.out.println("Pasien rawat jalan sedang diperiksa.");
        } else {
            System.out.println("Pasien belum dapat diproses.");
        }
    }

    // Implementasi interface pertama
    @Override
    public void periksaPasien() {
        System.out.println("Dokter " + namaDokter +
                " memeriksa pasien " + getNama());
    }

    // Implementasi interface kedua
    @Override
    public double hitungBiaya() {
        return biayaPemeriksaan + BIAYA_ADMIN;
    }

    // Method overriding
    @Override
    public void tampilkanInfo() {

        super.tampilkanInfo();

        System.out.println("Jenis Layanan    : Rawat Jalan");
        System.out.println("Nama Dokter      : " + namaDokter);
        System.out.println("Biaya Pemeriksaan: " + hitungBiaya());
    }
}

