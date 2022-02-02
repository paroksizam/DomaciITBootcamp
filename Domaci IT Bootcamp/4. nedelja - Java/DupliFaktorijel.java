package Pauza1Domaci;

import java.util.Scanner;

public class DupliFaktorijelZadatak1 {
    public static void main(String[] args) {

        /*Napisati program koji racuna dupli faktorijel unetg broja n. Dupli faktorijel broja n je:
        n!! = n * (n-2) * (n-4) * ... * (2 ili 1)
        */

        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite zeljeni ceo broj: ");
        int n = sc.nextInt();

        int f = 1;
        if (n % 2 == 0){
            for(int i = n; i >= 2; i -= 2){
                f = f * i;
            }
        }
        else{
            for(int i = n; i >= 1; i -= 2){
                f = f * i;
            }
        }
        System.out.println("Dupli faktorijel ovog broja je: " + f);

    }
}
