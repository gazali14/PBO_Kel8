package kuisionerudpk;

import java.util.regex.Pattern;

/**
 *
 * @author Kelompok 8
    Briel Sevtriobragi Sihaloho (222212539)
    Dewi Nurihandayani (222212564)
    Fickry Atmayoga Wienaldi (222212610)
    La Ode Muhammad Gazali (222212696)
 * 
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
        if (!isValidString(perusahaan.getNamaPerusahaan()) || !perusahaan.getNamaPerusahaan().matches("[a-zA-Z ]+")) {
            throw new ValidatorException("Nama perusahaan tidak boleh kosong atau berisi angka");
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
        if (!isValidString(perusahaan.getKodePos()) || !perusahaan.getKodePos().matches("[123456789][0-9]*") 
                || !(perusahaan.getKodePos().length() == 5 )){
            throw new ValidatorException("Kode pos harus tediri dari 5 digit angka");
        }
        
        // Validasi untuk telepon
        if (!isValidString(perusahaan.getTelepon()) || !perusahaan.getTelepon().matches("[0][0-9]*")
                || !(perusahaan.getTelepon().length()>=11 && perusahaan.getTelepon().length()<=13)) {
            throw new ValidatorException("Nomor telepon terdiri dari 11-13 angka dan diawali dengan 0");
        }
        
        // Validasi untuk fax
        if (!isValidString(perusahaan.getFax()) || !perusahaan.getFax().matches("[0-9]*")
                || !(perusahaan.getFax().length()>=8 && perusahaan.getFax().length()<=15)) {
            throw new ValidatorException("Nomor fax terdiri dari 8-15 angka");
        }
        
        // Validasi untuk nomor HP
        if (!isValidString(perusahaan.getNoHP()) || !perusahaan.getNoHP().matches("[0][0-9]*")
                || !(perusahaan.getNoHP().length()>=11 && perusahaan.getNoHP().length()<=13)) {
            throw new ValidatorException("Nomor HP terdiri dari 11-13 angka dan diawali dengan 0");
        }
        
        // Validasi untuk provinsi
        if (!isValidString(perusahaan.getProvinsi()) || !perusahaan.getProvinsi().matches("[a-zA-Z ]+")) {
            throw new ValidatorException("Provinsi tidak valid");
        }
        
        // Validasi untuk kode provinsi
        if (!isValidString(perusahaan.getKodeProv()) || !perusahaan.getKodeProv().matches("[123456789][1-9]*")
                || !(perusahaan.getKodeProv().length()==2)) {
            throw new ValidatorException("Kode provinsi terdiri dari dua digit tanpa angka 0");
        }
        
        // Validasi untuk kabupaten
        if (!isValidString(perusahaan.getKabupaten()) || !perusahaan.getKabupaten().matches("[a-zA-Z ]+")) {
            throw new ValidatorException("Kabupaten tidak valid");
        }
        
        // Validasi untuk kode kabupaten
        if (!isValidString(perusahaan.getKodeKab()) || !perusahaan.getKodeKab().matches("[0127][0-9]*") 
                || !(perusahaan.getKodeKab().length()==2)) {
            throw new ValidatorException("Kode kabupaten terdiri dari dua digit diawali angka 0, 1, 2, atau 7");
        }
        
        // Validasi untuk kecamatan
        if (!isValidString(perusahaan.getKecamatan()) || !perusahaan.getKecamatan().matches("[a-zA-Z ]+")) {
            throw new ValidatorException("Kecamatan tidak valid");
        }
        
        // Validasi untuk kode kecamatan
        if (!isValidString(perusahaan.getKodeKec()) || !perusahaan.getKodeKec().matches("[123456789][0-9]*") 
                || !(perusahaan.getKodeKec().length()==3)) {
            throw new ValidatorException("Kode kecamatan terdiri dari tiga digit");
        }
        
        // Validasi untuk desa
        if (!isValidString(perusahaan.getDesa()) || !perusahaan.getDesa().matches("[a-zA-Z ]+")) {
            throw new ValidatorException("Desa tidak valid");
        }
        
        // Validasi untuk kode desa
        if (!isValidString(perusahaan.getKodeDes()) || !perusahaan.getKodeDes().matches("[123456789][0-9]*") 
                || !(perusahaan.getKodeDes().length()==3)) {
            throw new ValidatorException("Kode desa terdiri dari tiga digit");
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
        // Mencetak informasi perusahaanSystem.out.println("Nama Perusahaan: " + perusahaan.getNamaPerusahaan());
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
