package PetaNedeljaKlaseUvod.Domaci;

public class Trougao {

    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public Trougao(double stranicaA, double stranicaB, double stranicaC) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaC(double stranicaC) {
            this.stranicaC = stranicaC;
    }

    public double obim(){
        double o = stranicaA + stranicaB + stranicaC;
        return o;
    }

    public double povrsina(){
        double s = (stranicaA + stranicaB + stranicaC) / 2;
        double p = Math.sqrt(s * (s - stranicaA) * (s - stranicaB) * (s - stranicaC));
        return p;
    }

    public String toString(){
        /*String vraceniString;
        vraceniString = "Duzina stranice a je: " + stranicaA + "\n";
        vraceniString += "Duzina stranice b je: " + stranicaB + "\n";
        vraceniString += "Duzina stranice c je: " + stranicaC + "\n";
        return vraceniString;*/

        StringBuilder sb = new StringBuilder();

        sb.append("Duzina stranice a je: " + stranicaA + "\n");
        sb.append("Duzina stranice b je: " + stranicaB + "\n");
        sb.append("Duzina stranice c je: " + stranicaC + "\n");

        return sb.toString();

    }

}
