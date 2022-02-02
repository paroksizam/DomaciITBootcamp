package Pauza1Domaci;

import java.util.Scanner;

public class PetljaZadatak4 {
    public static void main(String[] args) {

        //Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.

        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite negativan ceo broj: ");
        int n = sc.nextInt();

        for(int i = 0; i >= n; i--){
            System.out.println(i);
        }

    }
}
