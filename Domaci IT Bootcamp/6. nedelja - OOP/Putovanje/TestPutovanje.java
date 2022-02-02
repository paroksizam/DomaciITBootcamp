package PetaNedeljaKlaseUvod.DomaciArrayList;

import PetaNedeljaKlaseUvod.Osoba;

public class TestPutovanje {
    public static void main(String[] args) {

        /*Napisati i test program koji pravi nekoliko gradova i nekoliko automobila i nekoliko osoba,
        i onda napravite neka putovanja u neke od tih gradova, sa nekim od tih automobila i vodja puta,
        i onda prijavite neke od osoba na neka od putovanja, i onda pozovite i metodu za racunanje
        koliko je vremena potrebno da se stigne pri odredjenoj brzini.*/

        Grad prviGrad = new Grad("Berlin", 16000256, "Nemacka");
        Grad drugiGrad = new Grad("Malaga", 5632589, "Spanija");

        Automobil prviAuto = new Automobil("Fiat", "Italija", 1982, 10252.5);
        Automobil drugiAuto = new Automobil("Renault", "Francuska", 2016, 2561.6);

        Osoba putnik2 = new Osoba("Zorana", "Stojanovic", 1994, 160);
        Osoba putnik1 = new Osoba("Marija", "Stanisic", 1995, 158);

        Putovanje prvoPutovanje = new Putovanje(prviGrad, prviAuto, 2365);
        prvoPutovanje.prijavaPutnika(putnik1);
        prvoPutovanje.prijavaPutnika(putnik2);
        System.out.println(prvoPutovanje);
        System.out.println("Vreme putovanja je: " + prvoPutovanje.vremePutovanja(120));
        System.out.println();

        Putovanje drugoPutovanje = new Putovanje(drugiGrad, putnik2, drugiAuto, -9);
        drugoPutovanje.prijavaPutnika(putnik1);
        drugoPutovanje.prijavaPutnika(putnik2);
        System.out.println(drugoPutovanje);
        System.out.println("Vreme putovanja je: " + prvoPutovanje.vremePutovanja(90));
    }
}
