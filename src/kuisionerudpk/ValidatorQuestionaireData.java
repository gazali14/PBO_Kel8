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
            if (!isValidString(questionaireData.getPekerjaanUtama()) || !questionaireData.getPekerjaanUtama().matches("[a-zA-Z ]+")) {
                throw new ValidatorException("Pekerjaan utama tidak boleh kosong atau mengandung angka");
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
            if(questionaireData.validationFlag == 1)
                if (!(questionaireData.getBanyakPekerjaTetap().getTotal() > 0)){
                    throw new ValidatorException("Banyak pekerja tetap harus lebih besar dari 0");
                }
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
        System.out.println("Perusahaan : " + questionaireData.getPerusahaan().getNamaPerusahaan());
        System.out.print("Status Usaha: ");
        switch(questionaireData.getStatusUsaha()) {
            case "1": System.out.println("Aktif Lama"); break;
            case "2": System.out.println("Aktif Baru"); break;
            case "3": System.out.println("Tutup"); break;
            case "4": System.out.println("Tidak Ditemukan"); break;
            case "5": System.out.println("Bukan Konstruksi"); break;
        }
        if (questionaireData.getStatusUsaha().equals("1") || questionaireData.getStatusUsaha().equals("2"))
        {
            System.out.println("Gred: " + questionaireData.getGred());
            System.out.print("Badan Hukum/Badan Usaha: ");
            switch(questionaireData.getBadanUsaha()) {
                case "1": System.out.println("PT. Persero"); break;
                case "2": System.out.println("PT"); break;
                case "3": System.out.println("CV"); break;
                case "4": System.out.println("Firma"); break;
                case "5": System.out.println("Koperasi"); break;
                case "6": System.out.println("Perorangan"); break;
                case "7": System.out.println("Lainnya"); break;
            }
            System.out.println("Pekerjaan Utama: " + questionaireData.getPekerjaanUtama());
            System.out.print("Bidang Pekerjaan Utama: ");
            switch(questionaireData.getBidangPekerjaanUtama()) {
                case "1": System.out.println("Konstruksi Gedung"); break;
                case "2": System.out.println("Konstruksi Sipil"); break;
                case "3": System.out.println("Konstruksi Khusus"); break;
            }
            System.out.print("Tempat Usaha: ");
            switch(questionaireData.getTempatUsaha()) {
                case "1": System.out.println("Kantor"); break;
                case "2": System.out.println("Rumah Tinggal"); break;
                case "3": System.out.println("Rukan"); break;
                default : System.out.println("Lainnya : " + questionaireData.getTempatUsaha()); break;
            }
            System.out.println("Banyak Pekerja Tetap: " + questionaireData.getBanyakPekerjaTetap().getTotal());

        }
        System.out.println("Contact Person: " + questionaireData.getContactPerson());
        System.out.println("Pencacah: " + questionaireData.getPencacah());
        System.out.println("Pengawas: " + questionaireData.getPengawas());
        System.out.println("Catatan: " + questionaireData.getCatatan());
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
