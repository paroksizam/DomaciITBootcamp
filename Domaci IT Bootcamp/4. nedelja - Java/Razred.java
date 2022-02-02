package Pauza1Domaci;

import java.util.Scanner;

public class RazredZadatak8 {
    public static void main(String[] args) {

        /*Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
        "Dobrodosao u {x}. razred, {ime} {prezime}",
                pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda.
                A ako korisnik nije djak ispisati jednu odgovarajucu
        poruku od:
        "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"*/

        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite Vase ime: ");
        String ime = sc.next();

        System.out.print("Unesite Vase prezime: ");
        String prezime = sc.next();

        System.out.print("Unesite godinu Vaseg rodjenja: ");
        int godina = sc.nextInt();

        if (godina >= 2015) {
                System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje.");
            } else if (godina <= 2014 && godina >= 2003) {
                System.out.println("Dobrodosli u " + ((2021-godina)-6) + ". razred.");
            } else{
                System.out.println(ime + " " + prezime + " je zavrsio/la skolu.");
            }
        }
    }
