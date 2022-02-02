package PetaNedeljaKlaseUvod.DomaciToString;

import PetaNedeljaKlaseUvod.Osoba;

public class TestKnjiga {
    public static void main(String[] args) {

        //Napisati i test program, gde je potrebno napraviti 2-3 osobe, i 2-3 knjige. Ispisati osobe, ispisati knjige.
        //Ispisati koje su velicine knjiga

        Osoba osobaVlasnik1 = new Osoba("Marija", "Stanisic", 1995, 158);
        Osoba osobaVlasnik2 = new Osoba("Zorana", "Stojanovic", 1994, 160);
        Osoba osobaAutor1 = new Osoba("Simon", "De Bovoar", 1908, 165);
        Knjiga knjigaPrva = new Knjiga("Drugi pol 2", osobaAutor1,osobaVlasnik1,66,1983);
        Knjiga knjigaDruga = new Knjiga("Drugi pol", osobaAutor1, 625, 1982);

        System.out.println(osobaVlasnik1);
        System.out.println(osobaVlasnik2);
        System.out.println(osobaAutor1);
        System.out.println(knjigaPrva);
        System.out.println(knjigaDruga);
        System.out.println("Prva knjiga je " + knjigaPrva.velicinaKnjige());
        System.out.println("Druga knjiga je " + knjigaDruga.velicinaKnjige());

    }
}
