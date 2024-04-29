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
    private QuestionaireData questionaireData; // Objek QuestionaireData yang akan divalidasi

    public ValidatorQuestionaireData(QuestionaireData questionaireData) {
        this.questionaireData = questionaireData;
    }

    @Override
    public boolean validate() throws ValidatorException {
        // Lakukan validasi untuk semua atribut QuestionaireData
        // Anda dapat menyesuaikan validasi sesuai kebutuhan
        
        // Contoh validasi untuk status usaha
        if (!(questionaireData.getStatusUsaha().matches("[12345]"))) {
            throw new ValidatorException("Status usaha harus antara 1-5");
        }
        
        if (questionaireData.getStatusUsaha().equals("1")|| questionaireData.getStatusUsaha().equals("2")) {
            // Contoh validasi untuk gred
            if (!(questionaireData.getGred().matches("[12345679]"))) {
                throw new ValidatorException("Gred harus salah satu dari 1,2,3,4,5,6,7, dan 9");
            }

            // Validasi untuk atribut badan usaha
            if (!(questionaireData.getBadanUsaha().matches("[1234567]"))) {
                throw new ValidatorException("Badan usaha harus antara 1-7");
            }

            // Validasi untuk atribut pekerjaan utama
            if (!isValidString(questionaireData.getPekerjaanUtama()) || !questionaireData.getPekerjaanUtama().matches("[a-zA-Z]+")) {
                throw new ValidatorException("Pekerjaan utama tidak boleh kosong");
            }

            // Validasi untuk atribut bidang pekerjaan utama
            if (!(questionaireData.getBidangPekerjaanUtama().matches("[123]"))) {
                throw new ValidatorException("Bidang pekerjaan utama harus antara 1-3");
            }

            // Validasi untuk atribut tempat usaha
            if (!(questionaireData.getTempatUsaha().matches("[1234]"))) {
                throw new ValidatorException("Tempat usaha harus antara 1-4");
            }

            // Validasi untuk atribut banyak pekerja tetap
            if (!(questionaireData.getBanyakPekerjaTetap().getTotal() <= 0)){
                throw new ValidatorException("Banyak pekerja tetap harus lebih besar dari 0");
            }

            // Validasi untuk atribut contact person
            if (questionaireData.getContactPerson() == null) {
                throw new ValidatorException("Contact person tidak boleh kosong");
            }

            // Validasi untuk atribut pencacah
            if (questionaireData.getPencacah() == null) {
                throw new ValidatorException("Pencacah tidak boleh kosong");
            }

            // Validasi untuk atribut pengawas
            if (questionaireData.getPengawas() == null) {
                throw new ValidatorException("Pengawas tidak boleh kosong");
        }

        // Validasi untuk atribut catatan

        // Jika semua validasi berhasil, kembalikan true
        }

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
        System.out.println("Status Usaha: " + questionaireData.getStatusUsaha());
        if (questionaireData.getStatusUsaha().equals("1") || questionaireData.getStatusUsaha().equals("2"))
        {
            System.out.println("Gred: " + questionaireData.getGred());
            System.out.println("Badan Usaha: " + questionaireData.getBadanUsaha());
            System.out.println("Pekerjaan Utama: " + questionaireData.getPekerjaanUtama());
            System.out.println("Bidang Pekerjaan Utama: " + questionaireData.getBidangPekerjaanUtama());
            System.out.println("Tempat Usaha: " + questionaireData.getTempatUsaha());
            System.out.println("Banyak Pekerja Tetap: " + questionaireData.getBanyakPekerjaTetap());
            System.out.println("Contact Person: " + questionaireData.getContactPerson());
            System.out.println("Pencacah: " + questionaireData.getPencacah());
            System.out.println("Pengawas: " + questionaireData.getPengawas());
            System.out.println("Catatan: " + questionaireData.getCatatan());
        // Cetak atribut lainnya sesuai kebutuhan
        }
    }

    @Override
    public void reset() {
        // Mereset semua atribut dalam objek QuestionaireData
        questionaireData.setStatusUsaha("0");
        questionaireData.setGred("0");
        questionaireData.setBadanUsaha("0");
        questionaireData.setPekerjaanUtama("");
        questionaireData.setBidangPekerjaanUtama("0");
        questionaireData.setTempatUsaha("0");
        questionaireData.setBanyakPekerjaTetap(null);
        questionaireData.setContactPerson(null);
        questionaireData.setPencacah(null);
        questionaireData.setPengawas(null);
        questionaireData.setCatatan("");
        // Reset atribut lainnya sesuai kebutuhan
    }
}
