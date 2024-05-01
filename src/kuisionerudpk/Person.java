package kuisionerudpk;

/**
 *
 * @author Kelompok 8
    Briel Sevtriobragi Sihaloho (222212539)
    Dewi Nurihandayani (222212564)
    Fickry Atmayoga Wienaldi (222212610)
    La Ode Muhammad Gazali (222212696)
 * 
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public abstract class Person {
    private String nama;
    private String jabatan;
    private String strDate; 
    private LocalDate tanggal;
    Validator validasi;

    public Person() {
        validasi = new ValidatorPerson(this);
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

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(String strDate) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(strDate, formatter);
            this.strDate = strDate;
        } catch (DateTimeParseException e) {
            System.out.println("Format tanggal tidak valid");
        }
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }
    
    public Validator getValidasi() {
        return validasi;
    }

    public void setValidasi(Validator validasi) {
        this.validasi = validasi;
    }

    @Override
    public abstract String toString();
}

class Pencacah extends Person{
    public Pencacah() {
    }

    @Override
    public String toString() {
        return "Pencacah["+this.getNama()+","+this.getJabatan()+"]";
    }
}

class Pengawas extends Person{
    public Pengawas() {
    }
    @Override
    public String toString() {
        return "Pengawas["+this.getNama()+","+this.getJabatan()+"]";
    }
}

class ContactPerson extends Person{
    public ContactPerson() {
    }
    @Override
    public String toString() {
        return "ContactPerson["+this.getNama()+","+this.getJabatan()+"]";
    }
    
}