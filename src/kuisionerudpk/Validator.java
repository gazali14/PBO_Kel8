/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisionerudpk;

/**
 *
 * @author U53R
 */
import java.util.regex.Pattern;
public interface Validator {
    boolean validate() throws ValidatorException;
    boolean save();
    void print();
    void reset();
}

class ValidatorPerusahaan implements Validator {
    private Perusahaan perusahaan; // Objek Perusahaan yang akan divalidasi
    
    public ValidatorPerusahaan(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }
    
    @Override
    public boolean validate() throws ValidatorException {
        // Lakukan validasi untuk semua atribut Perusahaan
        // Validasi untuk nama perusahaan
        if (!isValidString(perusahaan.getNamaPerusahaan())) {
            throw new ValidatorException("Nama perusahaan tidak boleh kosong");
        }
        
        // Validasi untuk nama pengusaha
        if (!isValidString(perusahaan.getNamaPengusaha())) {
            throw new ValidatorException("Nama pengusaha tidak boleh kosong");
        }
        
        // Validasi untuk alamat
        if (!isValidString(perusahaan.getAlamat())) {
            throw new ValidatorException("Alamat tidak boleh kosong");
        }
        
        // Validasi untuk kode pos
        if (!isValidString(perusahaan.getKodePos())) {
            throw new ValidatorException("Kode pos tidak boleh kosong");
        }
        
        // Validasi untuk telepon
        if (!isValidString(perusahaan.getTelepon())) {
            throw new ValidatorException("Nomor telepon tidak boleh kosong");
        }
        
        // Validasi untuk fax
        if (!isValidString(perusahaan.getFax())) {
            throw new ValidatorException("Nomor fax tidak boleh kosong");
        }
        
        // Validasi untuk nomor HP
        if (!isValidString(perusahaan.getNoHP())) {
            throw new ValidatorException("Nomor HP tidak boleh kosong");
        }
        
        // Validasi untuk provinsi
        if (!isValidString(perusahaan.getProvinsi())) {
            throw new ValidatorException("Provinsi tidak boleh kosong");
        }
        
        // Validasi untuk kode provinsi
        if (!isValidString(perusahaan.getKodeProv())) {
            throw new ValidatorException("Kode provinsi tidak boleh kosong");
        }
        
        // Validasi untuk kabupaten
        if (!isValidString(perusahaan.getKabupaten())) {
            throw new ValidatorException("Kabupaten tidak boleh kosong");
        }
        
        // Validasi untuk kode kabupaten
        if (!isValidString(perusahaan.getKodeKab())) {
            throw new ValidatorException("Kode kabupaten tidak boleh kosong");
        }
        
        // Validasi untuk kecamatan
        if (!isValidString(perusahaan.getKecamatan())) {
            throw new ValidatorException("Kecamatan tidak boleh kosong");
        }
        
        // Validasi untuk kode kecamatan
        if (!isValidString(perusahaan.getKodeKec())) {
            throw new ValidatorException("Kode kecamatan tidak boleh kosong");
        }
        
        // Validasi untuk desa
        if (!isValidString(perusahaan.getDesa())) {
            throw new ValidatorException("Desa tidak boleh kosong");
        }
        
        // Validasi untuk kode desa
        if (!isValidString(perusahaan.getKodeDes())) {
            throw new ValidatorException("Kode desa tidak boleh kosong");
        }
        
        // Validasi untuk email
        if (!isValidEmail(perusahaan.getEmail())) {
            throw new ValidatorException("Email tidak valid");
        }
        
        // Jika semua validasi berhasil, kembalikan true
        return true;
    }
    
    // Metode bantuan untuk memeriksa apakah string tidak kosong
    private boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }
    
    // Metode bantuan untuk validasi email
    private boolean isValidEmail(String email) {
        // Contoh validasi sederhana
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    @Override
    public boolean save() {
        System.out.println("Save here...");
        return true;
    }

    @Override
    public void print() {
        // Mencetak informasi perusahaan
        System.out.println("Nama Perusahaan: " + perusahaan.getNamaPerusahaan());
        System.out.println("Nama Pengusaha: " + perusahaan.getNamaPengusaha());
        System.out.println("Alamat: " + perusahaan.getAlamat());
        System.out.println("Kode Pos: " + perusahaan.getKodePos());
        System.out.println("Telepon: " + perusahaan.getTelepon());
        System.out.println("Fax: " + perusahaan.getFax());
        System.out.println("Nomor HP: " + perusahaan.getNoHP());
        System.out.println("Provinsi: " + perusahaan.getProvinsi());
        System.out.println("Kode Provinsi: " + perusahaan.getKodeProv());
        System.out.println("Kabupaten: " + perusahaan.getKabupaten());
        System.out.println("Kode Kabupaten: " + perusahaan.getKodeKab());
        System.out.println("Kecamatan: " + perusahaan.getKecamatan());
        System.out.println("Kode Kecamatan: " + perusahaan.getKodeKec());
        System.out.println("Desa: " + perusahaan.getDesa());
        System.out.println("Kode Desa: " + perusahaan.getKodeDes());
        System.out.println("Email: " + perusahaan.getEmail());
    }

    @Override
    public void reset() {
        // Mereset semua atribut dalam objek Perusahaan
        perusahaan.setNamaPerusahaan("");
        perusahaan.setNamaPengusaha("");
        perusahaan.setAlamat("");
        perusahaan.setKodePos("");
        perusahaan.setTelepon("");
        perusahaan.setFax("");
        perusahaan.setNoHP("");
        perusahaan.setProvinsi("");
        perusahaan.setKodeProv("");
        perusahaan.setKabupaten("");
        perusahaan.setKodeKab("");
        perusahaan.setKecamatan("");
        perusahaan.setKodeKec("");
        perusahaan.setDesa("");
        perusahaan.setKodeDes("");
        perusahaan.setEmail("");
    }
}

