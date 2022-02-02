package Pauza1Domaci;

import java.util.Scanner;

public class NaizmenicnaSumaZadatak3 {
    public static void main(String[] args) {

        /*Korisnik unosi vrednost broja n (int) sa konzole. Na standardni izlaz ispisati resenje izraza:
        1 - 2 + 3 - .... (+/-) n.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite zeljeni ceo broj: ");
        int n = sc.nextInt();

        int suma = 0;
        for(int i = 1; i <= n; i++){
            if (i % 2 == 0) {
                suma = suma - i;
            }else{
                suma = suma + i;
            }
        }
        System.out.println("Resenje je: " + suma);

    }
}
