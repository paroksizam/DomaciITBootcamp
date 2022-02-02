package TrecaNedelja30_11Uvod.Domaci;

import java.util.Scanner ;

public class Sintaksa1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // racunanje povrsine okrecene prostorije tako sto se ivice ucitavaju preko konzole

        System.out.print("Unesite sirinu sireg zida u metrima: ");
        float sirina1 = scanner.nextFloat();

        System.out.print("Unesite sirinu uzeg zida u metrima: ");
        float sirina2 = scanner.nextFloat();

        System.out.print("Unesite visinu zidova u metrima: ");
        float visina = scanner.nextFloat();

        float okrecenaPovrsina = 2 * (sirina1 * visina + sirina2 * visina) + sirina1 * sirina2;
        System.out.print("Povrsina okrecenih zidova i plafona je: " + okrecenaPovrsina + " m2");

    }
}
