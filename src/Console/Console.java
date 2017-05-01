/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import Model.Aplikasi;
import Model.Kelompok;
import Model.Lokasi;
import Model.Mahasiswa;
import Model.Pembimbing;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alwi faisal
 */
public class Console {

private Aplikasi model;
    private Scanner cinInt;
    private Scanner cinStr;
    
    public Console (Aplikasi model){
        this.model = model;
        cinInt = new Scanner (System.in);
        cinStr = new Scanner (System.in);
    }
    
    public int inputInteger(){
        try {
            return cinInt.nextInt();
        }catch(InputMismatchException e){
            throw new InputMismatchException("input harus integer");
        } finally{
            cinInt = new Scanner(System.in);
        }
    }
    
    public void menuMahasiswa(){
        int pil = 0;
       do{
           try{
               System.out.println("=================================Menu Mahasiswa======================");
               System.out.println("> 1.Daftar Mahasiswa");
               System.out.println("> 2.Hapus Mahasiswa");
               System.out.println("> 3.Lihat Semua Daftar Mahasiswa");
               System.out.println("> 4.Cari Mahasiswa ");
               System.out.println("> 0.Kembali");
               System.out.println("====================================================================");
               System.out.println("> Pilih menu :");
               pil = inputInteger();
               switch (pil){
                   case 1 :
                       System.out.println("--- Daftar Mahasiswa ---");
                       System.out.println("> Nama           :"); String nama = cinStr.nextLine();
                       System.out.println("> NIM            :"); String NIM  = cinStr.nextLine();
                       System.out.println("> Email          :"); String Email = cinStr.nextLine();
                       System.out.println("> Telepon        :"); String Telepon = cinStr.nextLine();
                       System.out.println("> TglLahir       :"); String tglLahir= cinStr.nextLine();
                       System.out.println("> Alamat         :"); String Alamat  = cinStr.nextLine();
                       System.out.println("> Jurusan        :"); String Jurusan = cinStr.nextLine();
                       model.createMahasiswa(nama, NIM, Email, Telepon, tglLahir, Alamat, Jurusan);
                       break;
                       
                   case 2:
                       System.out.println("---Hapus Mahasiswa---");
                       System.out.println("- Id Mahasiswa       "); String id = cinStr.nextLine();
                       model.removeMahasiswa(id);
                       break;
                   case 3 :
                       System.out.println("---Lihat Semua Daftar Mahasiswa---");
                       model.viewListConsole(model.getListMahasiswa());
                       break;
                   case 4 :
                       System.out.println("---Cari Mahasiswa---");
                       System.out.println("- Masukan id  :"); id = cinStr.nextLine();
                       Mahasiswa e = model.getMahasiswa(id);
                       System.out.println(e);
                       break;
                   case 0 :
                       break;
                       
               }   
                               
               } catch (Exception e) {
                   System.out.println("maaf sedang error: "+e.getMessage());
               }finally{
                cinInt = new Scanner(System.in);
                cinStr = new Scanner(System.in);
           }
       }while (pil != 0);
    }
    

    
    public void menuPembimbing(){
        int pil = 0;
        do {
            try{
                System.out.println("====Menu Pembimbing====");
                System.out.println("> 1. Data Pembimbing");
                System.out.println("> 2. Hapus Data Pembimbing");
                System.out.println("> 3. Lihat Semua Data");
                System.out.println("> 4. Cari Pembimbing by id");
                System.out.println("> 0. Exit");
                System.out.println("=======================");
                System.out.println("> Pilih menu :");
                pil = inputInteger();
                switch (pil){
                    case 1:
                        System.out.println("----Data Pembimbing----");
                        System.out.println("- Nama      :");String nama = cinStr.nextLine();
                        System.out.println("- NIP       :");String NIM = cinStr.nextLine();
                        System.out.println("- Alamat    :");String Alamat = cinStr.nextLine();
                        System.out.println("- Email     :");String Email = cinStr.nextLine();
                        System.out.println("- Telepon   :");String Telepon = cinStr.nextLine();
                        System.out.println("- TglLahir  :");String tglLahir = cinStr.nextLine();
                        System.out.println("- Jurusan   :");String Jurusan  = cinStr.nextLine();
                        model.createPembimbing(nama, Alamat, Email, Telepon, tglLahir, NIM, Jurusan);
                        break;
                    case 2:
                        System.out.println("---Hapus Data Pembimbing");
                        System.out.println("- Id Pembimbing :"); String id = cinStr.nextLine();
                        model.removePembimbing(id);
                        break;
                    
                    case 3:
                        System.out.println("---Lihat Semua Data---");
                        model.viewListConsole(model.getListPembimbing());
                        break;
                    case 4 :
                        System.out.println("---Cari Pembimbing---");
                        System.out.println("- Masukan id  :"); id = cinStr.nextLine();
                        Pembimbing e = model.getPembimbing(id);
                        System.out.println(e);
                        break;
                    case 0:
                        break;
                }
                        
            }catch (Exception e){
                System.out.println("maaf sedang error:"+e.getMessage());
            }finally{
                cinInt = new Scanner(System.in);
                cinStr = new Scanner(System.in);
            }
        }while (pil != 0);
    }
    
