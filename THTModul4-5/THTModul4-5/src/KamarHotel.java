public class KamarHotel {
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0;
        this.isTersedia = true;
    }

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double harga) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        setHargaPerMalam(harga);
        this.isTersedia = true;
    }

    public void setTipeKamar(String tipe) {
        if (tipe.equalsIgnoreCase("Reguler") || 
            tipe.equalsIgnoreCase("Premium") || 
            tipe.equalsIgnoreCase("Suite")) {
            this.tipeKamar = tipe;
        } else {
            System.out.println("[Tipe '" + tipe + "' tidak tersedia!! Dialihkan secara otomatis ke tipe Reguler.");
            this.tipeKamar = "Reguler";
        }
    }

    public void setHargaPerMalam(double harga) {
        if (harga < 50000) { 
            System.out.println("Jangan kurang dari nominal 50000. Dipaksa ke: 50000.");
            this.hargaPerMalam = 50000;
        } else {
            this.hargaPerMalam = harga;
        }
    }

    public void pesanKamar() {
        if (isTersedia) {
            this.isTersedia = false;
            System.out.println("Kamar " + nomorKamar + " telah dipesan.");
        } else {
            System.out.println("Kamar " + nomorKamar + " sudah ditempati");
        }
    }

    public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) {
            System.out.println("Kamar " + nomorKamar + " sudah ditempati");
        } else if (jumlahTamu > kapasitasMaksimal) {
            System.out.println("Kapasitas melebihi batas maksimal!!! Kapasitas maksimal hanya untuk " + kapasitasMaksimal + " orang.");
        } else {
            this.isTersedia = false;
            System.out.println("Pesanan Berhasil: " + jumlahTamu + " tamu di Kamar " + nomorKamar);
        }
    }

    public void batalPesan() {
        this.isTersedia = true;
        System.out.println( nomorKamar + " Kembali Tersedia.");
    }

    public double hitungTotalBayar(int jumlahMalam) {
        return hargaPerMalam * jumlahMalam;
    }

    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double totalNormal = hitungTotalBayar(jumlahMalam);
        if (kodeVoucher.equals("PROMO") && jumlahMalam >= 3) {
            return totalNormal * 0.8;
        } else {
            System.out.println("Syarat minimal 3 malam atau kode salah.");
            return totalNormal;
        }
    }

    public void tampilkanProfilKamar() {
        System.out.println("Nomor Kamar   : " + nomorKamar);
        System.out.println("Tipe Kamar    : " + tipeKamar);
        System.out.println("Kapasitas Max : " + kapasitasMaksimal);
        System.out.printf("Harga/Malam : ", hargaPerMalam);
        System.out.println("Status        : " + (isTersedia ? "Tersedia" : "Terisi"));
        System.out.println("---------------------------------");
    }
}
