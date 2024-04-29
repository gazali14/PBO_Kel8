/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisionerudpk;

/**
 *
 * @author U53R
 */
public class ValidatorPerson implements Validator {
    private Person person; // Objek Person yang akan divalidasi

    public ValidatorPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean validate() throws ValidatorException {
        // Lakukan validasi untuk semua atribut Person
        // Validasi untuk nama
        if (!isValidString(person.getNama())|| !person.getNama().matches("[a-zA-Z]+")) {
            throw new ValidatorException("Nama tidak boleh kosong");
        }

        // Validasi untuk jabatan
        if (!isValidString(person.getJabatan())|| !person.getJabatan().matches("[a-zA-Z]+")) {
            throw new ValidatorException("Jabatan tidak boleh kosong");
        }

        if (!isValidString(person.getStrDate()) || !person.getStrDate().matches("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-(200[0-9]|201[0-9]|202[0-5])$")) {
            throw new ValidatorException("Tanggal harus dalam format dd-mm-yyyy");
        }
        // Jika semua validasi berhasil, kembalikan true
        return true;
    }

    // Metode bantuan untuk memeriksa apakah string tidak kosong
    private boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    @Override
    public boolean save() {
        System.out.println("Save here...");
        return true;
    }

    @Override
    public void print() {
        // Mencetak informasi person
        System.out.println("Nama: " + person.getNama());
        System.out.println("Jabatan: " + person.getJabatan());
        System.out.println("Tanggal: " + person.getTanggal());
    }

    @Override
    public void reset() {
        // Mereset semua atribut dalam objek Person
        person.setNama("");
        person.setJabatan("");
        person.setTanggal(null);
    }
}

