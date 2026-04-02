public class rekening{
    private String nomorRekening;
    private int saldo = 0;
        
    public int saldoRekening(){
        return saldo;
    }

    public void setSaldo(int saldo){
        if(saldo < -1){
            System.out.println("Saldo jangan minus!!");
        }
        else(
            System.out.println("Saldo anda : " + (this.saldo += saldo));
        )
    }
}

