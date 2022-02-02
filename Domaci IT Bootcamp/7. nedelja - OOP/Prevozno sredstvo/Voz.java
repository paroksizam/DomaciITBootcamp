package SestaNedelja.Domaci27_12.PrevoznoSredstvoDomaci;

public class Voz extends PrevoznoSredstvo{

    /*Napisati klasu voz. Voz je PrevoznoSredstvo koje pored atributa iz PrevoznoSredstvo ima i:
    broj vagona int*/

    private int brojVagona;

    public Voz(int godinaProizvodnje, String zemljaProizvodnja, String marka, int brojVagona) {
        super(godinaProizvodnje, zemljaProizvodnja, marka);
        this.brojVagona = brojVagona;
    }

    public int getBrojVagona() {
        return brojVagona;
    }

    public void setBrojVagona(int brojVagona) {
        this.brojVagona = brojVagona;
    }

    public void sirena(){
        System.out.println("cu cu");
    }

}
