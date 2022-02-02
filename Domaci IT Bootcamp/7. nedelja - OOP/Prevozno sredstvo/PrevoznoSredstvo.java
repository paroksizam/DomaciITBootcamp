package SestaNedelja.Domaci27_12.PrevoznoSredstvoDomaci;

public abstract class PrevoznoSredstvo {

    /*Napisati klasu PrevoznoSredstvo sa sledecim atributima
    godinaPoizvodnje int
    zemljaPoizvodnje String
    marka string
    U svakoj klasi napisati konstruktor, getter, setter metode.
    toString ne treba
    U svakoj klasi napisati metodu sirena koja ispisuje:
            - automobil - "pip pip"
            - autobus - "dum dum"
            - voz - "cu cu"
            - PrevoznoSredstvo - nista*/

    protected int godinaProizvodnje;
    protected String zemljaProizvodnja;
    protected String marka;

    public PrevoznoSredstvo(int godinaProizvodnje, String zemljaProizvodnja, String marka) {
        this.godinaProizvodnje = godinaProizvodnje;
        this.zemljaProizvodnja = zemljaProizvodnja;
        this.marka = marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getZemljaProizvodnja() {
        return zemljaProizvodnja;
    }

    public void setZemljaProizvodnja(String zemljaProizvodnja) {
        this.zemljaProizvodnja = zemljaProizvodnja;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public abstract void sirena();

}
