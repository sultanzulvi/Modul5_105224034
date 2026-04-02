public class karyawan {
    private String idKaryawan;
    private String name;
    private double gajipokok;
    private String departemen;

    public karyawan(String idKaryawan, String name){
        this.idKaryawan = idKaryawan;
        this.name = name;
    }

    public String getID(){
        return this.idKaryawan;
    }

    public String getName(){
        return this.name;
    }

    public double getGaji(){
        return this.gajipokok;
    }

    public String getDepartemen(){
        return this.departemen;
    }

    public void setID(String idKaryawan){
        this.idKaryawan = idKaryawan;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGaji(double gaji){
        if(gaji < 0){
            System.out.println("kurang dari minimum");
        }else{
            this.gajipokok = gaji;
            System.out.println(gaji);
        }
    }

    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }

    public void DisplayDataKaryawan(){
        System.out.println("\nNama : " + name);
        System.out.println("ID : " + idKaryawan);
        System.out.println("Gaji : " + gajipokok);
        System.out.println("Departemen : " + departemen);
    }
}
