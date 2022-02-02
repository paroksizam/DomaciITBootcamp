package PetaNedeljaKlaseUvod.DomaciToString;

import PetaNedeljaKlaseUvod.Osoba;

public class Knjiga {

    //Napisati klasu Knjiga koja ima sledeca polja/atribute:

    private String nazivKnjige;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;

    public void proveraNegativnihUnosa(int brojStrana, int godinaIzdanja){
        if(brojStrana <= 0){
            System.out.println("Unos ne moze biti negativan broj.");
        }else{
            this.brojStrana = brojStrana;
        }
        if(godinaIzdanja <= 0){
            System.out.println("Unos ne moze biti negativan broj.");
        }else{
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public Knjiga(String nazivKnjige, Osoba autor, Osoba vlasnik, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.vlasnik = vlasnik;
        this.brojStrana = brojStrana;
        this.godinaIzdanja = godinaIzdanja;
        proveraNegativnihUnosa(brojStrana, godinaIzdanja);
    }

    public Knjiga(String nazivKnjige, Osoba autor, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.brojStrana = brojStrana;
        this.godinaIzdanja = godinaIzdanja;
        proveraNegativnihUnosa(brojStrana, godinaIzdanja);
    }

    //Broj strana i godina izadanje ne mogu biti negativni. Ispisati poruku o gresci ako korisnik pokusa
    //da napravi knjigu sa negativnim brojem strana ili godinom izdanja (u konstruktoru, jer se tamo 'pravi' knjiga).

    //Napisati 2 konstruktora. Knjiga ne mora imati vlasnika -> dakle jedan konstruktor gde se salje i ko je vlasnik,
    //drugi konstruktor gde se ne salje ko je vlasnik

    //Napisati metode getter, setter, toString i velicinaKnjige

    //Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje neku od ove dve vrednosti na negativno.

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        if(brojStrana <= 0){
            System.out.println("Unos ne moze biti negativan broj.");
        }else{
            this.brojStrana = brojStrana;
        }
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if(godinaIzdanja <= 0){
            System.out.println("Unos ne moze biti negativan broj.");
        }else{
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv knjige je: ");
        sb.append(nazivKnjige);
        sb.append("\n");

        if(autor == null){
            sb.append("Nepoznato.");
            sb.append("\n");
        }else {
            sb.append(autor.toString());
        }

        if(vlasnik == null){
            sb.append("Knjiga nema vlasnika.");
            sb.append("\n");
        }else {
            sb.append(vlasnik.toString());
        }

        sb.append("Broj strana: ");
        sb.append(brojStrana);
        sb.append("\n");

        sb.append("Godina izdanja: ");
        sb.append(godinaIzdanja);
        sb.append("\n");

        return sb.toString();
    }

    public String velicinaKnjige(){
        String velicina = " ";
        if(brojStrana <= 100){
            velicina = "mala knjiga";
        }else if(brojStrana >= 101 && brojStrana <= 300){
            velicina = "srednje velika knjiga";
        }else if(brojStrana >= 301 && brojStrana <= 600){
            velicina = "velika knjiga";
        }else if(brojStrana >= 601){
            velicina = "bas velika knjiga";
        }
        return velicina;
    }
}
