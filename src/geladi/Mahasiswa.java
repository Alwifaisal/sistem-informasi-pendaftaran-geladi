package geladi;

public class Mahasiswa extends Orang {
    private String Nim, Kelas, Jurusan, Status;

    public Mahasiswa(String Nim, String Kelas, String Jurusan, String Status, String Nama, String Alamat, String Email, String Telepon, String TTL) {
        super(Nama, Alamat, Email, Telepon, TTL);
        this.Nim = Nim;
        this.Kelas = Kelas;
        this.Jurusan = Jurusan;
        this.Status = Status;
    }
    
    
    public void AddPembimbing(){
    
    
    }
    
    public void RemovePembimbing(){
    }
}
