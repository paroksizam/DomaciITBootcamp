package SestaNedelja.Domaci27_12.PrevoznoSredstvoDomaci;

public class Autobus extends PrevoznoSredstvo {

    /*Napisati klasu autobus. Autobus je PrevoznoSredstvo koje pored atributa iz PrevoznoSredstvo ima i:
    maksimalanBrojPutnika int*/

    private int maksimalanBrojPutnika;

    public Autobus(int godinaProizvodnje, String zemljaProizvodnja, String marka, int maksimalanBrojPutnika) {
        super(godinaProizvodnje, zemljaProizvodnja, marka);
        this.maksimalanBrojPutnika = maksimalanBrojPutnika;
    }

    public int getMaksimalanBrojPutnika() {
        return maksimalanBrojPutnika;
    }

    public void setMaksimalanBrojPutnika(int maksimalanBrojPutnika) {
        this.maksimalanBrojPutnika = maksimalanBrojPutnika;
    }

    public void sirena(){
        System.out.println("dum dum");
    }

}
