/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisionerudpk;

/**
 *
 * @author Dewi Nurihandayani
 */
public class FormResponse {
    private QuestionaireData questionaireData;
    private Validator validasi;
    
    public FormResponse(){
}

    public QuestionaireData getQuestionaireData() {
        return questionaireData;
    }

    public void setQuestionaireData(QuestionaireData questionaireData) {
        this.questionaireData = questionaireData;
    }

    public Validator getValidasi() {
        return validasi;
    }

    public void setValidasi(Validator validasi) {
        this.validasi = validasi;
    }
    
    
}
