package PetaNedeljaKlaseUvod.DomaciArrayList.Odeljenje;

import java.util.ArrayList;

public class TestOdeljenje {
    public static void main(String[] args) {

        ArrayList<Double> oceneMarija = new ArrayList<>();
        oceneMarija.add(5.0);
        oceneMarija.add(3.0);
        oceneMarija.add(4.0);
        ArrayList<Double> oceneJovana = new ArrayList<>();
        oceneJovana.add(4.0);
        oceneJovana.add(3.0);
        oceneJovana.add(4.0);
        Ucenik Marija = new Ucenik("Marija", "Stanisic", oceneMarija);
        Ucenik Jovana = new Ucenik("Jovana", "Petrovic", oceneJovana);

        ArrayList<Ucenik> dnevnikIII2 = new ArrayList<>();
        dnevnikIII2.add(Marija);
        dnevnikIII2.add(Jovana);

        Odeljenje I1 = new Odeljenje("III2", dnevnikIII2);
        System.out.println(I1);
        I1.pogledajOcene(Marija);
        I1.prosecnaOcena(Marija);
        System.out.println(I1.prosecnaOcenaOdeljenja());
        I1.opisnaOcena(Marija);
        System.out.println(I1.izlistajDnevnik());
        System.out.println(I1.velicinaOdeljenja());


    }
}
