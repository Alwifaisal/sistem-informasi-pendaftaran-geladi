package Model;

public class Pembimbing extends orang{
    private static int countP=1;
    
    private final String idPembimbing;
    private String pembimbing;
    private String NIP;
    private String Username;
    private String Password;


    public Pembimbing(String Nama, String Alamat, String Email, String Telepon, String tglLahir, String NIP,String Username,String Password) {
        super(Nama, Alamat, Email, Telepon, tglLahir,Username,Password,NIP);
        idPembimbing = "P-" + (countP++);
        this.pembimbing = pembimbing;
        this.NIP      = NIP;
        this.Username = Username;
        this.Password = Password;
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

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
    @Override
    public String toString(){
        return "Password    :"+
                "idPembimbing :"+ idPembimbing + "\n" +
                "Nama        :"+ getNama() + "\n" +
                "Alamat      :"+ getAlamat()+"\n"+
                "Email       :"+ getEmail()+"\n"+
                "Telepon     :"+ getTelepon()+"\n"+
                "pembimbing  :"+ pembimbing + "\n"+
                "NIP         :"+ NIP + "\n"+
                "Username    :"+ Username+ "\n"+ 
                "Password    :"+ Password;
        
                
    }
    
     public String toStringAll() {
        return idPembimbing + " , " + getNama() + " , " + getAlamat() + " , " + getEmail() + " , " + getTelepon() + " , " + pembimbing +","+NIP +","+ Username +"," + Password;
    }

  
   
}