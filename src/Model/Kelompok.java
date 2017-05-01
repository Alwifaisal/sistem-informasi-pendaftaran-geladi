package Model;

import java.util.ArrayList;

public class Kelompok{
    private static int countK = 1;
    
    private final String idKelompok;
    
    private String Mahasiswa;
    private String Pembimbing;
    private String dataKelompok;
    private ArrayList<Mahasiswa> daftarMahasiswa;
    
    public Kelompok(String Mahasiswa, String PembimbingKelompok,String dataKelompok){
        idKelompok = "K-" + (countK++);
        this.Mahasiswa = Mahasiswa ;
        this.Pembimbing = PembimbingKelompok ;
        this.dataKelompok = dataKelompok;
    }
    
    //setter getter
    public String getidKelompok(){
        return idKelompok;
    }
    
       public String getMahasiswa() {
        return Mahasiswa;
    }

    public void setMahasiswa(String Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public String getPembimbing() {
        return Pembimbing;
    }

    public void setPembimbing(String Pembimbing) {
        this.Pembimbing = Pembimbing;
    }
    

    
     public String getDataKelompok() {
        return dataKelompok;
    }

    public void setDataKelompok(String dataKelompok) {
        this.dataKelompok = dataKelompok;
    }
    
    
    @Override
    public String toString(){
        return "idKelompok      :"+ idKelompok +"\n"+
               "tambahMahasiswa :"+ Mahasiswa +"\n"+
               "Pembimbing      :"+  Pembimbing + "\n"+
               "dataKelompok    :"+ dataKelompok + "\n";
        
} 
    public String toStringAll(){
        return idKelompok +","+ Mahasiswa + "," + Pembimbing +","+dataKelompok;
    }

    
  //Method
  public  void removeMahasiswa(String idKP1) {
         for (Mahasiswa KP1 : daftarMahasiswa){
            if (KP1.getidMahasiswa().equals(idKP1)){
                daftarMahasiswa.remove(KP1);
            }
         }
  
    }

    String getListKelompokMahasiswa() {
       String K = "";
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            K += daftarMahasiswa.get(i).getidMahasiswa() + "\n";
        }
        return K;
    }

    Object getMahasiswa(String idKP1) {
        for (Mahasiswa KP1 : daftarMahasiswa) {
            if (KP1.getidMahasiswa().equals(KP1)) {
                return KP1;
            }
        }
        return null;
    }

  public  void addMahasiswa(Mahasiswa KP1) {
        daftarMahasiswa.add(KP1);  
    }

   
    
    
    
}

