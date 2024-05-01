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

