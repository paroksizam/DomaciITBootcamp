package TrecaNedelja3_12Petlje.Domaci;

import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {

        /*Za uneti celobrojni nenegativan broj n, ispisati za sve brojeve od 1 do i zakljucno sa n nisku "Fizz"
        ako je on deljiv sa 3, nisku "Buzz" ako je on deljiv sa 5, a nisku "FizzBuzz" ako je on deljiv i sa 3 i sa 5.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite celobrojni nenegativan broj: ");
        int n = sc.nextInt();

        int i = 0;

        for (int x = 1; x <= n; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                i = i + 1;
                System.out.println(x + ": FizzBuzz");
            }
            else if (x % 5 == 0) {
                i = i + 1;
                System.out.println(x + ": Buzz");
            }
            else if (x % 3 == 0) {
                i = i + 1;
                System.out.println(x + ": Fizz");
            }
            else {
                System.out.println(x + ":");
            }
        }
    }
}