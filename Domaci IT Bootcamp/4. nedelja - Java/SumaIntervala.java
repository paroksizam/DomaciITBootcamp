package Pauza1Domaci;

import java.util.Scanner;

public class SumaIntervalaZadatak2 {
    public static void main(String[] args) {

        //Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n].

        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite zeljeni ceo broj: ");
        int m = sc.nextInt();

        System.out.print("Unesite zeljeni veci broj koji je veci ili jednak sa prvim unetim: ");
        int n = sc.nextInt();

        int suma = 0;
        for(int i = m; i <= n; i++){
            suma = suma + i;
        }
        System.out.print("Suma brojeva je: " + suma);


    }
}
