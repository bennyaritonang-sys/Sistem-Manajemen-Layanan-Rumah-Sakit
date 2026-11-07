
public class Main {

    public static void main(String[] args) {

        // Membuat objek pasien rawat jalan
        PasienRawatJalan pasien1 = new PasienRawatJalan(
                "RM001",
                "Andi",
                20,
                "Dr. Budi",
                100000
        );

        // Membuat objek pasien rawat inap
        PasienRawatInap pasien2 = new PasienRawatInap(
                "RM002",
                "Siti",
                22,
                3,
                250000
        );

        // Menampilkan informasi pasien rawat jalan
        System.out.println("===== PASIEN RAWAT JALAN =====");
        pasien1.tampilkanInfo();

        pasien1.prosesLayanan();
        pasien1.periksaPasien();

        System.out.println("Status setelah layanan: "
                + pasien1.getStatus());

        // Menampilkan informasi pasien rawat inap
        System.out.println("\n===== PASIEN RAWAT INAP =====");
        pasien2.tampilkanInfo();

        pasien2.prosesLayanan();
        pasien2.periksaPasien();

        System.out.println("Status setelah layanan: "
                + pasien2.getStatus());

        // Polimorfisme menggunakan interface
        System.out.println("\n===== POLIMORFISME INTERFACE =====");

        BisaDiperiksa pemeriksaan1 =
                new PasienRawatJalan(
                        "RM003", "Budi", 21,
                        "Dr. Ani", 120000
                );

        BisaDiperiksa pemeriksaan2 =
                new PasienRawatInap(
                        "RM004", "Rina", 23,
                        2, 200000
                );

        pemeriksaan1.periksaPasien();
        pemeriksaan2.periksaPasien();

        // Menghitung biaya menggunakan interface
        System.out.println("\n===== PERHITUNGAN BIAYA =====");

        BisaDibayar pembayaran1 =
                new PasienRawatJalan(
                        "RM005", "Doni", 22,
                        "Dr. Budi", 100000
                );

        BisaDibayar pembayaran2 =
                new PasienRawatInap(
                        "RM006", "Lina", 24,
                        3, 250000
                );

        System.out.println("Biaya Rawat Jalan: Rp"
                + pembayaran1.hitungBiaya());

        System.out.println("Biaya Rawat Inap: Rp"
                + pembayaran2.hitungBiaya());
    }
}
