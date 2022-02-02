package PetaNedeljaKlaseUvod.DomaciArrayList;

import PetaNedeljaKlaseUvod.Osoba;

import java.util.ArrayList;

public class Putovanje {

    /*Napisati klasu Putovanje koja ima sledeca polja/atribute:
            - destinacija(Grad)
	- vodjaPuta (Osoba)
	- vozilo (Automobil) - ovo polje se odnosi na automobil kojim se ide na putovanje
	- udaljenostUKm (double)
	- prijavljeneOsobe (arrayList)
    udaljenostUKm ne sme biti negativna. Ispisati poruku o gresci ako korisnik pokusa da napravi Putovanje sa
    negativnom udaljenoscu.Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje udaljenostUKm na negativno.
    Napisati sledece metode:
            2 konstruktora -> vodja puta ne mora da postoji, u oba konstruktora ne treba slati niz prijavljeneOsobe,
            vec u oba konstruktora ovaj niz napravite kao prazan
    gettere settere
    toString metodu koristeci StringBuilder
    format
    Destincija: <ImeGrada, ImeDrzave>
    Vodja puta je: <ime i prezime vodje puta ako postoji, 'putovanje nema vodju puta' ako vodja puta nije postavljen (null)>
    Putuje se automobilom: <marka, godinaProizvodnje, kilometraza>
    Udaljenost do destinacije u kilometrima je: <udaljenostUKm>
    Prijavljene osobe:
		<ime> <prezime>*/

    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostUKm;
    private ArrayList<Osoba> prijavljeneOsobe;

    /*public void proveraNegativnogUnosa(double udaljenostUKm){
        if(udaljenostUKm <= 0){
            System.out.println("Unos ne moze biti 0 ili manje od 0.");
        }else{
            this.udaljenostUKm = udaljenostUKm;
        }
    }*/

    public Putovanje(Grad destinacija, Osoba vodjaPuta, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        if(udaljenostUKm <= 0){
            System.out.println("Unos ne moze biti 0 ili manje od 0.");
        }else{
            this.udaljenostUKm = udaljenostUKm;
        }
        this.prijavljeneOsobe = new ArrayList<Osoba>();
        //proveraNegativnogUnosa(udaljenostUKm);
    }

    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        if(udaljenostUKm <= 0){
            System.out.println("Unos ne moze biti 0 ili manje od 0.");
        }else{
            this.udaljenostUKm = udaljenostUKm;
        }
        this.prijavljeneOsobe = new ArrayList<>();
        //proveraNegativnogUnosa(udaljenostUKm);
    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public Automobil getVozilo() {
        return vozilo;
    }

    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }

    public double getUdaljenostUKm() {
        return udaljenostUKm;
    }

    public void setUdaljenostUKm(double udaljenostUKm) {
        if(udaljenostUKm <= 0){
            System.out.println("Unos ne moze biti 0 ili manje od 0.");
        }else{
            this.udaljenostUKm = udaljenostUKm;
        }
    }

    public ArrayList<Osoba> getPrijavljeneOsobe() {
        return prijavljeneOsobe;
    }

    public void setPrijavljeneOsobe(ArrayList<Osoba> prijavljeneOsobe) {
        this.prijavljeneOsobe = prijavljeneOsobe;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Destinacija: ");
        sb.append(destinacija.getIme());
        sb.append(", ");
        sb.append(destinacija.getDrzava());
        sb.append("\n");


        if(vodjaPuta == null){
            System.out.println("Putovanje nema vodju puta.");
        }else{
            sb.append("Vodja puta je: ");
            sb.append(vodjaPuta.getIme());
            sb.append(" ");
            sb.append(vodjaPuta.getPrezime());
        }
        sb.append("\n");

        sb.append("Putuje se automobilom: ");
        sb.append(vozilo.getMarka());
        sb.append(", ");
        sb.append(vozilo.getGodiste());
        sb.append(", ");
        sb.append(vozilo.getKilometraza());
        sb.append("\n");

        sb.append("Udaljenost u kilometrima je: ");
        sb.append(udaljenostUKm);
        sb.append("\n");

        sb.append("Prijavljene osobe: ");
        for(Osoba osoba : prijavljeneOsobe){
            sb.append("\n");
            sb.append(osoba.getIme());
            sb.append(" ");
            sb.append(osoba.getPrezime());
        }

        return sb.toString();
    }
    /*napisati i metodu koja racuna koliko je vremena potrebno da se stigne na destinaciju pri odredjenoj prosecnoj
    brzini. Dakle metoda treba da primi argument koji kaze koliko kilometra na sat (double) ce biti prosecna brzina
    automobila, a da vrati koliko ce sati biti potrebno da se dodje do destinacije ako se auto bude vozio
    tom prosecnom brzinom.
    napisati metodu prijava, koja prima kao argument osobu koja se prijavljuje na putovanje
    napisati metodu odjava, koja prima kao argument osobu koja se odjavljjuje sa putovanja (opciono)*/

    public double vremePutovanja(double brzina){
        double vreme = udaljenostUKm / brzina;
        return vreme;
    }

    public void prijavaPutnika(Osoba x){
        prijavljeneOsobe.add(x);
    }

    public void odjavaPutnika(Osoba x){
        prijavljeneOsobe.remove(x);
    }

}
