package TrecaNedelja30_11Uvod.Domaci;

import java.util.Scanner ;

public class Grananja1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // provera da li je uneti broj paran

        System.out.print("Unesite zeljeni broj: ");
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("Broj je paran!");
        }
        else {
            System.out.println("Broj je neparan!");
        }

    }
}
