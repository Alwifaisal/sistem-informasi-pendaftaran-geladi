package Model;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lokasi{
    private static int countL = 1;
    
    private final String idLokasi;
    private String pembimbing;
    private String kelompok;
    private ArrayList<Lokasi> daftarLokasi;
    
    public Lokasi(String pembimbing,String Kelompok){
        idLokasi = "L-" + (countL++);
        this.pembimbing = pembimbing;
        this.kelompok = Kelompok;
      
        daftarLokasi = new ArrayList();
    }
    
    //method
    
    public void addLokasi(Lokasi L){
        daftarLokasi.add(L);
    }
    
    public Lokasi getidLokasi(String id){
        for (Lokasi L : daftarLokasi){
            if(L.getidLokasi().equals(id)){
                return L;
                
            }
        }
        return null;
    }
    
    public void removeLokasi(String id){
        for (Lokasi L : daftarLokasi){
            if (L.getidLokasi().equals(id)){
                daftarLokasi.remove(L);
            }
        }   
    }
    
    //setter & getter
    
       public String IdLokasi(){
        return idLokasi;
    }
    
      public String getPembimbing() {
        return pembimbing;
    }

    public void setPembimbing(String pembimbing) {
        this.pembimbing = pembimbing;
    }

    public String getKelompok() {
        return kelompok;
    }

    public void setKelompok(String kelompok) {
        this.kelompok = kelompok;
    }

 
 
 
     public String getidLokasi() {
        String s = "";
        for (int i = 0; i < daftarLokasi.size(); i++) {
            s += daftarLokasi.get(i).getidLokasi() + "\n";
        }
        return s;
    }
     
    @Override
    
   public String toString(){
       return "idLokasi         :"+ idLokasi +"\n"+
              "Pembimbing       :"+ pembimbing+"\n"+
              "Kelompok         :"+ kelompok;
             
                      
              
}
   
   public String toStringAll(){
         return idLokasi + " , " + pembimbing + " , " + kelompok;
   }

   
   
   }
