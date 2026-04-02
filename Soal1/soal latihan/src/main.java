public class main{
    public static void main(String[] args){
        karyawan data = new karyawan("105224034", "Sultan");

        data.setDepartemen("IT");

        System.out.print("input gaji : ");
        data.setGaji(-1000000);

        System.out.print("input gaji 2 : ");
        data.setGaji(10000000);

        data.DisplayDataKaryawan();
    }
}   