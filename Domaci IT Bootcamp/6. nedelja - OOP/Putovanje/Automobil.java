package PetaNedeljaKlaseUvod.DomaciArrayList;

public class Automobil {

    //Napisati klasu Automobil, koja treba da ima sledece atribure: marka, zemljaProizvodnje, godiste, kilometrzu.
    //Napisati test program u kome treba napraviti 2 automobila, i ispisati ih na izlaz

    private String marka;
    private String zemljaProizvodnje;
    private int godiste;
    private double kilometraza;

    Automobil (String marka1, String zemljaProizvodnje1, int godiste1, double kilometraza1){
        marka = marka1;
        zemljaProizvodnje = zemljaProizvodnje1;
        godiste = godiste1;
        kilometraza = kilometraza1;
    }

    public String getMarka(){
        return marka;
    }
    public void setMarka(String marka1){
        marka = marka1;
    }

    public String getZemljaProizvodnje(){
        return zemljaProizvodnje;
    }
    public void setZemljaProizvodnje(String zemljaProizvodnje1){
        zemljaProizvodnje = zemljaProizvodnje1;
    }

    public int getGodiste(){
        return godiste;
    }
    public void setGodiste(int godiste1){
        godiste = godiste1;
    }

    public double getKilometraza(){
        return kilometraza;
    }
    public void setKilometraza(double kilometraza1){
        kilometraza = kilometraza1;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Marka: ");
        sb.append(marka);
        sb.append("\n");

        sb.append("Zemlja proizvodnje: ");
        sb.append(zemljaProizvodnje);
        sb.append("\n");

        sb.append("Godiste: ");
        sb.append(godiste);
        sb.append("\n");

        sb.append("Kilometraza: ");
        sb.append(kilometraza);
        sb.append("\n");

        return sb.toString();
    }

}
