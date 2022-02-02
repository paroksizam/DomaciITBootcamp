package PetaNedeljaKlaseUvod.DomaciArrayList.Odeljenje;

import java.util.ArrayList;

public class Ucenik {

    /*Napisati klasu Ucenik koja ima sledeca polja:
            - String ime
	- String prezime
	- ArrayList ocene

    Napisati 2 konstruktora, jedan koji prima argumente za sva polja, a drugi koji prima ime i prezime,
    a ocene postavlja na praznu listu.
    Napisati gettere i settere za sva polja.
            Napisati toString() metod:
    {ime} i {prezime} ima ocene:
    {ocene}
    Napisati metod proske koji racuna prosek Ucenika.*/

    private String ime;
    private String prezime;
    private ArrayList<Double> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Double> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<Double>();
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

    public ArrayList<Double> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Double> ocene) {
        this.ocene = ocene;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        if(ocene.isEmpty()){
            sb.append(" jos uvek nema ocene");
        }else{
            sb.append(" ima ocene:");
            sb.append("\n");
            for(double ocene : ocene) {
                sb.append(ocene);
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    public double prosek(){
        double suma = 0;
        for(Double o : ocene){
            suma = suma + o;
        }
        double prosek = suma / ocene.size();

        return prosek;
    }

}

