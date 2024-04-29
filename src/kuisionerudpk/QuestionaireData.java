/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisionerudpk;

/**
 *
 * @author U53R
 */
public class QuestionaireData {
    private Perusahaan perusahaan;
    private KIP kip;
    private String statusUsaha;
    private String gred;
    private String badanUsaha;
    private String pekerjaanUtama;
    private String bidangPekerjaanUtama;
    private String tempatUsaha;
    private int banyakPekerjaTetap;
    private ContactPerson contactPerson;
    private Pencacah pencacah;
    private Pengawas pengawas;
    private String catatan;
    private Validator validasi;

    public QuestionaireData() {
        validasi = new ValidatorQuestionaireData(this);
    }

    // Getter dan setter untuk semua atribut
    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }

    public KIP getKip() {
        return kip;
    }

    public void setKip(KIP kip) {
        this.kip = kip;
    }

    public String getStatusUsaha() {
        return statusUsaha;
    }

    public void setStatusUsaha(String statusUsaha) {
        this.statusUsaha = statusUsaha;
    }

    public String getGred() {
        return gred;
    }

    public void setGred(String gred) {
        this.gred = gred;
    }

    public String getBadanUsaha() {
        return badanUsaha;
    }

    public void setBadanUsaha(String badanUsaha) {
        this.badanUsaha = badanUsaha;
    }

    public String getPekerjaanUtama() {
        return pekerjaanUtama;
    }

    public void setPekerjaanUtama(String pekerjaanUtama) {
        this.pekerjaanUtama = pekerjaanUtama;
    }

    public String getBidangPekerjaanUtama() {
        return bidangPekerjaanUtama;
    }

    public void setBidangPekerjaanUtama(String bidangPekerjaanUtama) {
        this.bidangPekerjaanUtama = bidangPekerjaanUtama;
    }

    public String getTempatUsaha() {
        return tempatUsaha;
    }

    public void setTempatUsaha(String tempatUsaha) {
        this.tempatUsaha = tempatUsaha;
    }

    public int getBanyakPekerjaTetap() {
        return banyakPekerjaTetap;
    }

    public void setBanyakPekerjaTetap(int banyakPekerjaTetap) {
        this.banyakPekerjaTetap = banyakPekerjaTetap;
    }

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Pencacah getPencacah() {
        return pencacah;
    }

    public void setPencacah(Pencacah pencacah) {
        this.pencacah = pencacah;
    }

    public Pengawas getPengawas() {
        return pengawas;
    }

    public void setPengawas(Pengawas pengawas) {
        this.pengawas = pengawas;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public Validator getValidasi() {
        return validasi;
    }
}

