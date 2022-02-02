package CetvrtaNedelja17_12Domaci;

import java.util.Scanner;

public class NizImenaZadatak42 {
    public static void main(String[] args) {

        //Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite duzinu niza: ");
        String [] niz = new String [sc.nextInt()];

        System.out.println("Unesite imena kao elemente niza: ");
        for(int i = 0; i < niz.length; i++){
            niz[i] = sc.next();
        }

        System.out.println(nizImena(niz));

    }

    public static boolean nizImena(String [] x) {
        boolean ime = false;
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals("Marija")) {
                System.out.println("U nizu postoji ime Marija.");
                ime = true;
            } else if (x[i].equals("Petar")) {
                System.out.println("U nizu postoji ime Petar.");
                ime = true;
            }
        }
        if (ime == false) {
            System.out.println("U nizu nema imena Marija ili Petar.");
        }
        return ime;
    }
}