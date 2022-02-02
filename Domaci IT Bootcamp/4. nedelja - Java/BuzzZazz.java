package Pauza1Domaci;

import java.util.Scanner;

public class BuzzZazzZadatak9 {
    public static void main(String[] args) {

        /*Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3,
         "Buzz" ako je deljiv sa 5, "Zazz" ako je deljiv sa 7
         i sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite ceo broj: ");
        int n = sc.nextInt();

        for (int x = 1; x <= n; x++) {
            if (x % 3 == 0 && x % 5 == 0 && x % 7 == 0) {
                System.out.println(x + ": BuzzZazz");
            } else if (x % 7 == 0) {
                System.out.println(x + ": Zazz");
            } else if (x % 5 == 0) {
                System.out.println(x + ": Buzz");
            } else if (x % 3 == 0) {
                System.out.println(x + ": Fizz");
            } else {
                System.out.println(x + ":");
            }
        }

    }
}
