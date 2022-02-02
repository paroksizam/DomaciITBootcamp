package CetvrtaNedelja17_12Domaci;

import java.util.Scanner;

public class ProsecnaVrednostNizaZadatak41 {
    public static void main(String[] args) {

        //Napisati funkciju koja racuna prosecnu vrednost double[] niza.

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite duzinu niza: ");
        double [] niz = new double[sc.nextInt()];

        System.out.println("Unesite elemente niza double vrednosti: ");
        for(int i = 0; i < niz.length; i++){
            niz[i] = sc.nextDouble();
        }

        System.out.print("Prosecna vrednost navedenog niza je: " + prosekNiza(niz));

    }

    public static double prosekNiza (double[] x){
        double suma = 0;
        for(int i = 0; i < x.length; i++){
            suma = suma + x[i];
        }
        double prosek = suma / x.length;
        return prosek;
    }

}
