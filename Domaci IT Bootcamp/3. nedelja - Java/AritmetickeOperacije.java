package TrecaNedelja3_12Petlje.Domaci;

import java.util.Scanner;

public class AritmetickeOperacije1 {
    public static void main(String[] args) {

        /*Na standardni ulaz se unose dva cela broja. Ispisati na standardnom izlazu u zasebnim redovima zbir,
        razliku, proizvod, kolicnik i ostatak deljenja prvog broja drugim tim redom
         */

        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite prvi celi broj: ");
        int a = sc.nextInt();

        System.out.print("Unesite drugi celi broj: ");
        int b = sc.nextInt();

        System.out.println("Zbir je " + (a + b));

        System.out.println("Razlika je " + (a - b));

        System.out.println("Proizvod je " + (a * b));

        System.out.println("Kolicnik je " + (a / b));

        System.out.println("Ostatak deljenja prvog broja drugim je " + (a % b));

    }
}
