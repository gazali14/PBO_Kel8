/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisionerudpk;

/**
 *
 * @author U53R
 */
import java.util.Date;

public abstract class Person {
    private String nama;
    private String jabatan;
    private Date tanggal;
    private Validator validasi;

    public Person() {
    }

    // Getter dan setter untuk semua atribut
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Validator getValidasi() {
        return validasi;
    }

    public void setValidasi(Validator validasi) {
        this.validasi = validasi;
    }
}

class Pencacah extends Person{
    public Pencacah() {
    }
}

class Pengawas extends Person{
    public Pengawas() {
    }
    
}

class ContactPerson extends Person{
    public ContactPerson() {
    }
    
}