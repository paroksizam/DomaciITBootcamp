package PetaNedeljaKlaseUvod.Domaci;

public class Voznja {
    public static void main(String[] args) {

        Automobil prviAuto = new Automobil("BMW", "X3", 65235, "Petar Petrovic");
        System.out.println(prviAuto.getMarka());
        System.out.println(prviAuto.getModel());
        System.out.println(prviAuto.getSerijskiBroj());
        System.out.println(prviAuto.getVlasnik());

        Automobil drugiAuto = new Automobil("Fiat", "Panda", 58654, "Milica Ilic");
        System.out.println(drugiAuto.getMarka());
        System.out.println(drugiAuto.getModel());
        System.out.println(drugiAuto.getSerijskiBroj());
        System.out.println(drugiAuto.getVlasnik());

        drugiAuto.setVlasnik("Milena Markovic");
        System.out.println("Novi vlasnik/ca auta je: " + drugiAuto.getVlasnik());

    }
}
