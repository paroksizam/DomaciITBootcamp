package TrecaNedelja3_12Petlje.Domaci;

import java.util.Scanner;

public class Faktorijel3 {
    public static void main(String[] args) {

        /*Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
        Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1.
        Dakle, npr:
        5! = 5 * 4 * 3 * 2 * 1 = 120
        3! = 3 * 2 * 1 = 6
        */

        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite pozitivan ceo broj: ");
        int n = sc.nextInt();

        int f = 1;
        for (int i = 1; i <= n ; i++) {
            f = f * i;
        }
        System.out.println("Faktorijel ovog broja je: " + f);

    }
}
