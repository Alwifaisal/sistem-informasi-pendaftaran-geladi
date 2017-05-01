package Model;

import Database.Database;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Aplikasi {
   
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private ArrayList<Pembimbing> daftarPembimbing;
    private ArrayList<Kelompok> daftarKelompok;
    private ArrayList<Lokasi> daftarLokasi;
    private Database save;
    
    //Method utama
    public Aplikasi(){
 
    daftarKelompok = new ArrayList();
    daftarLokasi = new ArrayList();
    daftarMahasiswa = new ArrayList();
    daftarPembimbing = new ArrayList();
                 save = new Database();
    
     }
    
   

//method mahasiswa

public void createMahasiswa (String NIM, String Nama, String Alamat, String Email, String Telepon, String tglLahir, String Jurusan, String Username, String Password){
    daftarMahasiswa.add(new Mahasiswa(NIM, Nama, Alamat, Email, Telepon, tglLahir, Jurusan, Username, Password));
}

public Mahasiswa getUsernameMhs(String usernamel){
    System.out.println("cek 1");
    return daftarMahasiswa.stream()
            .filter(e -> e.getUsername().equals(usernamel))
            .findFirst().orElse(null);
}

public Mahasiswa getMahasiswa(String id){
    return daftarMahasiswa.stream()
            .filter(e -> e.getidMahasiswa().equals(id))
            .findFirst().orElse(null);
}

public Mahasiswa getMahasiswa(int index){
    Mahasiswa e = daftarMahasiswa.get(index);
    return e;
}

public void removeMahasiswa (String id){
    for ( Mahasiswa e : daftarMahasiswa ){
        if  (e.getidMahasiswa().equals(id)){
            daftarMahasiswa.remove(e);
        }
    }
}

//method pembimbing

public void createPembimbing (String Nama, String Alamat, String Email, String Telepon, String tglLahir, String NIP,String Username,String Password){
    daftarPembimbing.add( new Pembimbing (Nama,Alamat,Email,Telepon,tglLahir,NIP,Username,Password));
}

public Pembimbing getUsernamePmb(String usernamel){
    System.out.println("cek 1");
    return daftarPembimbing.stream()
            .filter(e -> e.getUsername().equals(usernamel))
            .findFirst().orElse(null);
}

public Pembimbing getPembimbing(String id ){
    return daftarPembimbing.stream()
            .filter(e -> e.getidPembimbing().equals(id))
            .findFirst().orElse(null);
    
}

public Pembimbing getPembimbing(int index){
    Pembimbing e = daftarPembimbing.get(index);
    return e;
}

public void removePembimbing (String id){
    for ( Pembimbing e : daftarPembimbing ){
        if  (e.getidPembimbing().equals(id)){
            daftarPembimbing.remove(e);
        }
    }
    
}

//komposisi
public void addLokasi(String pembimbing,String Kelompok){
    Lokasi cust = new Lokasi(pembimbing,Kelompok);
    daftarLokasi.add(cust);
}



//method Kelompok

public void createKelompok (String Mahasiswa,String Pembimbing, String dataKelompok){
  daftarKelompok.add(new Kelompok(Mahasiswa,Pembimbing,dataKelompok));
}

public Kelompok getKelompok(String id){
    return daftarKelompok.stream()
            .filter(e -> e.getidKelompok().equals(id))
            .findFirst().orElse(null);
}

public void removeKelompok(String id){
    for(Kelompok e : daftarKelompok){
        if (e.getidKelompok().equals(id)){
            daftarKelompok.remove(e);
        }
    }
}

public Kelompok getSetKelompok(String id){
    Kelompok i = getKelompok(id);
    if((i != null) && (i instanceof Kelompok)){
        return i ;
        }else {
         throw new IllegalStateException("Kelompok tidak ada");
    }
}

public void assignMahasiswa(String idK, String idE){
    Kelompok K, KCek;
    KCek = getKelompok(idK);
    if ((KCek != null) && (KCek instanceof Kelompok)){
        K = KCek;
    }else {
       throw new IllegalStateException("Kelompok tidak ada");
    }


Mahasiswa E = getMahasiswa(idE);
   if((E != null) && (E instanceof Mahasiswa)){
       if (K.getMahasiswa(idE) == null){
               K.addMahasiswa(E);
            } else {
                throw new IllegalStateException("Kelompok sudah ada");
            }
        } else {
            throw new IllegalStateException("Kelompok tidak ada");
        }
    }

public void unassignMahasiswa (String idK, String idE){
        Kelompok K, KCek;
        KCek = getKelompok(idK);
        if ((KCek != null) && (KCek instanceof Kelompok)) {
            K = KCek;
        } else {
            throw new IllegalStateException("Kelompok tidak ada");
        }
        K.removeMahasiswa(idK);
    }

public String getListKelompokMahasiswa(String idK) {
    Kelompok K , Kcek;
    String s = "";
    Kcek = getKelompok(idK);
     if ((Kcek != null) && (Kcek instanceof Kelompok)){
            K = Kcek;
            s = K.getListKelompokMahasiswa();
            return s;
        } else {
            throw new IllegalStateException("kelompok tidak ada");
        }
    }


   



//public void createKelompok (String tambahKelompok, String hapusKelompok,String dataKelompok){
//    daftarKelompok.add(new Kelompok(tambahKelompok,hapusKelompok,dataKelompok));
//    
//}
//
//public Kelompok getKelompok(String id ){
//    return daftarKelompok.stream()
//            .filter(e -> e.getidKelompok().equals(id))
//            .findFirst().orElse(null);
//    
//}
//
//public Kelompok getKelompok(int index){
//    Kelompok e = daftarKelompok.get(index);
//    return e;
//}
//
//public void removeKelompok (String id){
//    for ( Kelompok e : daftarKelompok ){
//        if  (e.getidKelompok().equals(id)){
//            daftarKelompok.remove(e);
//        }
//    }
//    
//}
//
//public Kelompok getsetKelompok(String id){
//    Kelompok i = getKelompok(id);
//    if (( i != null) && (i instanceof Kelompok)){
//        return i;
//} else {
//        throw new IllegalStateException("Kelompok sudah penuh");
//    }
//
//}
//
// 
//    public void assignKelompok(String idKP, String idKP1){
//        Kelompok KP, KPCek;
//        KPCek = getKelompok(idKP);
//        if ((KPCek != null) && (KPCek instanceof Kelompok)){
//            KP = KPCek;
//        } else {
//            throw new IllegalStateException("Kelompok sudah penuh coba pilih lagi");
//        }
//    
//        Kelompok KP1 = getKelompok(idKP1);
//        if ((KP1 != null) && (KP1 instanceof Kelompok)){
//            if (KP.getKelompok(idKP1) == null){
//                KP.addKelompok(KP1);
//            } else {
//                throw new IllegalStateException("kelompok tersedia");
//            }
//        } else {
//            throw new IllegalStateException("Kelompok sudah penuh");
//        }
//    }
//    
//    public void unassignKelompok (String idKP, String idKP1){
//        Kelompok KP, KPCek;
//        KPCek = getKelompok(idKP);
//        if ((KPCek != null) && (KPCek instanceof Kelompok)) {
//            KP = KPCek;
//        } else {
//            throw new IllegalStateException("Kelompok penuh");
//        }
//        KP.removeKelompok(idKP1);
//    }
//    
//     public String getListKelompokPilihan(String idKP){
//        Kelompok KP, KPCek;
//        String s = "";
//        KPCek = getKelompok(idKP);
//        if ((KPCek != null) && (KPCek instanceof Kelompok)){
//            KP = KPCek;
//            s = KP.getListKelompokPilihan();
//            return s;
//        } else {
//            throw new IllegalStateException("Kelompok penuh");
//        }
//    }

//method Lokasi
public void createLokasi(String pembimbing,String Kelompok){
    daftarLokasi.add(new Lokasi(pembimbing,Kelompok)); 
}     

public Lokasi getLokasi(String id){
    return daftarLokasi.stream()
            .filter(e -> e.getidLokasi().equals(id))
            .findFirst().orElse(null);
    
}    

public Lokasi getLokasi(int index){
    Lokasi e = daftarLokasi.get (index);
            return e;
}


public void removeLokasi (String id){
    for( Lokasi e : daftarLokasi){
        if (e.getidLokasi().equals(id)){
            daftarLokasi.remove(e);
        }
    }
}
public void assignLokasi (String idL, String idL1){
        Lokasi L, LCek;
        LCek = getLokasi(idL);
        if ((LCek != null) && (LCek instanceof Lokasi)){
            L = LCek;
        } else {
            throw new IllegalStateException("Lokasi tidak terdaftar");
        }
        
        
        Lokasi L1L = getLokasi(idL1);
        if ((L1L != null) && (L1L instanceof Lokasi)){
            if (L.getidLokasi(idL) == null){
                L.addLokasi(L1L);
            } else {
                throw new IllegalStateException("Lokasi sudah ada");
            }
        } else {
            throw new IllegalStateException("Lokasi tidak ada");
        }
    }
    
    public void unassignLokasi (String idL, String idLk){
        Lokasi L, LCek;
        LCek = getLokasi(idL);
        if ((LCek != null) && (LCek instanceof Lokasi)) {
            L = LCek;
        } else {
            throw new IllegalStateException("Lokasi tidak ada");
        }
        L.removeLokasi(idLk);
    }
    
    //Login mahasiswa
    public String loginMahasiswa(String Usernamel, String Passwordl) {
        String s = "";
        Mahasiswa m = getUsernameMhs(Usernamel);
            if (m.getPassword().equals(Passwordl)) {
                s = "1";
            } else {
                s = "2";
            }
        return s;
    }
         
    //Login Admin
    public String loginAdmin(String Usernamel, String Passwordl) {
        String s = "";
        Pembimbing p = getUsernamePmb(Usernamel);
            if (p.getPassword().equals(Passwordl)) {
                System.out.println("cek 2");
                s = "1";
            } else {
                System.out.println("cek 3");
                s = "2";
            }
        return s;
    }
    // Tambahan
    
    public void viewListConsole(String[] list) {
        Arrays.stream(list).forEach(System.out::println);
    }
    
   
    
    public String[] getListMahasiswa() {
        List idMah = daftarMahasiswa.stream()
                .map(e -> e.toStringAll()).collect(Collectors.toList());
        return (String[]) idMah.stream().toArray(size -> new String[size]);
    }
    
    public String[] getListPembimbing() {
        List idPe = daftarPembimbing.stream()
                .map(e -> e.toStringAll()).collect(Collectors.toList());
        return (String[]) idPe.stream().toArray(size -> new String[size]);
    }
    
    public String[] getListKelompok() {
        List idKe = daftarKelompok.stream()
                .map(e -> e.toStringAll()).collect(Collectors.toList());
        return (String[]) idKe.stream().toArray(size -> new String[size]);
    }
    
    public String[] getListLokasi() {
        List idLo = daftarLokasi.stream()
                .map(e -> e.toStringAll()).collect(Collectors.toList());
        return (String[]) idLo.stream().toArray(size -> new String[size]);
    }

//Database Mahasiswa
 public void loadMahasiswa() throws FileNotFoundException, IOException {
        try {
            daftarMahasiswa = (ArrayList<Mahasiswa>) save.getObject("FilePelanggan.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FilePelanggan.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarMahasiswa = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }
 
   public void saveMahasiswa() throws FileNotFoundException, IOException {
        try {
            save.saveObject(daftarMahasiswa, "FileMahasiswa.dat");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("file not found");
        } catch (IOException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }
   
 //Database Pembimbing
  public void loadPembimbing() throws FileNotFoundException, IOException {
        try {
            daftarPembimbing = (ArrayList<Pembimbing>) save.getObject("FilePembimbing.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FilePembimbing.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarPembimbing = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }
    public void savePembimbing() throws FileNotFoundException, IOException {
        try {
            daftarPembimbing = (ArrayList<Pembimbing>) save.getObject("FilePembimbing.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FilePembimbing.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarPembimbing = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }
    
    //Database Kelompok
    public void loadKelompok() throws FileNotFoundException, IOException {
        try {
            daftarKelompok = (ArrayList<Kelompok>) save.getObject("FileKelompok.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FileKelompok.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarKelompok = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    } 
     public void saveKelompok() throws FileNotFoundException, IOException {
        try {
            daftarKelompok = (ArrayList<Kelompok>) save.getObject("FileKelompok.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FileKelompok.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarKelompok = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }
     
      public void loadLokasi() throws FileNotFoundException, IOException {
        try {
            daftarLokasi= (ArrayList<Lokasi>) save.getObject("FileLokasi.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FileLokasi.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarLokasi = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
     
  
    }
      public void saveLokasi() throws FileNotFoundException, IOException {
        try {
            daftarLokasi = (ArrayList<Lokasi>) save.getObject("FileLokasi.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FileLokasi.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarLokasi = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    public void createMahasiswa(String Nama, String NIM, String Email, String Telepon, String tglLahir, String Alamat, String Jurusan) {
        throw new UnsupportedOperationException("UnsupportedOperationException"); 
    }


}




