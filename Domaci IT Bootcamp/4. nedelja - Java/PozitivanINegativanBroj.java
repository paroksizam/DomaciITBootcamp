package Pauza1Domaci;

import java.util.Scanner;

public class PozitivanINegativanBrojZadatak2 {
    public static void main(String[] args) {

        /*Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0, "Negativan" ako je strogo manji od 0
    ili "Neutralan" ako je tacno 0.*/

        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite zeljeni broj: ");
        int x = sc.nextInt();

        if(x == 0){
            System.out.println("Broj je neutralan");
        }else if(x < 0){
            System.out.println("Broj je negativan");
        }else{
            System.out.println("Broj je pozitivan");
        };

    }
}
