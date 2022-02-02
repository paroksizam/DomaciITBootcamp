package CetvrtaNedelja14_12Funkcije.Domaci;

import java.util.Scanner;

public class NizZadatak27 {
    public static void main(String[] args) {

        /*Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
        Ispisati svaki drugi element tog niza
        Primer: [1, 2, 3, 4, 5] -> 1 3 5
        27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.
         */

        Scanner sc = new Scanner(System.in);

        int[] nizBroj = new int[5];
        System.out.println("Unesite 5 brojeva: ");
        for (int i = 0; i < nizBroj.length; i++) {
            nizBroj[i] = sc.nextInt();
        }

        niz(nizBroj);
    }

    public static void niz(int[]x){
        for(int i = 0; i < x.length; i = i + 2){
            System.out.println(x[i]);
        }
    }
}

