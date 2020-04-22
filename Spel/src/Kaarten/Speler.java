package Kaarten;

import java.util.ArrayList;
import java.util.Scanner;

public class Speler {

    void SpelerActies() {

        boolean bool = true;
        Scanner sc = new Scanner(System.in);
        Bank userController = new Bank();
        ArrayList<Kaarten> testArray = new ArrayList<Kaarten>();
        System.out.println(testArray.add(new MaakKaartenSet()));
/*
        do {
            System.out.println("Wil je de kaarten deck tonen? Type dan Ja/J of wil je gelijk kaarten schudden? zeg dan Schudden of S");
            String speler = sc.nextLine();
            if (speler.equals("Ja") || speler.equals("J")) {
                System.out.println("Ik zal je de kaarten deck laten zien");
                userController.gebruikerInvoer = "Y";
                userController.SchudKaarten();
                System.out.println("");
            }
            System.out.println("Wil je de kaarten schudden?");
            if (speler.equals("Schudden") || speler.equals('S')) {
                userController.gebruikerInvoer = "Schudden";
                userController.SchudKaarten();
            } else if (speler.equals("Stop") || speler.equals("S")) {
            System.out.println("Ok ik stop");
                bool = false;
            } else {
                System.out.println("Ik heb geen geldige invoer ontvangen.");
            }
        } while (bool == true);

 */
    }

    void SpelerKaarten() {

    }

}