    public void menuKelompok(){
        int pil = 0;
            do{
                try{
                    System.out.println("========Menu Kelompok============");
                    System.out.println("> 1.Tambah Kelompok");
                    System.out.println("> 2.Hapus Kelompok");
                    System.out.println("> 3.Data Kelompok");
                    System.out.println("> 4.Cari Kelompok by Id ");
                    System.out.println("> 0.Kembali");
                    System.out.println("=================================");
                    System.out.println("> Pilih menu :");
                    pil = inputInteger();
                    switch(pil){
                        case 1:
                            System.out.println("----Tambah Kelompok----");
                            System.out.println("-Nama Kelompok  :"); String tambahKelompok = cinStr.nextLine();
                            model.createKelompok(tambahKelompok, tambahKelompok, tambahKelompok);
                            break;
                        case 2:
                            System.out.println("----Hapus Kelompok----");
                            System.out.println("- Id Kelompok   :"); String id = cinStr.nextLine();
                            model.removeKelompok(id);
                            break;
                        case 3 :
                            System.out.println("---DataKelompok----");
                            model.viewListConsole(model.getListKelompok());
                            break;
                         case 4 :
                            System.out.println("---Cari Kelompok---");
                            System.out.println("- Masukan id  :"); id = cinStr.nextLine();
                            Kelompok e = model.getKelompok(id);
                            System.out.println(e);
                            break;
                        case 0:
                            break;
                            
                            
                        }
                   }catch(Exception e){
                       System.out.println("maaf sedang error  :" + e.getMessage());
                   }finally{
                    cinInt = new Scanner(System.in);
                    cinStr = new Scanner (System.in);
                }
            } while (pil !=0);
    }
    
