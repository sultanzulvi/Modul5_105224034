    public class main {
    public static void main(String[] args) {
        System.out.println("PENGUJIAN KAMAR 1");
        KamarHotel kamar1 = new KamarHotel("101", "Presidential", 5);
        kamar1.setHargaPerMalam(-10000); 
        kamar1.tampilkanProfilKamar();

        System.out.println("PENGUJIAN KAMAR 2");
        KamarHotel kamar2 = new KamarHotel("202", "Suite", 2, 800000);kamar2.pesanKamar(4);

        kamar2.pesanKamar(4); 
  
        kamar2.pesanKamar(2);
        
        kamar2.pesanKamar();


        System.out.println("\nSIMULASI TAGIHAN VOUCHER");

        System.out.println("Tagihan Kamar 101:");
        double tagihan1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total: Rp" + tagihan1);

        System.out.println("\nTagihan Kamar 202: ");
        double tagihan2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total: Rp" + tagihan2);

        System.out.println("STRUK INFORMASI AKHIR");
        kamar1.tampilkanProfilKamar();
        kamar2.tampilkanProfilKamar();
    }
}
