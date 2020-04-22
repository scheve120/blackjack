package Kaarten;

import javax.swing.*;
import java.util.ArrayList;

// ToDO Met de arrays oefenen.

public class Kaarten {
    int randomNummer;
    int randomType;
    boolean toonalles;

    /*
        Deze maakt de kaarten set.
    */
    void MaakKaartenSet() {

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

        if (this.toonalles) {
            for (Kaart type : kaartType) {
                for (Kaart waarde : kaarten) {
                  //  System.out.println(waarde.hogekaarten + type.type);
                     if (waarde.waarde >= 2 && waarde.waarde <=10) {
                         System.out.println("nummers " + waarde.waarde + type.type); // n2 2 tm 10
                     }
                    if (waarde.waarde < 2 ) {
                        System.out.println("hoge kaarten" + waarde.hogekaarten + type.type); // Joker,Queen,H,A
                    }
                }
            }
        } else if(this.randomNummer <= 8) {
                System.out.println("Dit is uw kaart: "+ kaartType.get(this.randomType).type + " " + kaarten.get(this.randomNummer).waarde);
                System.out.println(" ");
                System.out.println(this.randomNummer);
            } else if (this.randomNummer >= 9) {
                System.out.println("Dit is uw kaart: " + kaartType.get(this.randomType).type + " " + kaarten.get(this.randomNummer).hogekaarten);
                System.out.println(" ");
                System.out.println(this.randomNummer);
            }
        }

    /*
        ToonKaartenSet Kan je de huidige kaarten deck zien of tonen.
    */
    static void ToonKaartenSet() {

    }

    /*
        Deze main zal later als een normale methode gaan functioneren.
        Om later de uitgedeelde kaarten uit de array te halen zo dat ze niet in een ronde nog een x getrokken kunnen worden.
     */
    public static void main(String[] args) {
//        Bank toonKaarten = new Bank();
//        toonKaarten.SchudKaarten();


        Speler gebruikertest = new Speler();
        gebruikertest.SpelerActies();
    }
}

