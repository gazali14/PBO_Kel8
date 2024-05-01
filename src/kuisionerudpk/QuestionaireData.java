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
    private Field<Perusahaan> perusahaan;
    private Field<KIP> kip;
    private Field<String> statusUsaha;
    private Field<String> gred;
    private Field<String> badanUsaha;
    private Field<String> pekerjaanUtama;
    private Field<String> bidangPekerjaanUtama;
    private Field<String> tempatUsaha;
    private Field<BanyakPekerja> banyakPekerjaTetap;
    private Field<ContactPerson> contactPerson;
    private Field<Pencacah> pencacah;
    private Field<Pengawas> pengawas;
    private Field<String> catatan;
    public Validator validasi;

    public QuestionaireData() {
        validasi = new ValidatorQuestionaireData(this);
        perusahaan = new Field<>();
        kip = new Field<>();
        statusUsaha = new Field<>();
        gred = new Field<>();
        badanUsaha = new Field<>();
        pekerjaanUtama = new Field<>(); 
        bidangPekerjaanUtama = new Field<>();
        tempatUsaha = new Field<>();
        banyakPekerjaTetap = new Field<>();
        contactPerson = new Field<>();
        pencacah = new Field<>();
        pengawas = new Field<>();
        catatan = new Field<>();
    }

    public Perusahaan getPerusahaan() {
        return perusahaan.getE();
    }

    public void setPerusahaan(Perusahaan perusahaan) {
        this.perusahaan.setE(perusahaan);
    }

    public KIP getKip() {
        return kip.getE();
    }

    public void setKip(KIP kip) {
        this.kip.setE(kip);
    }

    public String getStatusUsaha() {
        return statusUsaha.getE();
    }

    public void setStatusUsaha(String statusUsaha) {
        this.statusUsaha.setE(statusUsaha);
    }

    public String getGred() {
        return gred.getE();
    }

    public void setGred(String gred) {
        this.gred.setE(gred);
    }

    public String getBadanUsaha() {
        return badanUsaha.getE();
    }

    public void setBadanUsaha(String badanUsaha) {
        this.badanUsaha.setE(badanUsaha);
    }

    public String getPekerjaanUtama() {
        return pekerjaanUtama.getE();
    }

    public void setPekerjaanUtama(String pekerjaanUtama) {
        this.pekerjaanUtama.setE(pekerjaanUtama);
    }

    public String getBidangPekerjaanUtama() {
        return bidangPekerjaanUtama.getE();
    }

    public void setBidangPekerjaanUtama(String bidangPekerjaanUtama) {
        this.bidangPekerjaanUtama.setE(bidangPekerjaanUtama);
    }

    public String getTempatUsaha() {
        return tempatUsaha.getE();
    }

    public void setTempatUsaha(String tempatUsaha) {
        this.tempatUsaha.setE(tempatUsaha);
    }

    public BanyakPekerja getBanyakPekerjaTetap() {
        return banyakPekerjaTetap.getE();
    }

    public void setBanyakPekerjaTetap(BanyakPekerja banyakPekerjaTetap) {
        this.banyakPekerjaTetap.setE(banyakPekerjaTetap);
    }

    public ContactPerson getContactPerson() {
        return contactPerson.getE();
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson.setE(contactPerson);
    }

    public Pencacah getPencacah() {
        return pencacah.getE();
    }

    public void setPencacah(Pencacah pencacah) {
        this.pencacah.setE(pencacah);
    }

    public Pengawas getPengawas() {
        return pengawas.getE();
    }

    public void setPengawas(Pengawas pengawas) {
        this.pengawas.setE(pengawas);
    }

    public String getCatatan() {
        return catatan.getE();
    }

    public void setCatatan(String catatan) {
        this.catatan.setE(catatan);
    }

    public Validator getValidasi() {
        return validasi;
    }

    public void setValidasi(Validator validasi) {
        this.validasi = validasi;
    }
    
    
}

