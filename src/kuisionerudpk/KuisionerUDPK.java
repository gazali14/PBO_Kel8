/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuisionerudpk;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author U53R
 */
public class KuisionerUDPK {
    private static ArrayList<QuestionaireData> sheets = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        //commit awal
        Scanner in = new Scanner(System.in);
        boolean quit = false;
        
        System.out.println("\033[34m=======================================");
        System.out.println("\033[34m== Program Entri Data Kuesioner UDPK ==");
        System.out.println("\033[34m=======================================");
        System.out.println();
        System.out.println("Selamat Datang di Program Entri Data Kuesioner UDPK (Update Direktori Perusahaan Konstruksi)!\n");
        System.out.println("Isilah kuesioner ini dengan jujur dan benar!");
        System.out.println("Selamat mengisi kuesioner!");

        do{
            System.out.println("\nMenu : ");
            System.out.println("\033[33m1. Entri data");
            System.out.println("\033[33m2. Lihat data");
            System.out.println("\033[33m3. Keluar");

            System.out.print("Pilih: ");
            String menu = in.nextLine();
            switch(menu) {
                case "1" :
                    QuestionaireData qd = new QuestionaireData(); //Pembuatan lembar kuesioner
                    boolean kipValid = false;
                    boolean perusahaanValid = false;

                    /*
                        Pengisian KIP
                    */
                    KIP kip = new KIP();
                    try {
                        System.out.println("\n\033[34m==========Bagian KIP==========\033[0m");
                        String tmpKodeKIP;

                        System.out.print("Kode KIP   (Berisi 9 Angka)     : ");
                        tmpKodeKIP = in.nextLine();
                        kip.setKodeKIP(tmpKodeKIP);
                        kip.getValidasi();
                        kipValid = true;
                    } catch (ValidatorException e) {
                        System.out.println(e.getMessage());
                    }


                    /*

                        Pengisian Keterangan Umum Perusahaan

                    */
                    if(kipValid) {
                        Perusahaan perusahaan = new Perusahaan();
                        try {
                            System.out.println("\n\033[34m==========Keterangan Umum Perushaan==========");
                            String tmpNamaPerusahaan;
                            String tmpNamaPengusaha;
                            String tmpAlamat;
                            String tmpKodePos;
                            String tmpTelepon;
                            String tmpFax;
                            String tmpNoHP;
                            String tmpProv;
                            String tmpKodeProv;
                            String tmpKab;
                            String tmpKodeKab;
                            String tmpKec;
                            String tmpKodeKec;
                            String tmpDes;
                            String tmpKodeDes;
                            String tmpEmail;

                            System.out.print("Nama Perusahaan                        : ");
                            tmpNamaPerusahaan = in.nextLine();

                            System.out.print("Nama Pengusaha                         : ");
                            tmpNamaPengusaha = in.nextLine();

                            System.out.print("Alamat                                 : ");
                            tmpAlamat = in.nextLine();

                            System.out.print("Kode Pos    (Berisi 5 Digit)           : ");
                            tmpKodePos = in.nextLine();

                            System.out.print("Telepon     (Berisi 11-13 Digit)       : ");
                            tmpTelepon = in.nextLine();

                            System.out.print("Fax         (Berisi 8-15 Digit)        : ");
                            tmpFax = in.nextLine();

                            System.out.print("No HP       (Berisi 11-13 Digit)       : ");
                            tmpNoHP = in.nextLine();

                            System.out.print("Provinsi                               : ");
                            tmpProv = in.nextLine();

                            System.out.print("Kode Provinsi    (Berisi 2 Digit)      : ");
                            tmpKodeProv = in.nextLine();

                            System.out.print("Kabupaten/Kota                         : ");
                            tmpKab = in.nextLine();

                            System.out.print("Kode Kabupaten/Kota  (Berisi 2 Digit)   : ");
                            tmpKodeKab = in.nextLine();

                            System.out.print("Kecamatan                              : ");
                            tmpKec = in.nextLine();

                            System.out.print("Kode Kecamatan   (Berisi 3 Digit)      : ");
                            tmpKodeKec = in.nextLine();

                            System.out.print("Desa                                   : ");
                            tmpDes = in.nextLine();

                            System.out.print("Kode Desa        (Berisi 3 Digit)      : ");
                            tmpKodeDes = in.nextLine();

                            System.out.print("Email        (Mengandung '@' dan '.')  : ");
                            tmpEmail = in.nextLine();

                            perusahaan.setNamaPerusahaan(tmpNamaPerusahaan);
                            perusahaan.setNamaPengusaha(tmpNamaPengusaha);
                            perusahaan.setAlamat(tmpAlamat);
                            perusahaan.setKodePos(tmpKodePos);
                            perusahaan.setTelepon(tmpTelepon);
                            perusahaan.setFax(tmpFax);
                            perusahaan.setNoHP(tmpNoHP);
                            perusahaan.setProvinsi(tmpProv);
                            perusahaan.setKodeProv(tmpKodeProv);
                            perusahaan.setKabupaten(tmpKab);
                            perusahaan.setKodeKab(tmpKodeKab);
                            perusahaan.setKecamatan(tmpKec);
                            perusahaan.setKodeKec(tmpKodeKec);
                            perusahaan.setDesa(tmpDes);
                            perusahaan.setKodeDes(tmpKodeDes);
                            perusahaan.setEmail(tmpEmail);
                            perusahaan.getValidasi();
                            perusahaanValid = true;
                        } catch (ValidatorException e) {
                            System.out.println(e.getMessage());
                        }
                    }


                    /*

                        Kuesioner Utama

                    */
                    if (perusahaanValid)
                    try {
                        System.out.println("\n\033[34m==========Kuesioner Utama==========\033[0m");
                        String tmpStatusUsaha;

                        System.out.println("Status Perusahaan/Usaha Saat Dikunjungi       :");
                        System.out.println("1 - Aktif Lama");                    
                        System.out.println("2 - Aktif Baru");
                        System.out.println("3 - Tutup");
                        System.out.println("4 - Tidak Ditemukan");
                        System.out.println("5 - Bukan Konstruksi");
                        System.out.print("Pilih : ");

                        tmpStatusUsaha = in.nextLine();



                        qd.setStatusUsaha(tmpStatusUsaha);
                        if(qd.getStatusUsaha().equals("1") || qd.getStatusUsaha().equals("2")) {
                            String tmpKualifikasiGrade;    
                            System.out.println("Kualifikasi Perusahaan/Usaha (Gred)           :");
                            System.out.println("1 - Gred-1");                    
                            System.out.println("2 - Gred-2");
                            System.out.println("3 - Gred-3");
                            System.out.println("4 - Gred-4");
                            System.out.println("5 - Gred-5");
                            System.out.println("6 - Gred-6");
                            System.out.println("7 - Gred-7");
                            System.out.println("9 - Non Gred");
                            System.out.print("Pilih : ");
                            tmpKualifikasiGrade = in.nextLine();
                            qd.setGred(tmpKualifikasiGrade);

                            String tmpBadanUsaha;
                            System.out.println("\n\nBadan Hukum/Badan Usaha       :");
                            System.out.println("1 - PT. Persero");                    
                            System.out.println("2 - PT.");
                            System.out.println("3 - CV");
                            System.out.println("4 - Firma");
                            System.out.println("5 - Koperasi");
                            System.out.println("6 - Perorangan");
                            System.out.println("7 - Lainnya");
                            System.out.print("Pilih : ");
                            tmpBadanUsaha = in.nextLine();
                            qd.setBadanUsaha(tmpBadanUsaha);

                            System.out.println();

                            String tmpPekerjaanUtama;
                            System.out.println("Isikan Jenis borongan Pekerjaan Utama Yang Biasa Dikerjakan :        :");
                            tmpPekerjaanUtama = in.nextLine();
                            qd.setPekerjaanUtama(tmpPekerjaanUtama);

                            String tmpBidangPekerjaan;
                            System.out.println("\n\nBidang Pekerjaan Utama                :");
                            System.out.println("1 - Konstruksi Gedung");                    
                            System.out.println("2 - Konstruksi Sipil");
                            System.out.println("3 - Konstruksi Khusus");
                            System.out.print("Pilih : ");
                            tmpBidangPekerjaan = in.nextLine();
                            qd.setGred(tmpBidangPekerjaan);

                            String tmpTempatUsaha;
                            System.out.println("\n\nTempat Usaha      :");
                            System.out.println("1 - Kantor");                    
                            System.out.println("2 - Rumah Tinggal");
                            System.out.println("3 - Rukan");
                            System.out.println("4 - Lainnya");
                            System.out.print("Pilih : ");
                            tmpTempatUsaha = in.nextLine();
                            qd.setGred(tmpTempatUsaha);
                            if(qd.getGred().equals("4")) {
                                System.out.print("Isi nama tempat usaha yang dimaksud : ");
                                tmpTempatUsaha = in.nextLine();
                            }

                            System.out.println();

                            BanyakPekerja pekerja = new BanyakPekerja();
                            int tmpPekerjaLaki;
                            int tmpPekerjaPerempuan;
                            try {
                                System.out.println("\n\nBanyak Pekerja Laki-Laki : ");
                                tmpPekerjaLaki = in.nextInt();
                                System.out.println("Banyak Pekerja Perempuan : ");
                                tmpPekerjaLaki = in.nextInt();   
                            } catch(Exception e) {
                                System.out.println("Data banyak pekerja tidak valid");
                                throw new ValidatorException("Ada yang ga beres nih :(");
                            }
                        }

                        System.out.println("\033[34m=============Informasi Petugas=============");
                        Person contactPerson = new ContactPerson();
                        Person pencacah = new Pencacah();
                        Person pengawas = new Pengawas();
                        String tmp;
                        System.out.println("\n===Contact Person===");
                        System.out.println("Nama : ");
                        tmp = in.nextLine();
                        contactPerson.setNama(tmp);
                        System.out.println("Jabatan");
                        tmp = in.nextLine();
                        contactPerson.setNama(tmp);
                        System.out.println("Tanggal (dd-MM-yyyy): ");
                        tmp = in.nextLine();
                        contactPerson.setTanggal(tmp);

                        System.out.println("\n\n===Pencacah===");
                        System.out.println("Nama : ");
                        tmp = in.nextLine();
                        pencacah.setNama(tmp);
                        System.out.println("Jabatan");
                        tmp = in.nextLine();
                        pencacah.setNama(tmp);
                        System.out.println("Tanggal (dd-MM-yyyy): ");
                        tmp = in.nextLine();
                        pencacah.setTanggal(tmp);

                        System.out.println("\n\n===Pengawas===");
                        System.out.println("Nama : ");
                        tmp = in.nextLine();
                        pengawas.setNama(tmp);
                        System.out.println("Jabatan");
                        tmp = in.nextLine();
                        pengawas.setNama(tmp);
                        System.out.println("Tanggal (dd-MM-yyyy): ");
                        tmp = in.nextLine();
                        pengawas.setTanggal(tmp);

                        System.out.println("\n\n");

                        System.out.println("\033[34m=============Catatan=============");
                        System.out.println("Isi Catatan : ");
                        tmp = in.nextLine();
                        qd.setCatatan(tmp);


                        qd.validasi.validate();

                        sheets.add(qd);
                    } catch (ValidatorException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Ada yang ga beres nih :(");
                    }

                    break;
                case "2" : 
                    if (sheets.isEmpty()) {
                        System.out.println("Tidak ada data kuesioner yang tersimpan.");
                    } else {
                        int counter = 0;
                        for (QuestionaireData qds : sheets) {
                            System.out.println("Kuesioner No."+ ++counter);
                            qds.validasi.print();
                        }
                    }
                    break;
                case "3" : quit = true;
                    break;
            }
            } while(!quit);            
        }
}