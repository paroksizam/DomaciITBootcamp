package Pauza1Domaci;

import java.util.Scanner;

public class PetljaZadatak5 {
    public static void main(String[] args) {

        //Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.

        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite neki pozitivan ceo broj: ");
        int n = sc.nextInt();

        for(int i = -14; i < (n * 2) + 1; i++){
            System.out.println(i);
        }

    }
}
