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

public interface Validator {
    boolean validate() throws ValidatorException;
    boolean save();
    void print();
    void reset();
}