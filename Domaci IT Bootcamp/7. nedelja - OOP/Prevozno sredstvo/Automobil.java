package SestaNedelja.Domaci27_12.PrevoznoSredstvoDomaci;

public class Automobil extends PrevoznoSredstvo {

    /*Napisati klasu Automobil. Automobil je PrevoznoSredstvo koje pored atributa iz PrevoznoSredstvo ima i:
    tipMotora String
    kubikazaMotora int*/

    private String tipMotora;
    private int kubikazaMotora;

    public Automobil(int godinaProizvodnje, String zemljaProizvodnja, String marka, String tipMotora, int kubikazaMotora) {
        super(godinaProizvodnje, zemljaProizvodnja, marka);
        this.tipMotora = tipMotora;
        this.kubikazaMotora = kubikazaMotora;
    }

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
    }

    public int getKubikazaMotora() {
        return kubikazaMotora;
    }

    public void setKubikazaMotora(int kubikazaMotora) {
        this.kubikazaMotora = kubikazaMotora;
    }

    public void sirena(){
        System.out.println("pip pip");
    }

}
