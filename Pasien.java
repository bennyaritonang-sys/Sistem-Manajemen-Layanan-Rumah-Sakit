
public abstract class Pasien {

    // Konstanta global
    public static final double BIAYA_ADMIN = 15000.0;

    // Atribut
    private final String nomorRekamMedis;
    private String nama;
    private int umur;
    private String status;

    // Konstruktor pertama
    public Pasien(String nomorRekamMedis, String nama, int umur) {
        this(nomorRekamMedis, nama, umur, "Terdaftar");
    }

    // Konstruktor kedua (overloading)
    public Pasien(String nomorRekamMedis, String nama,
                  int umur, String status) {

        this.nomorRekamMedis = nomorRekamMedis;
        this.nama = nama;
        this.umur = umur;
        this.status = status;
    }

    // Getter
    public String getNomorRekamMedis() {
        return nomorRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getStatus() {
        return status;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method prosedur
    public void tampilkanInfo() {
        System.out.println("Nomor Rekam Medis : " + nomorRekamMedis);
        System.out.println("Nama              : " + nama);
        System.out.println("Umur              : " + umur);
        System.out.println("Status            : " + status);
    }

    // Abstract method
    public abstract void prosesLayanan();
}
