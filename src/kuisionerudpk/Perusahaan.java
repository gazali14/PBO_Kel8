/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisionerudpk;

/**
 *
 * @author U53R
 */
public class Perusahaan {
    private String namaPerusahaan;
    private String namaPengusaha;
    private String alamat;
    private String kodePos;
    private String telepon;
    private String fax;
    private String noHP;
    private String provinsi;
    private String kodeProv;
    private String kabupaten;
    private String kodeKab;
    private String kecamatan;
    private String kodeKec;
    private String desa;
    private String kodeDes;
    private String email;
    public Validator validasi;

    public Perusahaan() {
        validasi = new ValidatorPerusahaan(this);
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getNamaPengusaha() {
        return namaPengusaha;
    }

    public void setNamaPengusaha(String namaPengusaha) {
        this.namaPengusaha = namaPengusaha;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKodeProv() {
        return kodeProv;
    }

    public void setKodeProv(String kodeProv) {
        this.kodeProv = kodeProv;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getKodeKab() {
        return kodeKab;
    }

    public void setKodeKab(String kodeKab) {
        this.kodeKab = kodeKab;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKodeKec() {
        return kodeKec;
    }

    public void setKodeKec(String kodeKec) {
        this.kodeKec = kodeKec;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getKodeDes() {
        return kodeDes;
    }

    public void setKodeDes(String kodeDes) {
        this.kodeDes = kodeDes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getValidasi() throws ValidatorException{
        return validasi.validate();
    }
}
