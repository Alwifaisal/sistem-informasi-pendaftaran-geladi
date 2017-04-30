package Model;

public abstract class orang{

    private String Nama;
    private String Alamat;
    private String Email;
    private String Telepon;
    private String tglLahir;
    private String NIM;
    private String Jurusan;
  


    public orang(String Nama, String Alamat, String Email, String Telepon,String tglLahir ,String NIM,String Jurusan) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Email= Email;
        this.Telepon = Telepon;
        this.tglLahir = tglLahir;
        this.NIM     = NIM;
        this.Jurusan = Jurusan;
      
    }

    public String getNama() {
        return Nama;
    }
    
     public void setNama(String Nama) {
        this.Nama = Nama;
    }


    public String getAlamat() {
        return Alamat;
    }
    
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getEmail() {
        return Email;
    }
    
     public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelepon() {
        return Telepon;
    }
    
       public void setTelepon(String Telepon) {
        this.Telepon = Telepon;
    }

    public String gettglLahir() {
        return tglLahir;
    }
    
      public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }
    
     public String getNIM() {
        return NIM;
    }
     
        public void setNIM(String NIM) {
        this.NIM = NIM;
    }
     
     
         public String getJurusan() {
        return Jurusan;
    }
         
        public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }
         


   

    
    
}
