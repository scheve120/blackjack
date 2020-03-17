package Kaarten;

import java.util.Random;

public class Bank {
    void SchudKaarten() {
        Kaarten schudden = new Kaarten();
        Random random = new Random();
        int random1 = random.nextInt(13);
        int random2 = random.nextInt(3);
        schudden.MaakKaartenSet();
        schudden.toonalles = true;
        schudden.MaakKaartenSet();

    }
    void Bankaarten() {

    }
}