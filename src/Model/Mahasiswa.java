package Model;

public class Mahasiswa extends orang{
    private static int countE = 1;
    
    private final String idMahasiswa;
    private String Nama;
    private String NIM;
    
     public Mahasiswa(String Nama, String NIM, String Email, String Telepon,String tglLahir ,String Alamat,String Jurusan) {
        super(Nama, NIM ,Email,Telepon,tglLahir,Alamat,Jurusan);
        idMahasiswa = "p-" + (countE++);
        this.Nama = Nama;
        this.NIM = NIM;
    }

    public String Mahasiswa(String NIM, String Nama, String Jurusan, String Status) {
        return null;
        
    }
      
    public String getidMahasiswa(){
        return idMahasiswa;
    }  

    

    @Override
    public String getNama() {
        return Nama;
    }

    @Override
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    @Override
    public String getNIM() {
        return NIM;
    }

    @Override
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    
    @Override
    public String toString(){
        return "idMahasiswa :" +idMahasiswa +"\n"+
                "nama       :" + Nama + "\n"+
                "NIM        :" + NIM  + "\n"+  
                "Alamat     :" + getAlamat() +"\n"+
                "Email      :" + getEmail() +"\n"+
                "Telepon    :" + getTelepon() +"\n"+
                "tglLahir   :" + gettglLahir() +"\n"+
                "Jurusan    :" + getJurusan();
                
    
                
                }

    
     public String toStringAll() {
        return idMahasiswa + " , " + Nama + " , " + NIM + " , " + getAlamat() + " , " + getTelepon() + " , " + gettglLahir() + " , " + getJurusan();
    }
    
 

}


    
    
  