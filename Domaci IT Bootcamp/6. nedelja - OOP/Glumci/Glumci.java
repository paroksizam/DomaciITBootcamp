package PetaNedeljaKlaseUvod.DomaciToString;

public class Glumci {

    /*Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime prikazati kao dve promenljive,
    pol kao karakter, godine kao integer, vasa ocena njih od 1 do 10 (sa decimalom) i
    da li je iz Srbije odgovorite preko booleana. Sve potrebno za glumca i glumicu da budu dva ispisa*/

    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private boolean mesto;

    public Glumci(String ime, String prezime, char pol, int godine, double ocena, boolean mesto) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
        this.ocena = ocena;
        this.mesto = mesto;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public boolean isMesto() {
        return mesto;
    }

    public void setMesto(boolean mesto) {
        this.mesto = mesto;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime: ");
        sb.append(ime);
        sb.append("\n");

        sb.append("Prezime: ");
        sb.append(prezime);
        sb.append("\n");

        sb.append("Pol: ");
        sb.append(pol);
        sb.append("\n");

        sb.append("Godine: ");
        sb.append(godine);
        sb.append("\n");

        sb.append("Ocena: ");
        sb.append(ocena);
        sb.append("\n");

        sb.append("Da li je iz Srbije: ");
        sb.append(mesto);
        sb.append("\n");

        return sb.toString();
    }

}
