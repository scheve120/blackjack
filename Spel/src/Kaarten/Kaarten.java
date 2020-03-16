package Kaarten;

import java.util.ArrayList;
import java.util.Random;
// ToDO Met de arrays oefenen.

public class Kaarten {

    /*
        Deze maakt de kaarten set.
    */
    static void MaakKaartenSet(int randomtype, int randomwaarde, String toonalles) {
    /*
        Deze instances maken de kaarten arrays aan.
    */
        ArrayList<Kaart> kaarten = new ArrayList<Kaart>();
        ArrayList<Kaart> kaartType = new ArrayList<Kaart>();

        kaartType.add(new Kaart("Harten"));
        kaartType.add(new Kaart("Schoppen"));
        kaartType.add(new Kaart("Klaver"));
        kaartType.add(new Kaart("Ruiten"));

        for (int i = 2; i <= 10; i++) {
            kaarten.add(new Kaart(i));
        }

        kaarten.add(new Kaart('J'));
        kaarten.add(new Kaart('Q'));
        kaarten.add(new Kaart('K'));
        kaarten.add(new Kaart('Ä'));

        if (randomwaarde <= 8) {
            System.out.println("Dit is uw kaart: "+ kaartType.get(randomtype).type + " " + kaarten.get(randomwaarde).waarde);
            System.out.println(" ");
            System.out.println(randomwaarde);
        } else if (randomwaarde >= 9) {
            System.out.println("Dit is uw kaart: " + kaartType.get(randomtype).type + " " + kaarten.get(randomwaarde).hogekaarten);
            System.out.println(" ");
            System.out.println(randomwaarde);
        }

    }

    /*
        ToonKaartenSet Kan je de huidige kaarten deck zien of tonen.
    */
    static void ToonKaartenSet() {
        Random random = new Random();
        int random1 = random.nextInt(13);
        int random2 = random.nextInt(3);
        MaakKaartenSet(random2,random1,"");
    }

    public static void main(String[] args) {
        ToonKaartenSet();
    }
}

class Kaart{
    String type;
    int waarde;
    char hogekaarten;
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

    Kaart(char hogekaarten) {
        this.hogekaarten = hogekaarten;
    }
}