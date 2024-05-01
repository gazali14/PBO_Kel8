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

public class KIP {
    private String kodeKIP;
    Validator validasi;

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

