package Kaarten;

import java.util.Random;

public class Bank {
    String gebruikerInvoer;

    void SchudKaarten() {
        Kaarten schudden = new Kaarten();
        Random random = new Random();
        int random1 = random.nextInt(13);
        int random2 = random.nextInt(3);

        if (this.gebruikerInvoer.equals("Y")) {
            schudden.toonalles = true;
            schudden.MaakKaartenSet();
        } else if (this.gebruikerInvoer.equals("Schudden")) {
            schudden.randomNummer = random1;
            schudden.randomType = random2;
            schudden.MaakKaartenSet();
        }
    }

    void Bankaarten() {

    }
}