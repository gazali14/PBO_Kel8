/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisionerudpk;

/**
 *
 * @author U53R
 */
public class BanyakPekerja {
    private Perusahaan perusahaan;
    private int jmlPekerjaLaki;
    private int jmlPekerjaPerempuan;

    public BanyakPekerja() {
        // Constructor default
    }

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }

    public int getJmlPekerjaLaki() {
        return jmlPekerjaLaki;
    }

    public void setJmlPekerjaLaki(int jmlPekerjaLaki) {
        this.jmlPekerjaLaki = jmlPekerjaLaki;
    }

    public int getJmlPekerjaPerempuan() {
        return jmlPekerjaPerempuan;
    }

    public void setJmlPekerjaPerempuan(int jmlPekerjaPerempuan) {
        this.jmlPekerjaPerempuan = jmlPekerjaPerempuan;
    }

    public int getTotal() {
        return jmlPekerjaLaki + jmlPekerjaPerempuan;
    }
}

