package Pauza1Domaci;

import java.util.Scanner;

public class PetljaZadatak3 {
    public static void main(String[] args) {

        //Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.

        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite ceo pozitivan broj: ");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            System.out.println(i);
        }

    }
}
