package Kaarten;

import java.util.ArrayList;

// ToDO Met de arrays oefenen.

public class Kaarten {

    public static void main(String[] args) {
        ArrayList<Kaart> kaarten = new ArrayList<Kaart>();
        ArrayList<Kaart> kaartType = new ArrayList<Kaart>();
        ArrayList<Kaart> hogeKaarten = new ArrayList<Kaart>();
        kaartType.add(new Kaart("Harten"));
        kaartType.add(new Kaart("Schoppen"));
        kaartType.add(new Kaart("Klaver"));
        kaartType.add(new Kaart("Ruiten"));
        /*
        System.out.println(kaartType.get(1).type);
        System.out.println(kaarten.get(1).type + kaarten.get(1).waarde);
        */
        for (int i = 2; i <= 10; i++) {
            kaarten.add(new Kaart(i));
        }
        kaarten.add(new Kaart('J'));
        kaarten.add(new Kaart('Q'));
        kaarten.add(new Kaart('K'));
        kaarten.add(new Kaart('Ä'));

        for(int i = 0; i < kaartType.size(); i++) {
            for(int e = 0; e < kaarten.size(); e++) {
                System.out.println("Test of deze enhanced for loop werkt " + kaartType.get(i).type + " " + kaarten.get(e).waarde);
            }
        }
    }
}


class Deck {
    ArrayList<Kaart> kaarten;
//    ArrayList<int> waarde;

    Deck(ArrayList<Kaart> kaarten) {
        this.kaarten = kaarten;
    }
}

class Kaart{
    String type;
    int waarde;

    Kaart(String type, int waarde) {
        this.type = type;
        this.waarde = waarde;
    }
    Kaart(String type) {
        this.type = type;
    }
    Kaart(int waarde) {
        this.waarde = waarde;
    }
}