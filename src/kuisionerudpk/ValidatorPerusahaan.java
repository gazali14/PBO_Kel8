/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisionerudpk;

import java.util.regex.Pattern;

/**
 *
 * @author U53R
 */
public class ValidatorPerusahaan implements Validator {
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
        if (!isValidString(perusahaan.getNamaPengusaha()) || !perusahaan.getNamaPengusaha().matches("[a-zA-Z ]+")) {
            throw new ValidatorException("Nama pengusaha tidak boleh kosong atau berisi angka");
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
