package CetvrtaNedelja14_12Funkcije.Domaci;

public class Proizvod3BrojaZadatak31 {
    public static void main(String[] args) {

        //Napisati funkciju koja racuna proizvod 3 broja.

        System.out.println("Proizvod je: " + mnozenje(2,3,5));

    }

    public static int mnozenje(int x, int y, int z){
        int proizvod = x * y * z;
        return proizvod;
    }
}
