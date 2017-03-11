package geladi;

public class Orang {
    private String Nama, Alamat, Email, Telepon, TglLahir;

    public Orang(String Nama, String Alamat, String Email, String Telepon, String TTL) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Email = Email;
        this.Telepon = Telepon;
        this.TglLahir = TTL;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getEmail() {
        return Email;
    }

    public String getTelepon() {
        return Telepon;
    }

    public String getTglLahir() {
        return TglLahir;
    }
    
    
}
