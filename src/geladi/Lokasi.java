package geladi;

public class Lokasi {
    private Pembimbing pembimbing;
    private Kelompok [] kelompok;

    public Lokasi(Pembimbing pembimbing, Kelompok[] kelompok) {
        this.pembimbing = pembimbing;
        this.kelompok = kelompok;
    }
    
    public void SetPembimbing(Pembimbing p){
        
    }
    
    public void CreateKelompok(){
        
    }

    public Kelompok[] getKelompok(int idx) {
        return kelompok;
    }
    
    public void RemovePembimbing(){
        
    }
    
}


