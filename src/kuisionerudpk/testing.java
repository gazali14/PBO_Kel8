/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisionerudpk;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author LENOVO
 */
public class testing {
    public static void main(String arg[]) {
        Perusahaan perusahaan = new Perusahaan();
        try {
            perusahaan.setNamaPerusahaan("Mantap Konstruksi Kuat");
            perusahaan.setNamaPengusaha("Andi Wiranto");
            perusahaan.setAlamat("Jalan Pegansaan Timur No. 15");
            perusahaan.setKodePos("25060");
            perusahaan.setTelepon("081238482838");
            perusahaan.setFax("08129384029");
            perusahaan.setNoHP("082182039203");
            perusahaan.setProvinsi("Sumatera Utara");
            perusahaan.setKodeProv("12");
            perusahaan.setKabupaten("Langkat");
            perusahaan.validasi.validate();
        }catch (ValidatorException e) {
            System.out.println(e.getMessage());
        }
    }
}
