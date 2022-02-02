package PetaNedeljaKlaseUvod.DomaciArrayList;

import PetaNedeljaKlaseUvod.DomaciArrayList.Automobil;

import java.util.Scanner;

public class AutomobilTest {
    public static void main(String[] args) {

        //Napisati klasu Automobil, koja treba da ima sledece atribure: marka, zemljaProizvodnje, godiste, kilometrzu.
        //Napisati test program u kome treba napraviti 2 automobila, i ispisati ih na izlaz

        Scanner sc = new Scanner (System.in);

        Automobil prvi = new Automobil ("Fiat", "Italija", 1982, 10252.5);
        System.out.println(prvi.getMarka());
        System.out.println(prvi.getZemljaProizvodnje());
        System.out.println(prvi.getGodiste());
        System.out.println(prvi.getKilometraza());

        Automobil drugi = new Automobil("Renault", "Francuska", 2016, 2561.6);
        System.out.println(drugi.getMarka());
        System.out.println(drugi.getZemljaProizvodnje());
        System.out.println(drugi.getGodiste());
        System.out.println(drugi.getKilometraza());

        System.out.print("Unesite marku automobila: ");
        String marka = sc.next();

        System.out.print("Unesite zemlju proizvodnje automobila: ");
        String zemlja = sc.next();

        System.out.print("Unesite godiste automobila: ");
        int godiste = sc.nextInt();

        System.out.print("Unesite kilometrazu automobila: ");
        double kilometraza = sc.nextDouble();

        Automobil treci = new Automobil (marka, zemlja, godiste, kilometraza);

        System.out.println("Marka automobila je " + treci.getMarka());
        System.out.println("Zemlja proizvodnje automobila je " + treci.getZemljaProizvodnje());
        System.out.println("Godiste automobila je " + treci.getGodiste());
        System.out.println("Kilometraza automobila je " + treci.getKilometraza());

    }
}
