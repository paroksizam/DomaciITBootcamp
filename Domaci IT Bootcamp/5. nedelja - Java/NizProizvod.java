package CetvrtaNedelja14_12Funkcije.Domaci;

import java.util.Scanner;

public class NizProizvodZadatak30 {
    public static void main(String[] args) {

        /*Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
        Izracunati proizvod elemenata tog niza.
                Primer: [2, 4] -> 8
        30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.*/

        Scanner sc = new Scanner(System.in);

        int[] nizBrojeva = new int [3];
        System.out.println("Unesite 3 broja: ");
        for(int i = 0; i < nizBrojeva.length; i++){
            nizBrojeva[i] = sc.nextInt();
        }
        System.out.println("Proizvod je: " + mnozenje(nizBrojeva));

    }

    public static int mnozenje(int[]x){
        int suma = 1;
        for(int i = 0; i < x.length; i++){
            suma = suma * x[i];
        }
        return suma;
    }
}
