package PetaNedeljaKlaseUvod.Domaci;

import java.util.Scanner;

public class TestTrougao {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Unesite dimenzije stranice a: ");
        double a = sc.nextDouble();

        System.out.println("Unesite dimenzije stranice b: ");
        double b = sc.nextDouble();

        System.out.println("Unesite dimenzije stranice c: ");
        double c = sc.nextDouble();

        Trougao tr = new Trougao(a,b,c);

        System.out.println(tr);
        System.out.println("Obim trougla = " + tr.obim() + " cm");
        System.out.println("Povrsina trougla = " + tr.povrsina() + " cm");

    }
}
