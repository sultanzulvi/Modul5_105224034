public class main {
    public static void main(String[] args){
        Elektronik hp = new Elektronik("123", "Lenovo");
        hp.setKategori("Gadget");

        System.out.println("Harga negatif : ");
        hp.setHargaSatuan(-22222222);

        System.out.println("Kurangi stok : ");
        hp.kurangiStok(9);

        System.out.println("\nData : ");
        hp.setHargaSatuan(100000000);
        hp.tambahStok(34);
        hp.kurangiStok(2);

        hp.tampilkanDataBarang();
    }
}