    public void menuLokasi(){
        int pil = 0;
        do {
            try {
                System.out.println("=========Menu Lokasi=======");
                System.out.println("> 1.Nama Pembimbing Lokasi");
                System.out.println("> 2.Nama Kelompok Lokasi");
                System.out.println("> 3.Data Lokasi");
                System.out.println("> 4.Hapus Data Lokasi");
                System.out.println("> 5.Cari Lokasi");
                System.out.println("> 0.Kembali");
                System.out.println("===========================");
                System.out.println("> Pilih menu  :");
                pil = inputInteger();
                switch(pil){
                    case 1 :
                        System.out.println("----Nama Pembimbing Lokasi----"); 
                        System.out.println("- Nama Pembimbing :"); String namaPembimbing = cinStr.nextLine();
                        model.createLokasi(namaPembimbing, namaPembimbing);
                        break;
                    case 2 :
                        System.out.println("----Nama Kelompok Lokasi----");
                        System.out.println("- Nama Kelompok :");String namaKelompok = cinStr.nextLine();
                        model.createLokasi(namaKelompok, namaKelompok);
                        break;
                    case 3 : 
                        System.out.println("----Data Lokasi---");
                        model.viewListConsole(model.getListLokasi());
                        break;
                    case 4 :
                        System.out.println("---Hapus Data Lokasi---");
                        System.out.println("- Id Lokasi :"); String id = cinStr.nextLine();
                        model.removeLokasi(id);
                        break;
                    case 5 :
                        System.out.println("----Cari Lokasi----");
                        System.out.println("- Masukan id  :"); id = cinStr.nextLine();
                        Lokasi e = model.getLokasi(id);
                        System.out.println(e);
                        break;
                    case 0 :
                        break;                                              
                    
                }
                
            }catch (Exception e){
                System.out.println("Maaf Sedang Error:"+e.getMessage());
            }finally{
                cinInt = new Scanner(System.in);
                cinStr = new Scanner(System.in);
            }
        } while (pil != 0);
        
    }
    
    
    public void menuMahasiswaKelolaKelompok() {
        int pil = 0;
        do {            
            try {
                System.out.println("======= Menu Kelola Mahasiswa dalam Kelompok ======");
                System.out.println("> 1. Tambah Kelompok                                  ");
                System.out.println("> 2. Kurangi Kelompok                                ");
                System.out.println("> 0. Kembali                                               ");
                System.out.println("-----------------------------------------------------------");
                System.out.print("> Pilih menu : ");
                pil = inputInteger();
                switch (pil) {
                    case 1:
                        System.out.println("--- Tambah Kelompok ---");
                        System.out.print(" - ID Mahasiswa    : "); String idMahasiswa = cinStr.nextLine();
                        System.out.print(" - ID Kelompok     : "); String idKelompok = cinStr.nextLine();
                        model.assignMahasiswa(idMahasiswa, idKelompok);
                        break;
                    case 2:
                        System.out.println("--- Kurangi Kelompok ---");
                        System.out.print(" - ID Mahasiswa   : "); idMahasiswa = cinStr.nextLine();
                        System.out.print(" - ID Kelompok   : "); idKelompok = cinStr.nextLine();
                        model.unassignMahasiswa(idMahasiswa, idKelompok);
                        break;
                    case 0:
                        break;
                }
                
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            } finally {
                cinInt = new Scanner(System.in);
                cinStr = new Scanner(System.in);
            }
        } while (pil != 0);
    }
    
     public void menuAdmin(){
        int pil = 0;
        do{
            try{
                System.out.println("====Menu Admin====");
                System.out.println("> 1. Mengelola Pembimbing");
                System.out.println("> 2. Mengelola Lokasi");
                System.out.println("> 3. Mengelola Mahasiswa Dalam kelompok");
                System.out.println("> 0. Exit");
                System.out.println("=======================");
                System.out.println("> Pilih menu :");
                pil = inputInteger();
                switch (pil){
                    case 1 :
                        menuPembimbing();
                        break;
                    case 2 :
                        menuLokasi();
                        break;
                    case 3 :
                        menuMahasiswaKelolaKelompok();
                        break;
                    case 0 :
                        break;
                        
                        
                    
                }
            }catch (Exception e) {
                System.out.println("error : " + e.getMessage());
        }finally {
                cinInt = new Scanner(System.in);
                cinStr = new Scanner(System.in);
            }
        }while (pil != 0); 
   }    
     
     

    public void mainMenu() {
        int pil = 0;
        do {            
            try {
                System.out.println("------ Menu Utama -------");
                System.out.println("- 1. Mahasiswa    ");
                System.out.println("- 2. Admin    ");
        //      System.out.println("- 3. Kelompok");
        //      System.out.println("- 4. Lokasi");
                System.out.println("- 0. Exit                ");
                System.out.println("-------------------------");
                System.out.print("- Pilih menu : ");
                pil = inputInteger();
                switch (pil){
                    case 1:
                        menuMahasiswa();
                        break;
                    case 2:
                        menuAdmin();
                        break;
                    case 0:
                        System.out.println("Terimakasih");
                }
                
            } catch (Exception e) {
                System.out.println("error : " + e.getMessage());
            } finally {
                cinInt = new Scanner(System.in);
                cinStr = new Scanner(System.in);
            }
            
        } while (pil != 0); 
    }
       
    }
    

