package PetaNedeljaKlaseUvod.Domaci;

import java.util.Scanner;

public class KreiranjeSportista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime i prezime prvog sportiste: ");
        String imePrezime = sc.nextLine();
        System.out.println("Unesite sport kojim se bavi: ");
        String sport = sc.nextLine();
        System.out.println("Unesite klub za koji igra: ");
        String klub = sc.nextLine();
        System.out.println("Unesite broj na dresu koji nosi: ");
        int dres = sc.nextInt();

        Sportista prviProfil = new Sportista(imePrezime, sport, klub, dres);

        sc.nextLine();
        System.out.println("Unesite ime i prezime drugog sportiste: ");
        String imePrezime2 = sc.nextLine();
        System.out.println("Unesite sport kojim se bavi: ");
        String sport2 = sc.nextLine();
        System.out.println("Unesite klub za koji igra: ");
        String klub2 = sc.nextLine();
        System.out.println("Unesite broj na dresu koji nosi: ");
        int dres2 = sc.nextInt();

        Sportista drugiProfil = new Sportista(imePrezime2, sport2, klub2, dres2);

        sc.nextLine();
        System.out.println("Unesite ime i prezime treceg sportiste: ");
        String imePrezime3 = sc.nextLine();
        System.out.println("Unesite sport kojim se bavi: ");
        String sport3 = sc.nextLine();
        System.out.println("Unesite klub za koji igra: ");
        String klub3 = sc.nextLine();
        System.out.println("Unesite broj na dresu koji nosi: ");
        int dres3 = sc.nextInt();

        Sportista treciProfil = new Sportista(imePrezime3, sport3, klub3, dres3);

        System.out.println(prviProfil.getImePrezime());
        System.out.println(prviProfil.getSport());
        System.out.println(prviProfil.getKlub());
        System.out.println(prviProfil.getDres());

        System.out.println(drugiProfil.getImePrezime());
        System.out.println(drugiProfil.getSport());
        System.out.println(drugiProfil.getKlub());
        System.out.println(drugiProfil.getDres());

        System.out.println(treciProfil.getImePrezime());
        System.out.println(treciProfil.getSport());
        System.out.println(treciProfil.getKlub());
        System.out.println(treciProfil.getDres());

        sc.nextLine();
        System.out.println("Unesite novo ime kluba treceg sportiste: ");
        String noviKlub3 = sc.nextLine();
        treciProfil.setKlub(noviKlub3);

        System.out.println("Unesite broj dresa u novom klubu: ");
        int noviDres3 = sc.nextInt();
        treciProfil.setDres(noviDres3);

        System.out.println("Novi klub treceg sportiste je " + treciProfil.getKlub() + ", a broj dresa je " + treciProfil.getDres());

    }
}
