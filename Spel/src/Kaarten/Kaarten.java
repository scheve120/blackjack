package Kaarten;

import java.util.ArrayList;
import java.util.Random;
// ToDO Met de arrays oefenen.

public class Kaarten {


    /*
        Deze maakt de kaarten set.
    */
    void MaakKaartenSet() {
    /*
        Deze instances maken de kaarten arrays aan.
    */
        ArrayList<Kaart> kaarten = new ArrayList<Kaart>();
        ArrayList<Kaart> kaartType = new ArrayList<Kaart>();
        ArrayList<Kaart> hogeKaarten = new ArrayList<Kaart>();

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

    }

    /*
        ToonKaartenSet Kan je de huidige kaarten deck zien of tonen.
    */
    public void ToonKaartenSet() {
        
        for (Kaart nummer : MaakKaartenSet) {
            for (Kaart soort : MaakKaartenSet) {

                System.out.println("test of de kaart type 1 omhoog gaat. " + soort.type + nummer.waarde);
                System.out.println("test of de kaart type 1 omhoog gaat. " + soort.type + nummer.hogekaarten);

            }
        }

        Random random = new Random();
        int random1 = random.nextInt(13);
        int random2 = random.nextInt(3);

        if (random1 <= 8) {
            System.out.println("Random1 lage kaarten == "+ kaarten.get(random1).waarde + " En random2 == " + kaartType.get(random2).type);
        } else if (random1 >= 9) {
            System.out.println("Random1 hogekaart == " + kaarten.get(random1).hogekaarten + " En random2 == " + kaartType.get(random2).type);
        }
    }

    public static void main(String[] args) {
        Kaarten toonkaarten = new Kaarten();
        toonkaarten.MaakKaartenSet();

        /*
        Hier wordt er een random nummer gegeven die vervolgens een kaart pakt.
        Deze zal in de dealer/bank class worden gebruikt.
         */


        /*
        Hier wordt er gekeken of de random lager of gelijk is aan index nummer 8 voor kaart nummer 10.
        Als deze hoger is dan worden de hoge kaarten: Boer, Vrouw, Koning, Ä getrokken.
        */

/*
        if (random1 <= 8) {
            System.out.println("Random1 lage kaarten == "+ kaarten.get(random1).waarde +
                                " En random2 == " + kaartType.get(random2).type);
            System.out.println(" ");
            System.out.println(random1);
        } else if (random1 >= 9) {
            System.out.println("Random1 hogekaart == " + kaarten.get(random1).hogekaarten +
                                " En random2 == " + kaartType.get(random2).type);
            System.out.println(" ");
            System.out.println(random1);
        }

 */
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