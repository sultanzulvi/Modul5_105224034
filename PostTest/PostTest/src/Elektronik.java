public class Elektronik {
    private String idBarang;
    private String namaBarang;
    private int stok = 0;
    private int hargaSatuan = 0;
    private String kategori;

    public Elektronik(String idBarang, String namaBarang){
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
    }

public String getID(){
    return this.idBarang;
}

public String getbarang(){
    return this.namaBarang;
}

public int getStok(){
    return this.stok;
}

public int getHarga(){
    return this.hargaSatuan;
}

public void setID(String idBarang){
    this.idBarang = idBarang;
}

public void setBarang(String namaBarang){
    this.namaBarang = namaBarang;
}

public void setStok(int stok){
    if(stok < 0){
        System.out.println("Jangan negatif!!");
    }else{
        this.stok = stok;
    }
}

public void setHargaSatuan(int hargaSatuan) {
    if (hargaSatuan < 0) {
        System.out.println("Gabisa");
    } else {
        this.hargaSatuan = hargaSatuan;
    }
 }

public void tambahStok(int total){
    if(total < 0){
        System.out.println("apa yang anda tambahkan jika kurang dari nol");
    }else{
        this.stok += total;
        System.out.println("stok sekarang : " + total);
    }
}

public void kurangiStok(int total){
    if(total < 0){
        System.out.println("apa yang anda kurangi jika kurang dari nol");
    }
    else if(total > this.stok){
        System.out.println("Jumlah melebihi stok");
    }else{
        this.stok -= total;
        System.out.println("stok sekarang : " + total);
    }
}

public void setKategori(String kategori){
    this.kategori = kategori;
}

public void tampilkanDataBarang(){
    System.out.println("\nID Barang : " + idBarang);
    System.out.println("Nama Barang : " + namaBarang);
    System.out.println("Kategori : " + kategori);
    System.out.println("Stok Gudang : " + stok);
    System.out.println("Harga Satuan : " + hargaSatuan);
    }
}
