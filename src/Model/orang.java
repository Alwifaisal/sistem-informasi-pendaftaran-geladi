package Model;

public abstract class orang{
    
    private String Nama;
    private String Alamat;
    private String Email;
    private String Telepon;
    private String tglLahir;
    private String Jurusan;
    private String Username;
    private String Password;

    public orang(String Nama, String Alamat, String Email, String Telepon, String tglLahir, String Jurusan, String Username, String Password) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Email = Email;
        this.Telepon = Telepon;
        this.tglLahir = tglLahir;
        this.Jurusan = Jurusan;
        this.Username = Username;
        this.Password = Password;
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

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
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
    
    
         


   

    
    
}
