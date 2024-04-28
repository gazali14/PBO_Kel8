/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisionerudpk;

/**
 *
 * @author U53R
 */
public class ValidatorQuestionaireData implements Validator {
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
