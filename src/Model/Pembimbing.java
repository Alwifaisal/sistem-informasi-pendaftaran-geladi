package Model;

public class Pembimbing extends orang{
    private static int countP=1;
    
    private final String idPembimbing;
    private String pembimbing;


    public Pembimbing(String Nama, String Alamat, String Email, String Telepon, String tglLahir, String NIP, String Jurusan) {
        super(Nama, Alamat, Email, Telepon, tglLahir, NIP, Jurusan);
        idPembimbing = "P-" + (countP++);
        this.pembimbing = pembimbing;
    }
    public String getidPembimbing(){
        return idPembimbing;
    }
     public String getPembimbing() {
        return pembimbing;
    }

    public void setPembimbing(String pembimbing) {
        this.pembimbing = pembimbing;
    }
    
    @Override
    public String toString(){
        return "idPembimbing :"+ idPembimbing + "\n" +
                "Nama        :"+ getNama() + "\n" +
                "Alamat      :"+ getAlamat()+"\n"+
                "Email       :"+ getEmail()+"\n"+
                "Telepon     :"+ getTelepon()+"\n"+
                "NIP         :"+ getNIM() +"\n"+
                "pembimbing  :"+ pembimbing;
                
    }
    
     public String toStringAll() {
        return idPembimbing + " , " + getNama() + " , " + getAlamat() + " , " + getEmail() + " , " + getTelepon() + " , " + getNIM() + " , " + pembimbing;
    }
   
}