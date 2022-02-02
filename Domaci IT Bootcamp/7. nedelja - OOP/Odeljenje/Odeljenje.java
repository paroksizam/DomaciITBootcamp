package PetaNedeljaKlaseUvod.DomaciArrayList.Odeljenje;

import java.util.ArrayList;

public class Odeljenje {

    /*Napisati klasu Odeljenje koja ima sledeca polja:
            - String oznaka
	- ArrayList dnevnik

    Napisati 2 konstruktora, opet na isti nacin.
    Napisati gettere i settere za sva polja.*/

    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<Ucenik>();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    /*Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.
    Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}
    Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.
    Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.
    Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.
    Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
    Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.
    Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
    Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).*/

    public void upisiUcenika(Ucenik u){
        dnevnik.add(u);
    }

    public void upisiUcenika(Ucenik u, int i){
        dnevnik.add(i, u);
    }

    public void ispisiUcenika(Ucenik u){
        dnevnik.remove(u);
    }

    public void ispisiUcenika(int i){
        dnevnik.remove(i);
    }

    public void pogledajOcene(Ucenik u){
        System.out.println(u.getOcene());
    }


    public void pogledajOcene(int i){
        System.out.println(dnevnik.get(i).getOcene());
    }

    public void prosecnaOcena(Ucenik u){
        System.out.println(u.prosek());
    }

    public void prosecnaOcena(int i){
        System.out.println(dnevnik.get(i).prosek());
    }

    public double prosecnaOcenaOdeljenja(){
        double suma = 0;
        for(Ucenik u : dnevnik){
            suma = suma + u.prosek();
        }
        double prosekOdeljenja = suma / dnevnik.size();
        return prosekOdeljenja;
    }

    /*Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
            - "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
	- "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
            - "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
            - "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
            - "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu*/

    public void opisnaOcena(Ucenik u){
        //fali petlja da proveri u nizu ocena da li ima jedinice
        if(u.prosek() >= 4.5){
            System.out.println("Odlican");
        }else if(u.prosek() >= 3.5){
            System.out.println("Vrlo dobar");
        }else if(u.prosek() >= 2.5){
            System.out.println("Dobar");
        }else if(u.prosek() >= 1.5){
            System.out.println("Dovoljan");
        }else{
            System.out.println("Nedovoljan");
        }
    }

    /*Napisati metod izlistajDnevnik() koja vraca String oblika:
    {ime} i {prezime} ima ocene:
    {ocene}
    za sve ucenike.*/

    public String izlistajDnevnik() {
        StringBuilder sb = new StringBuilder();
        for (Ucenik u : dnevnik) {
            sb.append(u.getIme());
            sb.append(" ");
            sb.append(u.getPrezime());
            sb.append(" ima ocene:");
            sb.append("\n");
            sb.append(u.getOcene());
            sb.append("\n");
        }
        return sb.toString();
    }

    /*Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
            - "Veliko odeljenje"; ako ima vise od 25 ucenika
	- "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
            - "Malo odeljenje"; ako ima ucenika manje od 15*/

    public String velicinaOdeljenja(){
        StringBuilder sb = new StringBuilder();
        if(dnevnik.size() > 25){
            sb.append("Veliko odeljenje");
        }else if(dnevnik.size() > 15){
            sb.append("Srednje odeljenje");
        }else{
            sb.append("Malo odeljenje");
        }
        return sb.toString();
    }

    /*Napisati toString() metod:
    {Oznaka} odeljenja ima djake:
    {Ime1} {Prezime1}
    {Ime2} {Prezime2}*/

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka);
        sb.append(" odeljenje ima djake:");
        sb.append("\n");
        for (Ucenik u : dnevnik){
            sb.append(u.getIme());
            sb.append(" ");
            sb.append(u.getPrezime());
            sb.append("\n");
        }

        return sb.toString();
    }

}