class ValidatorPerson implements Validator {
    private Person person; // Objek Person yang akan divalidasi

    public ValidatorPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean validate() throws ValidatorException {
        // Lakukan validasi untuk semua atribut Person
        // Validasi untuk nama
        if (!isValidString(person.getNama())) {
            throw new ValidatorException("Nama tidak boleh kosong");
        }

        // Validasi untuk jabatan
        if (!isValidString(person.getJabatan())) {
            throw new ValidatorException("Jabatan tidak boleh kosong");
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

class ValidatorKIP implements Validator {
    private KIP kip; // Objek KIP yang akan divalidasi

    public ValidatorKIP(KIP kip) {
        this.kip = kip;
    }

    @Override
    public boolean validate() throws ValidatorException {
        // Lakukan validasi untuk semua atribut KIP
        // Validasi untuk kode KIP
        if (!isValidString(kip.getKodeKIP())) {
            throw new ValidatorException("Kode KIP tidak boleh kosong");
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
        // Mencetak informasi KIP
        System.out.println("Kode KIP: " + kip.getKodeKIP());
    }

    @Override
    public void reset() {
        // Mereset semua atribut dalam objek KIP
        kip.setKodeKIP("");
    }
}


class ValidatorQuestionaireData implements Validator {
    private QuestionaireData QuestionaireData; // Objek QuestionaireData yang akan divalidasi

    public ValidatorQuestionaireData(QuestionaireData QuestionaireData) {
        this.QuestionaireData = QuestionaireData;
    }

    @Override
    public boolean validate() throws ValidatorException {
        // Lakukan validasi untuk semua atribut QuestionaireData
        // Anda dapat menyesuaikan validasi sesuai kebutuhan
        
        // Contoh validasi untuk status usaha
        if (!isValidString(QuestionaireData.getStatusUsaha())) {
            throw new ValidatorException("Status usaha tidak boleh kosong");
        }

        // Contoh validasi untuk gred
        if (!isValidString(QuestionaireData.getGred())) {
            throw new ValidatorException("Gred tidak boleh kosong");
        }

        // Validasi untuk atribut badan usaha
        if (!isValidString(QuestionaireData.getBadanUsaha())) {
            throw new ValidatorException("Badan usaha tidak boleh kosong");
        }

        // Validasi untuk atribut pekerjaan utama
        if (!isValidString(QuestionaireData.getPekerjaanUtama())) {
            throw new ValidatorException("Pekerjaan utama tidak boleh kosong");
        }

        // Validasi untuk atribut bidang pekerjaan utama
        if (!isValidString(QuestionaireData.getBidangPekerjaanUtama())) {
            throw new ValidatorException("Bidang pekerjaan utama tidak boleh kosong");
        }

        // Validasi untuk atribut tempat usaha
        if (!isValidString(QuestionaireData.getTempatUsaha())) {
            throw new ValidatorException("Tempat usaha tidak boleh kosong");
        }

        // Validasi untuk atribut banyak pekerja tetap
        if (QuestionaireData.getBanyakPekerjaTetap() <= 0) {
            throw new ValidatorException("Banyak pekerja tetap harus lebih besar dari 0");
        }

        // Validasi untuk atribut contact person
        if (QuestionaireData.getContactPerson() == null) {
            throw new ValidatorException("Contact person tidak boleh kosong");
        }

        // Validasi untuk atribut pencacah
        if (QuestionaireData.getPencacah() == null) {
            throw new ValidatorException("Pencacah tidak boleh kosong");
        }

        // Validasi untuk atribut pengawas
        if (QuestionaireData.getPengawas() == null) {
            throw new ValidatorException("Pengawas tidak boleh kosong");
        }

        // Validasi untuk atribut catatan
        if (!isValidString(QuestionaireData.getCatatan())) {
            throw new ValidatorException("Catatan tidak boleh kosong");
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
        // Mencetak informasi QuestionaireData
        System.out.println("Status Usaha: " + QuestionaireData.getStatusUsaha());
        System.out.println("Gred: " + QuestionaireData.getGred());
        System.out.println("Badan Usaha: " + QuestionaireData.getBadanUsaha());
        System.out.println("Pekerjaan Utama: " + QuestionaireData.getPekerjaanUtama());
        System.out.println("Bidang Pekerjaan Utama: " + QuestionaireData.getBidangPekerjaanUtama());
        System.out.println("Tempat Usaha: " + QuestionaireData.getTempatUsaha());
        System.out.println("Banyak Pekerja Tetap: " + QuestionaireData.getBanyakPekerjaTetap());
        System.out.println("Contact Person: " + QuestionaireData.getContactPerson());
        System.out.println("Pencacah: " + QuestionaireData.getPencacah());
        System.out.println("Pengawas: " + QuestionaireData.getPengawas());
        System.out.println("Catatan: " + QuestionaireData.getCatatan());
        // Cetak atribut lainnya sesuai kebutuhan
    }

    @Override
    public void reset() {
        // Mereset semua atribut dalam objek QuestionaireData
        QuestionaireData.setStatusUsaha("");
        QuestionaireData.setGred("");
        QuestionaireData.setBadanUsaha("");
        QuestionaireData.setPekerjaanUtama("");
        QuestionaireData.setBidangPekerjaanUtama("");
        QuestionaireData.setTempatUsaha("");
        QuestionaireData.setBanyakPekerjaTetap(0);
        QuestionaireData.setContactPerson(null);
        QuestionaireData.setPencacah(null);
        QuestionaireData.setPengawas(null);
        QuestionaireData.setCatatan("");
        // Reset atribut lainnya sesuai kebutuhan
    }
}