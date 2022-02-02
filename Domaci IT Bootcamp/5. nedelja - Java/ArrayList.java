package SestaNedelja.Domaci27_12;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

    /*2. Array liste
    Kreirajte array listu nekog vaseg interesovanje (npr sport)
-u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
-iz liste dohvatite 3. element liste i ispisite
-promenite naziv prvog elementa
-uklonite 5. element
-ispisite velicinu vase liste
-pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste*/

        ArrayList<String> film = new ArrayList<String>();
        film.add("20th century women");
        film.add("Volver");
        film.add("The Diary of a Teenage Girl");
        film.add("Only lovers left alive");
        film.add("Die Welle");
        film.add("Cinema Paradiso");

        System.out.println("3. element liste je " + film.get(2) + "\n");

        //1. element je sada:
        film.set(0, "Victoria");

        //5. element je sada obrisan:
        film.remove(4);

        System.out.println("Lista ima " + film.size() + " elemenata\n");

        //prvi nacin
        for(int i = 0; i < film.size(); i++){
            System.out.println(film.get(i));
        }

        System.out.println();

        //drugi nacin
        for(String f : film){
            System.out.println(f);
        }

    }
}
