package SestaNedelja.Domaci27_12;

import java.util.ArrayList;

public class DuplaPetlja1 {
    public static void main(String[] args) {

    /*U konzolu ispisati dane (dan 1, dan 2...dan 7) za 3 nedelje
            (Primer ispisa:
                    Week: 1
                    Day: 1
                    Day: 2
                    Day: 3 //sve do Day: 7
                    Week: 2
                    Day: 1
                    Day: 2
                    Day: 3.......
                    Week: 3
                    Day: 1
                    Day: 2
                    Day: 3......)*/

        ArrayList<String> nedelje = new ArrayList<String>();
        nedelje.add("Week: 1");
        nedelje.add("Week: 2");
        nedelje.add("Week: 3");

        ArrayList<String> dani = new ArrayList<String>();
        dani.add("Day: 1");
        dani.add("Day: 2");
        dani.add("Day: 3");
        dani.add("Day: 4");
        dani.add("Day: 5");
        dani.add("Day: 6");
        dani.add("Day: 7");

        for(String n : nedelje){
            System.out.println(n);
            for(String d : dani){
                System.out.println(d);
            }
        }

    }

}
