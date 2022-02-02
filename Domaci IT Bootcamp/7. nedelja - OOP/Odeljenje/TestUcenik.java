package PetaNedeljaKlaseUvod.DomaciArrayList.Odeljenje;

import java.util.ArrayList;

public class TestUcenik {
    public static void main(String[] args) {

        ArrayList<Double> oceneMarija = new ArrayList<>();
        Ucenik Marija = new Ucenik("Marija", "Stanisic", oceneMarija);
        oceneMarija.add(5.0);
        oceneMarija.add(3.0);
        oceneMarija.add(2.0);
        System.out.println(Marija);
        System.out.println("Prosek ocena je: " + Marija.prosek() + "\n");

        //ArrayList<Double> oceneJovana = new ArrayList<>();
        Ucenik Jovana = new Ucenik("Jovana", "Petrovic");
        System.out.println(Jovana);



    }
}
