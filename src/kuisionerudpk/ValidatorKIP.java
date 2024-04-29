/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisionerudpk;

/**
 *
 * @author U53R
 */
public class ValidatorKIP implements Validator {
    private KIP kip;    //Objek KIP yang akan divalidasi

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
        
        if (!(kip.getKodeKIP().matches("[1-9]*") && kip.getKodeKIP().length() == 9)){
            throw new ValidatorException("Kode KIP Harus Berisi Angka 9 Digit");
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
