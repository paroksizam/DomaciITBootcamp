package CetvrtaNedelja14_12Funkcije.Domaci;

import java.util.Scanner;

public class NizObrnutoZadatak29 {
    public static void main(String[] args) {

        /*Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
        Ispisati svaki treci element u obrnutom redosledu.
                Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
        29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.*/

        Scanner sc = new Scanner(System.in);

        int[] nizBrojeva = new int[sc.nextInt()];
        System.out.println("Unesite niz brojeva: ");
        for(int i = 0; i < nizBrojeva.length; i++){
            nizBrojeva[i] = sc.nextInt();
        }

        niz(nizBrojeva);
    }

    public static void niz(int[]x){
        for(int i = x.length - 1; i > 0; i = i - 3) {
            System.out.println(x[i]);
        }
    }
}
