package SestaNedelja.Domaci27_12.PrevoznoSredstvoDomaci;

public class TestPrevoznoSredstvo {
    public static void main(String[] args) {


        //Napisati test program u kome je potrebno kreirati 1 automobil, voz i autobus i ispisati njihovu sirenu.

        Automobil auto1 = new Automobil(2016, "Italija", "Fiat", "//", 900);
        Autobus bus1 = new Autobus(2019, "Nemacka", "Mercedes", 150);
        Voz voz1 = new Voz(2001, "Kina", "Stadler", 7);

        auto1.sirena();
        bus1.sirena();
        voz1.sirena();
    }
}
