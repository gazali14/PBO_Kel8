/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisionerudpk;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class testing {
    public static void main(String arg[]) {
        Perusahaan perusahaan = new Perusahaan();
        ContactPerson cp = new ContactPerson();
//        try {
////            perusahaan.setNamaPerusahaan("Mantap Konstruksi Kuat");
////            perusahaan.setNamaPengusaha("Andi Wiranto");
////            perusahaan.setAlamat("Jalan Pegansaan Timur No. 15");
////            perusahaan.setKodePos("25060");
////            perusahaan.setTelepon("081238482838");
////            perusahaan.setFax("08129384029");
////            perusahaan.setNoHP("082182039203");
////            perusahaan.setProvinsi("Sumatera Utara");
////            perusahaan.setKodeProv("12");
////            perusahaan.setKabupaten("Langkat");
////            perusahaan.setKodeKab("25");
////            perusahaan.validasi.validate();
////                ContactPerson contactPerson = new ContactPerson();
////                Pencacah pencacah = new Pencacah();
////                String tmp;
//                Scanner in = new Scanner(System.in);
////                
////                System.out.println("\n===Contact Person===");
////                System.out.print("Nama : ");
////                tmp = in.nextLine();
////                contactPerson.setNama(tmp);
////                System.out.print("Jabatan : ");
////                tmp = in.nextLine();
////                contactPerson.setJabatan(tmp);
////                System.out.print("Tanggal (dd-MM-yyyy): ");
////                tmp = in.nextLine();
////                contactPerson.setTanggal(tmp);
////                contactPerson.validasi.validate();
////                
////                System.out.println("\n\n===Pencacah===");
////                System.out.print("Nama : ");
////                tmp = in.nextLine();
////                pencacah.setNama(tmp);
////                System.out.print("Jabatan : ");
////                tmp = in.nextLine();
////                pencacah.setJabatan(tmp);
////                System.out.print("Tanggal (dd-MM-yyyy): ");
////                tmp = in.nextLine();
////                pencacah.setTanggal(tmp);
////                pencacah.validasi.validate();
//
//                            
//        }catch (ValidatorException e) {
//            System.out.println(e.getMessage());
//        }
        Scanner in = new Scanner(System.in);
                            BanyakPekerja pekerja = new BanyakPekerja();
                            String tmpPekerjaLaki;
                            String tmpPekerjaPerempuan;
                            System.out.println("\n\nBanyak Pekerja Laki-Laki : ");
                            tmpPekerjaLaki = in.nextLine();
                            System.out.println("Banyak Pekerja Perempuan : ");
                            tmpPekerjaPerempuan = in.nextLine();
                            pekerja.setJmlPekerjaLaki(Integer.parseInt(tmpPekerjaLaki));
                            pekerja.setJmlPekerjaPerempuan(Integer.parseInt(tmpPekerjaPerempuan));
                            System.out.println(pekerja.getTotal());
    }
}
