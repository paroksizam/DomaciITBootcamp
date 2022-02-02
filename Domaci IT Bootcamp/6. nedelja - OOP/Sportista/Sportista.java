package PetaNedeljaKlaseUvod.Domaci;

public class Sportista {

    /*sport - Napisati klasu Sportista. Sportista ima
1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
            4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi.
    Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta)
    sve tipove metoda napisanih u klasi Sportista.*/

    private String imePrezime;
    private String sport;
    private String klub;
    private int dres;

    public Sportista(String imePrezime, String sport, String klub, int dres) {
        this.imePrezime = imePrezime;
        this.sport = sport;
        this.klub = klub;
        this.dres = dres;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }

    public int getDres() {
        return dres;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public void setDres(int dres) {
        this.dres = dres;
    }
}
