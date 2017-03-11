package geladi;

public class Pembimbing extends Orang {
    private String Nip;

    public Pembimbing(String Nip, String Nama, String Alamat, String Email, String Telepon, String TTL) {
        super(Nama, Alamat, Email, Telepon, TTL);
        this.Nip = Nip;
    }

    public String getNip() {
        return Nip;
    }
    
}
