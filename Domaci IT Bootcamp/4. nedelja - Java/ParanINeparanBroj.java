package Pauza1Domaci;

import java.util.Scanner;

public class ParanINeparanBrojZadatak1 {
    public static void main(String[] args) {

        //Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.

        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite zeljeni broj: ");
        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("Broj je paran.");
        }else{
            System.out.println("Broj je neparan.");
        }


    }
}
