package Pauza1Domaci;

import java.util.Scanner;

public class PetljaZadatak6 {
    public static void main(String[] args) {

        //Ispisati proizvod prvih n celih brojeva [1, n].

        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite zeljeni ceo broj: ");
        int n = sc.nextInt();

        int x = 1;
        for (int i = 1; i <= n ; i++) {
            x = x * i;
        }
        System.out.println("Proizvod prvih n brojeva je: " + x);

    }
}
