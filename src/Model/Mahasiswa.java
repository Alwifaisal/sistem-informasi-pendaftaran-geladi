package Model;

public class Mahasiswa extends orang{
    private static int countE = 1;
    
    private final String idMahasiswa;
    private String NIM;

    public Mahasiswa(String NIM, String Nama, String Alamat, String Email, String Telepon, String tglLahir, String Jurusan, String Username, String Password) {
        super(Nama, Alamat, Email, Telepon, tglLahir, Jurusan, Username, Password);
        this.idMahasiswa = "p-" + (countE++);
        this.NIM = NIM;
    }
    

    
    @Override
    public String toString(){
        return "idMahasiswa :" +idMahasiswa +"\n"+
                "NIM        :" + NIM  + "\n"+  
                "Alamat     :" + getAlamat() +"\n"+
                "Email      :" + getEmail() +"\n"+
                "Telepon    :" + getTelepon() +"\n"+
                "Jurusan    :" + getJurusan() +"\n"+
                "Username   :" + getUsername()+"\n"+
                "Password   :" + getPassword();
                }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

     public String toStringAll() {
        return idMahasiswa + " , " + NIM + " , " + getAlamat() + " , " + getTelepon() + " , " + getJurusan()+getUsername()+getPassword();
    }

    Object getidMahasiswa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 

}


    
    
  