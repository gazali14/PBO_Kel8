/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisionerudpk;

/**
 *
 * @author U53R
 */
public class KIP {
    private String kodeKIP;
    private Validator validasi;

    public KIP() {
        validasi = new ValidatorKIP(this);
    }

    // Getter dan setter untuk semua atribut
    public String getKodeKIP() {
        return kodeKIP;
    }

    public void setKodeKIP(String kodeKIP) {
        this.kodeKIP = kodeKIP;
        
    }

    public boolean getValidasi() throws ValidatorException {
        return validasi.validate();
    }
}

